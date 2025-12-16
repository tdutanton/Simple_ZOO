// reporting/ReportGenerator.java
package Reporting;

import Logging.Logger;

import java.util.List;

public class ReportGenerator {
    private final Logger logger;

    public ReportGenerator(Logger logger) {
        this.logger = logger;
    }

    public void generateAnimalsReport(List<IAnimalInfoProvider> animals) {
        String reportName = "Отчет по животным";
        logger.info(reportName);
        logger.info("=".repeat(reportName.length()));
        logger.info("Всего животных: " + animals.size());
        for (var animal : animals) {
            logger.info(animal.toString());
        }
        logger.info("== Конец отчета по животным ==");
    }

    public void generateEmployeesReport(List<IEmployeeInfoProvider> employees) {
        String reportName = "Отчет по работникам";
        logger.info(reportName);
        logger.info("=".repeat(reportName.length()));
        logger.info("Всего работников: " + employees.size());
        for (var employee : employees) {
            logger.info(employee.toString());
        }
        logger.info("== Конец отчета по работникам ==");
    }

    public void generateZooReport(Zoo.Zoo zoo) {
        String reportName = "Отчет по Зоопарку " + zoo.name();
        logger.info("=".repeat(reportName.length()));
        logger.info(reportName);
        logger.info("=".repeat(reportName.length()));
        generateAnimalsReport(zoo.animals());
        generateEmployeesReport(zoo.employees());
    }
}