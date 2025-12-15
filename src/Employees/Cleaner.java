package Employees;

import Animals.Cleanable;

public class Cleaner extends Employee{
    static final String CLEANER_TYPE = "Уборщик";

    public Cleaner(String name) {
        super(CLEANER_TYPE, name);
    }

    public void cleanRoom(Cleanable animal) {
        animal.clean();
    }
}
