package ir.mrgkrahimy.threadnotifytest.product;

/**
 * Created by Mojtaba on 6/29/2017.
 */
public class BMW extends Car {

    public BMW(int id) {
        super(id);
    }

    @Override
    public String name() {
        return "BMW";
    }

    @Override
    public float price() {
        return 2530.8f;
    }

    @Override
    public int millisToProduce() {
        return super.millisToProduce() + 300;
    }
}
