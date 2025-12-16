package Employees;

import Animals.Animal;

public class Healer extends Employee{
    static final String HEALER_TYPE = "Ветеринар";

    public Healer(Integer id, String name) {
        super(id, HEALER_TYPE, name);
    }

    public void healAnimal(Animal animal) {
        animal.heal();
    }

    public void makeFirstHealthCheck(Animal animal) {
        animal.markAsHealthChecked();
    }
}
