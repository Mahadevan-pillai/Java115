package Unit3;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs= new  LinkedHashSet<String>();
        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        lhs.add("four");
        System.out.println(lhs);
    }
}