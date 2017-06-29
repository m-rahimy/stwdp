package ir.mrgkrahimy.threadnotifytest.product;

/**
 * Created by Mojtaba on 6/29/2017.
 */
public class Samand extends Car {

    public Samand(int id){
        super(id);
    }
    @Override
    public String name() {
        return "Samand";
    }

    @Override
    public float price() {
        return 960.9f;
    }

    @Override
    public int millisToProduce() {
        return super.millisToProduce() + 50;
    }

}
