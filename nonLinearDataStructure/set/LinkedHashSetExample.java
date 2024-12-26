package nonLinearDataStructure.set;

import java.util.AbstractSet;
import java.util.HashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        abastractMethodInSet();
    }

    public static void abastractMethodInSet() {
    AbstractSet data = new HashSet();
    data.add("hello");
    data.add("java");
    data.add("programming");

    AbstractSet data1 = new HashSet();
    data1.add("hello");
    data1.add("java");
    data1.add("programming");

        System.out.println(data.equals(data1));
    }
}
