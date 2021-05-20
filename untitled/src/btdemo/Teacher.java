package btdemo;

public class Teacher extends Person {
    private double salary;
    private int level;

    public Teacher() {
    }

    public Teacher(double salary, int level) {
        this.salary = salary;
        this.level = level;
    }

    public Teacher(String name, int age, String address, String gender, double salary, int level) {
        super(name, age, address, gender);
        this.salary = salary;
        this.level = level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return super.toString()+ "Teacher{" +
                "salary=" + salary +
                ", level=" + level +
                '}';
    }
}
