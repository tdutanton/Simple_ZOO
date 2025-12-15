public class Lion extends Animal{
    static final String LION_TYPE = "Лев";

    public Lion(String name, Integer age, float weight, String feedSchedule) {
        super(name, age, weight);
        this.type = LION_TYPE;
        this.feedSchedule = feedSchedule;
    }

    @Override
    public void feed() {
        System.out.printf("Лев по имени %s покормлен мясом%n", this.name);
    }
}
