package Animals;

public class Turtle extends Animal {
    static final String TYPE = "Черепаха";

    public Turtle(Integer id, String name, Integer age, float weight, String feedSchedule) {
        super(id, TYPE, name, age, weight, feedSchedule);
    }
}
