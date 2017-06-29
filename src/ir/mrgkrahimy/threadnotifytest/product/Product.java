package ir.mrgkrahimy.threadnotifytest.product;

/**
 * Created by Mojtaba on 6/29/2017.
 */
public interface Product {

    int millis = 100;
    public String name();
    public Type type();
    public float price();
    public String toJson();
    public int millisToProduce();
}
