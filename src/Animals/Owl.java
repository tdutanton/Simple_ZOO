package Animals;

public class Owl extends Animal {
    static final String TYPE = "Сова";

    public Owl(Integer id, String name, Integer age, float weight, String feedSchedule) {
        super(id, TYPE, name, age, weight, feedSchedule);
    }
}
