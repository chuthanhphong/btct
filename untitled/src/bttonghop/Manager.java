package bttonghop;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    public Map<Integer, Student> listStudent = new HashMap<>();

    public void add(int id, Student student) {
        listStudent.put(id, student);
    }

    public void display() {
        for (Map.Entry<Integer, Student> studentMap : listStudent.entrySet()) {
            System.out.println(studentMap);
        }
    }

    public Student delete(int id) {
            return listStudent.remove(id);
    }


    public boolean check(int id) {
        if (listStudent.containsKey(id)) {
            return true;
        }
        return false;
    }

    public Student searh(Integer id) {
        if (check(id)) {
            return listStudent.get(id);
        }
        return new Student();
    }


}






