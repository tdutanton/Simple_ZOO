package Animals;

public class Lion extends Animal implements Feedable, Cleanable {
    static final String LION_TYPE = "Лев";

    public Lion(String name, Integer age, float weight, String feedSchedule) {
        super(name, age, weight);
        this.type = LION_TYPE;
        this.feedSchedule = feedSchedule;
    }

    @Override
    public void feed() {
        System.out.printf("%s по имени %s покормлен мясом.%n", this.type, this.name);
    }

    @Override
    public void heal() {
        System.out.printf("%s по имени %s вылечен.%n", this.type, this.name);
    }

    @Override
    public void clean() {
        System.out.printf("%s по имени %s теперь в чистом вольере.", this.type, this.name);
    }
}
