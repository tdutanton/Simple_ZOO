package Animals;

public abstract class Animal implements IAnimalInfoProvider, Healable {
    private static Integer nextId = 1;
    protected final Integer id;
    protected String type;
    protected String name;
    protected String feedSchedule;
    protected Integer age;
    protected float weight;
    protected boolean isHealthChecked;

    protected Animal(String name, Integer age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        isHealthChecked = false;
        this.id = nextId;
        nextId++;
    }

    public Integer id() {return id;}

    // Animals.IAnimalInfoProvider implementation
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

    public void checkHealthFirstVisit() {
        this.isHealthChecked = true;
        System.out.printf("%s по имени %s прошел первичную проверку у ветеринара.%n", this.type, this.name);
    }

}
