package Animals;

public interface IAnimalInfoProvider {
    String name();
    String type();
    String feedSchedule();
    Integer age();
    float weight();
    boolean isHealthChecked();
}