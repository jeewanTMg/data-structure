package linearDataStructure.stack.problems;

import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class ArrayDeque {
    /*
    * Deque interface short for the double ended queue part of java.util package extends the Queue
    *
    * It has dual functionality of FIFO and LIFO
    * Enhance flexibility: insert, remove, and examin the element from both end.
    * Preferred over Lagecy Stack: it has method like addFirst(), removeLast()
    *
    *
    *
    * It is not thread shape
    *
    * we can remove from the last
    *
    * it will break the stack LIFO principle
    *
    *
    * Alternate Thread safe
    *
    * used the class like
    * 1.ConcurrentLinkedDeque
    * 2. LinkedBlockingDeque
    *
    * */

    public static void main(String[] args) {
        Deque<String> deque = new java.util.ArrayDeque<>();
        deque.add("ship1");
        deque.add("ship2");
        deque.add("ship3");
        deque.add("ship4");
        deque.add("ship5");
        deque.add("ship6");

        String data = deque.getLast();
        System.out.println(data);

        while(!deque.isEmpty()) {
            System.out.print(deque.pop()+" ");
        }


        Deque<String> dequeThreadSafe = new ConcurrentLinkedDeque<>();
        Deque<String> dequeThreadSafe1 = new LinkedBlockingDeque<>();

    }
}
