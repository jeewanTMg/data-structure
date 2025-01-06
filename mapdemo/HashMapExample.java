package mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    /*
    *
    * A map store data as key-value paris
    * Common implementations:
    *   1. HashMap (unordered, fast lookup)
    *   2. LinkedHashMap(maintains insertion order)
    *   3. Treemap(Sorted by keys)
    *
    *
    * Basic Methods is Map
    *
    * Methods                            Descrptions
    * Put(k key, V values)               Add or update a key-value pair.
    * get(Object key)                    Retrives the value for a given key.
    * remove(Object key)                 Removes a key-value for a given key.
    * containKey(Object key)             Checks if the map contains a value.
    * ketSet()                           Return a set of all keys
    * values()                           Return a set of all values.
    * entrySet()                         Return a set of key-value pairs (Map.Entry).
    * size()                             Return the number of key-value pairs.
    * isEmpty()                          Checks if the map is empty.
    *
    *
    * */


    public static void main(String[] args) {
        //creating a map
        Map<Integer, String> map = new HashMap<>();

        //adding key value paris in the map
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");


        //Access elements
        System.out.println("Value for key 1: "+map.get(1)); //output: Apple

        //Check if key or value exits
        System.out.println("Contains key 2? "+map.containsKey(2)); //output: true;
        System.out.println("Contain value 'Banana' ? "+map.containsValue("Banana")); //output: true

        //Iterate over the map
        System.out.println("Key Value pairs: ");
        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println("Key: "+ entry.getKey() + " value: "+ entry.getValue());
        }


        //remove a key-value pari
        map.remove(2);

        //size of the Map
        System.out.println("Size of the Map: "+map.size());


    }
}
