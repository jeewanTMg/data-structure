package nonLinearDataStructure.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> setListOfName = new HashSet<>();
        //adding the list of name in the Set setListOfName;
        setListOfName.add("Ram");
        setListOfName.add("Sam");
        setListOfName.add("Hari");

        //display the name list add in the setListOfName set
        for(String name : setListOfName) {
            System.out.print(name + " ");
        }
        System.out.println();
        System.out.println("#####################################");

        //copy setInto Another set in java
        Set<String> setListOfNameCopy = new LinkedHashSet<>(setListOfName);
        for(String name : setListOfNameCopy) {
            System.out.print(name + " ");
        }

        Set<String> setListOfNameInLinkedList = new LinkedHashSet<>();
        setListOfNameInLinkedList.add("Java");
        setListOfNameInLinkedList.add("programming");
        setListOfNameInLinkedList.add("language");

        System.out.println();
        System.out.println("#####################################");
        System.out.println("This is name in added order.");
        System.out.println("#####################################");

        for(String name: setListOfNameInLinkedList) {
            System.out.print(name +" ");
        }
    }
}
