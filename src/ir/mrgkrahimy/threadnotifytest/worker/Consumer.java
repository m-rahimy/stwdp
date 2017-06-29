package ir.mrgkrahimy.threadnotifytest.worker;

/**
 * Created by Mojtaba on 6/29/2017.
 */
public class Consumer extends Thread {

    Producer producer;

    public Consumer(Producer producer){
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true){
            try {
                int w = 1000;//new Random().nextInt(1000);
                System.out.println("(Consumer) : will take "+ w + " millis to get something");
                sleep(w);
                System.out.println("(Consumer) : took "+ w + " millis to get something");
                System.out.println("(Consumer) : got " + producer.get().toJson());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
