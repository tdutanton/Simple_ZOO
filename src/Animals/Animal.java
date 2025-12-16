package Animals;

import Reporting.IAnimalInfoProvider;

public abstract class Animal implements IAnimalInfoProvider {
    protected final Integer id;
    protected final String type;
    protected final String name;
    protected final String feedSchedule;
    protected final Integer age;
    protected final float weight;
    protected boolean isHealthChecked;
    protected boolean isFeeded;
    protected boolean isCleaned;
    protected boolean isHealed;

    protected Animal(Integer id, String type, String name, Integer age, float weight, String feedSchedule) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feedSchedule = feedSchedule;
        this.isHealthChecked = false;
        this.isCleaned = false;
        this.isFeeded = false;
        this.isHealed = false;
    }

    public Integer id() {return id;}

    // Reporting.IAnimalInfoProvider implementation
    public String name() {
        return name;
    }
    public String type() {
        return type;
    }
    public String feedSchedule() {
        return feedSchedule;
    }
    public Integer age() {
        return age;
    }
    public float weight() {
        return weight;
    }
    public boolean isHealthChecked() {
        return isHealthChecked;
    }

    @Override
    public String toString() {
        return String.format("Животное. Тип (вид): %s. Имя: %s. Возраст: %d лет. Вес: %.2f кг.%n" +
                "Расписание кормления: %s", type(), name(), age(), weight(), feedSchedule());
    }

    public void markAsHealthChecked() {
        this.isHealthChecked = true;
    }

    public void feed() { isFeeded = true;}
    public void heal() {isHealed = true;}
    public void clean() {isCleaned = true;}

    public boolean isFeeded() {return isFeeded;}
    public boolean isCleaned() {return isCleaned;}
    public boolean isHealed() {return isHealed;}

}
