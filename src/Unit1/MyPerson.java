package Unit1;

public class MyPerson {
    public static void main(String[] args) {
        Person p=new Person("Ghaziabad");
        p.getAddress();
        SchoolStudent st=new SchoolStudent("Ghaziabad","Unit1.B.tech");
        st.getAddress();
        st.getCourse();
    }
}