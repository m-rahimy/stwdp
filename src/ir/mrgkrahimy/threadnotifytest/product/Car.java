package ir.mrgkrahimy.threadnotifytest.product;

/**
 * Created by Mojtaba on 6/29/2017.
 */
public abstract class Car implements Product {

    int id ;
    public Car(int id){
        this.id=id;
    }
    @Override
    public Type type() {
        return new Vehicle();
    }

    @Override
    public abstract float price();

    @Override
    public int millisToProduce() {
        return millis + 200;
    }

    @Override
    public String toJson() {
        String builder = "{" +
                "\" id \" : \"" + id +
                " \" , " +
                "\" name \" : \"" + name() +
                " \" , " +
                "\" type \" : \"" + type().type() +
                " \" , " +
                "\" price \" : \"" + price() +
                " \" " +
                "}";

        return builder;
    }
}
