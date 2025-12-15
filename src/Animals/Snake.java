package Animals;

public class Snake extends Animal implements Feedable, Cleanable {
    static final String TYPE = "Змея";

    public Snake(String name, Integer age, float weight, String feedSchedule) {
        super(name, age, weight);
        this.type = TYPE;
        this.feedSchedule = feedSchedule;
    }

    @Override
    public void feed() {
        System.out.printf("%s по имени %s покормлен мышами.%n", this.type, this.name);
    }

    @Override
    public void heal() {
        System.out.printf("%s по имени %s вылечен у врача по змеям.%n", this.type, this.name);
    }

    @Override
    public void clean() {
        System.out.printf("%s по имени %s теперь в чистом аквариуме.", this.type, this.name);
    }
}
