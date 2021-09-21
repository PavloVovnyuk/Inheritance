import java.time.LocalDate;
import java.time.LocalDateTime;

public class Worker {
    String name;
    String sureName;
    LocalDate dayOfBorn;


    public Worker(String name, String sureName, LocalDate dayOfBorn) {
        this.name = name;
        this.sureName = sureName;
        this.dayOfBorn = dayOfBorn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public LocalDate getDayOfBorn() {
        return dayOfBorn;
    }

    public void setDayOfBorn(LocalDate dayOfBorn) {
        this.dayOfBorn = dayOfBorn;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", dayOfBorn=" + dayOfBorn +
                '}';
    }
}
