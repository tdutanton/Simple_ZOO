import Animals.Animal;
import Animals.Lion;
import Animals.Owl;
import Employees.Feeder;

public class Main {
    public static void main(String[] args) {
        Zoo z = new Zoo("Great zoo");

        Animal lion = new Lion("SH", 15, 16, "asdas");
        Animal owl = new Owl("HUHU", 2, 4, "ASDASD");
        System.out.println(lion.id());
        System.out.println(owl.id());
        Feeder f = new Feeder("John");

        z.addAnimal(lion);
        z.addAnimal(owl);
        z.addEmployee(f);

        ReportGenerator r = new ReportGenerator();
        r.generateZooReport(z);
    }
}
