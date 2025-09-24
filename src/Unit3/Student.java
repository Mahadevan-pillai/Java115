package Unit3;

public class Student implements Comparable<Student>{
    int age;
    String name;
    int roll_no;

    public Student(int age, String name, int roll_no) {
        this.age = age;
        this.name = name;
        this.roll_no = roll_no;
    }
    public int compareTo(Student s){
        if(age == s.age)
            return 0;
        else if(age > s.age)
            return 1;
        else
            return -1;
    }
}
