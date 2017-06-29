package ir.mrgkrahimy.threadnotifytest;

import ir.mrgkrahimy.threadnotifytest.worker.Consumer;
import ir.mrgkrahimy.threadnotifytest.worker.Producer;

public class Main {

    public static void main(String[] args) {

        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);
        consumer.start();
        producer.start();
    }
}


