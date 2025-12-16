package Zoo;

import Animals.Animal;
import Employees.Employee;
import Reporting.IAnimalInfoProvider;
import Reporting.IEmployeeInfoProvider;

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
        animals.add(animal);
    }

    public void addEmployee(Employee employee) {
            employees.add(employee);
    }

    public List<IAnimalInfoProvider> animals() {
        return List.copyOf(animals);
    }

    public List<IEmployeeInfoProvider> employees() {
        return List.copyOf(employees);
    }

    public boolean hasAnimalWithId(Integer id) {
        return animals.stream().anyMatch(a -> Objects.equals(a.id(), id));
    }

    public boolean hasEmployeeWithId(Integer id) {
        return employees.stream().anyMatch(e -> Objects.equals(e.id(), id));
    }
}
