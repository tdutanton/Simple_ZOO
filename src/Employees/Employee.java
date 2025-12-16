package Employees;

import Reporting.IEmployeeInfoProvider;

public abstract class Employee implements IEmployeeInfoProvider {
    protected final Integer id;
    protected final String type;
    protected final String name;

    protected Employee(Integer id, String type, String name) {
        this.type = type;
        this.name = name;
        this.id = id;
    }

    //Reporting.IEmployeeInfoProvider implementation
    public String type() {return this.type;}
    public String name() {return this.name;}

    public Integer id() {return id;}

    @Override
    public String toString() {
        return String.format("Работник. Должность: %s. Имя: %s.", type(), name());
    }
}
