package ir.mrgkrahimy.threadnotifytest.product;

import java.util.Random;

/**
 * Created by Mojtaba on 6/29/2017.
 */
public class ProductBuilder {

    private int id = 1111;
    public ProductBuilder(){

    }

    public Product produceSamand(){
        Product p = new Samand(id++);
        return p;
    }

    public Product produceLamborgini(){
        Product p = new  Lamborgini(id++);
        return p;
    }

    public Product produceBMW(){
        Product p = new BMW(id++);
        return p;
    }

    public Product produceRandom(){
        Product p = null;
        switch (new Random().nextInt(3)){
            case 0:
                p= produceSamand();
                break;
            case 1:
                p= produceLamborgini();
                break;
            case 2:
                p= produceBMW();
                break;
        }
        return p;
    }
}
