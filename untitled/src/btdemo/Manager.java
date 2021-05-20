package btdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Manager {

    List<Student> students;

    public Manager() {
        this.students = new ArrayList<>();
    }


    public void add(Student student) {
        students.add(student);
    }

    public boolean Delete(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getid()) {
                students.remove(students.get(i));
                return true;
            }
        }
        return false;
    }

    public int Search(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getid()) {
//                return students.get(i).toString();
                return i;
            }
        }
//        return "không có giá trị";
        return -1;
    }

    public void print() {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public void edit(int id, Student student) {
        if (Search(id) == -1) {
            System.out.println("không có giá trị");
        } else
            students.set(Search(id), student);

    }
    public void sort(){
        Collections.sort(students);
    }
}
