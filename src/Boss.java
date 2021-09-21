import java.time.LocalDate;

public class Boss extends Worker{

    String department;


    public Boss(String name, String sureName, LocalDate dayOfBorn, String department) {
        super(name,  sureName,  dayOfBorn);
        this.department = department;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "department='" + department + '\'' +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", dayOfBorn=" + dayOfBorn +
                '}';
    }
}