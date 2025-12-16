package Animals;

public class Lion extends Animal {
    static final String TYPE = "Лев";

    public Lion(Integer id, String name, Integer age, float weight, String feedSchedule) {
        super(id, TYPE, name, age, weight, feedSchedule);
    }
}
