package btdemo;

public class Student extends Person  implements Comparable<Student>  {
        private int id;
        private String School;

    public Student() {
    }



    public Student(String name, int age, String address, String gender, int id, String school) {
        super(name, age, address, gender);
        this.id = id;
        School = school;
    }

    public int getid() {
        return id;
    }

    public void setClass(int id) {
        id = id;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    @Override
    public String toString() {
        return super.toString()+ "Student{" +
                "id=" + id +
                ", School='" + School + '\'' +
                '}';
    }


    @Override
    public int compareTo(Student student) {
        return  this.getAge() - student.getAge();
    }
}
