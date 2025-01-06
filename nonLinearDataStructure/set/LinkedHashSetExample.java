package nonLinearDataStructure.set;

import java.util.AbstractSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

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

    Set<Integer> setData = new LinkedHashSet<>();
    setData.add(12);
    setData.add(13);
    setData.add(14);
    setData.add(15);
     System.out.println(setData);
     
     System.out.println(data.equals(data1));
    }
}
