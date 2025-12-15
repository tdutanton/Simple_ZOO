package Animals;

public class Owl extends Animal implements Feedable, Cleanable {
    static final String TYPE = "Сова";

    public Owl(String name, Integer age, float weight, String feedSchedule) {
        super(name, age, weight);
        this.type = TYPE;
        this.feedSchedule = feedSchedule;
    }

    @Override
    public void feed() {
        System.out.printf("%s по имени %s покормлен кузнечиками.%n", this.type, this.name);
    }

    @Override
    public void heal() {
        System.out.printf("%s по имени %s вылечен у врача орнитолога.%n", this.type, this.name);
    }

    @Override
    public void clean() {
        System.out.printf("%s по имени %s теперь в чистой большой клетке.", this.type, this.name);
    }
}
