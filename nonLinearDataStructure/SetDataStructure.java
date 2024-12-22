package nonLinearDataStructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDataStructure {

    /*
    * Set in Java internally implemented as (Hash-Table)
    *
       Set is an interface , objects cannot be created of the typeset.
     *  We always need a class that extends this list in order to create an object.
     *  And also, after the introduction of Generics in Java 1.5, it is possible to
     * restrict the type of object that can be stored in the Set.
     * This type-safe set can be defined as:

*   Types of set in Java:
       1. HashSet
       2. TreeSet
       3. LinkedHashSet
       *
    * */
    public static void main(String[] args) {

        Set data = new HashSet();
        data.add(null);
        data.add(null);

        Iterator hello = data.iterator();
        while(hello.hasNext()) {
            System.out.println(hello.next());
        }

    }

    /*
    *
    HashSet()
    * HashSet in Java implements the Set interface of Collections Framework.
    *  It is used to store the unique elements and it doesn’t maintain any
    * specific order of elements.Can store the Null values.
      Uses HashMap (implementation of hash table data structure) internally.
      Also implements Serializable and Cloneable interfaces.
     HashSet is not thread-safe. So to make it thread-safe, synchronization needed externally.
    * */
}
