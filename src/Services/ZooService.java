package Services;

import Animals.*;
import Employees.*;
import Logging.Logger;
import Utils.IDGenerator;
import Zoo.Zoo;

public class ZooService {
    private final Zoo zoo;
    private final Logger logger;

    public ZooService(Zoo zoo, IDGenerator animalIdGen, IDGenerator employeeIdGen, Logger logger) {
        this.zoo = zoo;
        this.logger = logger;
    }

    public void addAnimal(Animal animal) {
        if (zoo.hasAnimalWithId(animal.id())) {
            logger.info("Животное с ID " + animal.id() + " уже существует.");
            return;
        }
        zoo.addAnimal(animal);
        logger.info("В зоопарк поступило новое животное: " + animal);
        animal.markAsHealthChecked();
        logger.info(animal.type() + " по имени " + animal.name() + " прошёл первичную проверку у ветеринара.");
    }

    public void addEmployee(Employee employee) {
        if (zoo.hasEmployeeWithId(employee.id())) {
            logger.info("Работник с ID " + employee.id() + " уже существует.");
            return;
        }
        zoo.addEmployee(employee);
        logger.info("В зоопарк принят новый работник: " + employee);
    }

    public void cleanAnimal(Animal animal, Cleaner cleaner) {
        if (!animal.isCleaned()) {
            cleaner.cleanRoom(animal);
            logger.info("Проведена очистка у животного: " + animal.type() + " " + animal.name());
        }
    }

    public void feedAnimal(Animal animal, Feeder feeder) {
        if (!animal.isFeeded()) {
            feeder.giveAFood(animal);
            logger.info("Покормлено животное: " + animal.type() + " " + animal.name());
        }
    }

    public void healAnimal(Animal animal, Healer healer) {
        if (!animal.isHealed()) {
            healer.healAnimal(animal);
            logger.info("Ветеринаром осмотрено животное: " + animal.type() + " " + animal.name());
        }
    }
}
