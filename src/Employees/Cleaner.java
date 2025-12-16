package Employees;

import Animals.Animal;

public class Cleaner extends Employee{
    static final String CLEANER_TYPE = "Уборщик";

    public Cleaner(Integer id, String name) {
        super(id, CLEANER_TYPE, name);
    }

    public void cleanRoom(Animal animal) {
        animal.clean();
    }
}
