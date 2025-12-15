import Animals.IAnimalInfoProvider;
import Employees.IEmployeeInfoProvider;

import java.util.List;

public class ReportGenerator {
    public void generateAnimalsReport(List <? extends IAnimalInfoProvider> animals) {
        String reportName = "Отчет по животным";
        System.out.println(reportName);
        System.out.println("=".repeat(reportName.length()));
        System.out.printf("Всего животных: %d%n", animals.size());
        for (var animal : animals) {
            System.out.println(animal);
        }
        System.out.println("== Конец отчета по животным ==");
    }

    public void generateEmployeesReport(List <? extends IEmployeeInfoProvider> employees) {
        String reportName = "Отчет по работникам";
        System.out.println(reportName);
        System.out.println("=".repeat(reportName.length()));
        System.out.printf("Всего работников: %d%n", employees.size());
        for (var employee : employees) {
            System.out.println(employee);
        }
        System.out.println("== Конец отчета по работникам ==");
    }

    public void generateZooReport(Zoo zoo) {
        String reportName = "Отчет по Зоопарку " + zoo.name();
        System.out.println("=".repeat(reportName.length()));
        System.out.println(reportName);
        System.out.println("=".repeat(reportName.length()));
        generateAnimalsReport(zoo.animals());
        generateEmployeesReport(zoo.employees());
    }
}
