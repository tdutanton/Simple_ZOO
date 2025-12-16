import Animals.*;
import Employees.*;
import Logging.*;
import Reporting.ReportGenerator;
import Services.ZooService;
import Utils.*;
import Zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Logger logger = new ConsoleLogger();
        IDGenerator animalIdGen = new SequentialIDGenerator();
        IDGenerator employeeIdGen = new SequentialIDGenerator();

        Zoo zoo = new Zoo("Московский зоопарк");
        ZooService zooService = new ZooService(zoo, animalIdGen, employeeIdGen, logger);
        ReportGenerator reporter = new ReportGenerator(logger);

        Animal lion = new Lion(animalIdGen.nextId(), "Симба", 5, 14, "3 раза в день");
        Animal turtle = new Turtle(animalIdGen.nextId(), "Черепавел", 368, 24.6F, "Один раз в день в 09-00");
        Animal owl = new Owl(animalIdGen.nextId(), "Совунья", 30, 4.5F, "Один раз в день в 20-00");

        zooService.addAnimal(lion);
        zooService.addAnimal(turtle);
        zooService.addAnimal(owl);

        Employee f = new Feeder(employeeIdGen.nextId(), "Иван");
        Employee h = new Healer(employeeIdGen.nextId(), "Айболит");
        Employee c = new Cleaner(employeeIdGen.nextId(), "Мария");
        zooService.addEmployee(f);
        zooService.addEmployee(h);
        zooService.addEmployee(c);

        reporter.generateZooReport(zoo);
    }
}
