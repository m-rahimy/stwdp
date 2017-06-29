package ir.mrgkrahimy.threadnotifytest.worker;

import ir.mrgkrahimy.threadnotifytest.product.Product;
import ir.mrgkrahimy.threadnotifytest.product.ProductBuilder;

import java.util.Stack;

/**
 * Created by Mojtaba on 6/29/2017.
 */
public class Producer extends Thread {

    private static final int MAX = 5;
    private Stack<Product> products = new Stack<Product>();
    private ProductBuilder productBuilder = new ProductBuilder();

    @Override
    public void run() {
            while (true){
                try {
                    put();
                    System.out.println("(Producer) : " + products.size()+ " products in line ");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    private synchronized void put() throws InterruptedException {
        while (products.size() == MAX){
            System.out.println("(Producer) : 'put()' : line is full, waiting for anyone to consume something");
            wait();
        }

        Product product = productBuilder.produceRandom();
        int w = product.millisToProduce();
        System.out.println(
                "(Producer) : will take "+ w + " millis to produce "+ product.type().type()+" "+ product.name());
        sleep(w);
        System.out.println("(Producer) : took "+ w + " millis to produce "+ product.type().type()+" "+ product.name());
        System.out.println("(Producer) : putting "+ product.toJson());
        products.add(product);
        notify();
    }

    public synchronized Product get() throws InterruptedException {
        notify();
        while (products.size()==0){
            System.out.println("(Consumer) : 'get()' : There is no product here, waiting for product to arrive");
            wait();
        }

        System.out.println("(Consumer) : "+ products.size() + " products in line");
        Product res=  products.pop();
        return res;

    }
}
