import Animals.Animal;
import Employees.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zoo {
    private List<Animal> animals;
    private List<Employee> employees;
    private final String name;

    public Zoo(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public String name() {return this.name;}
    public void addAnimal(Animal animal) {
        boolean alreadyExists = animals.stream()
                .anyMatch(existing -> Objects.equals(existing.id(), animal.id()));
        if (!alreadyExists) {
            System.out.printf("В зоопарк поступило новое животное: %s.%n", animal);
            animals.add(animal);
            animal.checkHealthFirstVisit();
        }
    }

    public void addEmployee(Employee employee) {
        boolean alreadyExists = employees.stream()
                .anyMatch(existing -> Objects.equals(existing.id(), employee.id()));
        if (!alreadyExists) {
            employees.add(employee);
        }
    }

    public List<Animal> animals() {
        return List.copyOf(animals);
    }

    public List<Employee> employees() {
        return List.copyOf(employees);
    }
}
