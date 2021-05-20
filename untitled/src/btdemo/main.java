package btdemo;

import java.util.Collection;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.add(new Student("Chương",18,"Nam Định","Nữ",01,"Quất lâm tự"));
        manager.add(new Student("Nam",19,"Hà Nội","Nam",02,"Thịnh Long Đường"));
        manager.add(new Student("Tuấn",11,"Hà Nam","Nữ",03,"Trần Duy Hưng"));
        manager.add(new Student("Tuyền",12,"Quảng Ninh","Nữ",04,"Cửa Lò"));
//        manager.print();
//        System.out.println("---------------------------------------------------");
//        System.out.println(manager.Search(1));
//        System.out.println(manager.Search(2));
        manager.edit(3 , new Student("Như Anh",18,"Thái Bình","Nữ",06,"Đồ Sơn"));
        manager.print();
        System.out.println("--------------------");
        manager.sort();
        manager.print();










    }
}
