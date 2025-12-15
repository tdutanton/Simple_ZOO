abstract class Animal implements AnimalInfoProvider, Feedable {
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
    }

    abstract public void feed();

    // AnimalInfoProvider implementation
    public String name() {
        return name;
    };

    public String type() {
        return type;
    };

    public String feedSchedule() {
        return feedSchedule;
    };

    public Integer age() {
        return age;
    };

    public float weight() {
        return weight;
    };

    public boolean isHealthChecked() {
        return isHealthChecked;
    };
}
