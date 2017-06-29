package ir.mrgkrahimy.threadnotifytest.product;

/**
 * Created by Mojtaba on 6/29/2017.
 */
public class Lamborgini extends Car {

    public Lamborgini(int id) {
        super(id);
    }

    @Override
    public String name() {
        return "Lamborgini";
    }

    @Override
    public float price() {
        return 1810.99f;
    }

    @Override
    public Type type() {
        return new Vehicle();
    }

    @Override
    public int millisToProduce() {
        return super.millisToProduce() + 200;
    }
}
