package Employees;

public abstract class Employee implements IEmployeeInfoProvider {
    private static Integer nextId = 1;
    protected final Integer id;
    protected String type;
    protected String name;

    protected Employee(String type, String name) {
        this.type = type;
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    //Employees.IEmployeeInfoProvider implementation
    public String type() {return this.type;}
    public String name() {return this.name;}

    public Integer id() {return id;}

    @Override
    public String toString() {
        return String.format("Работник. Должность: %s. Имя: %s.", type(), name());
    }
}
