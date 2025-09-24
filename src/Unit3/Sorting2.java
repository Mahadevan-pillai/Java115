package Unit3;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting2 {
    public static void main(String[] args) {
    ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(20,"Harsh0",100));
        list.add(new Student(21,"Harsh1",101));
        list.add(new Student(23,"Harsh2",102));
        list.add(new Student(24,"Harsh3",103));
        list.add(new Student(25,"Harsh4",104));

        Collections.sort(list);
        for(Student s:list){
            System.out.println("Name "+s.name+" Age"+s.age+" Roll No. "+s.roll_no);
        }

    }
}
