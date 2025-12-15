package Employees;

import Animals.Healable;

public class Healer extends Employee{
    static final String HEALER_TYPE = "Ветеринар";

    public Healer(String name) {
        super(HEALER_TYPE, name);
    }

    public void healAnimal(Healable animal) {
        animal.heal();
    }

    public void makeFirstHealthCheck(Healable animal) {
        animal.checkHealthFirstVisit();
    }
}
