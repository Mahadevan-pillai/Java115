package Unit1;

public class MyMain {
    public static void main(String[] args) {
        Student s1 =  new Student(9,"Mahadevan");
        Student s2 =  new Student(s1);
        s1.display();
        s2.display();
    }
}
