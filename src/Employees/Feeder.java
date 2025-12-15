package Employees;

import Animals.Feedable;

public class Feeder extends Employee {
    static final String FEEDER_TYPE = "Кормильщик";

    public Feeder(String name) {
        super(FEEDER_TYPE, name);
    }

    public void giveAFood(Feedable animal) {
        animal.feed();
    }
}
