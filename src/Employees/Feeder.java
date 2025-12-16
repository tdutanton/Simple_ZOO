package Employees;

import Animals.Animal;

public class Feeder extends Employee {
    static final String FEEDER_TYPE = "Кормильщик";

    public Feeder(Integer id, String name) {
        super(id, FEEDER_TYPE, name);
    }

    public void giveAFood(Animal animal) {
        animal.feed();
    }
}
