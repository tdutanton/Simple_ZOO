public class Feeder extends Employee {
    static final String FEEDER_TYPE = "Ответственный за кормление";

    public Feeder(String name) {
        super(FEEDER_TYPE, name);
    }

    public void giveAFood(Feedable animal) {
        animal.feed();
    }
}
