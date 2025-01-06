package linearDataStructure.stack;

import java.util.Stack;

public class StackInJavaCollections {

    /*
    * Stack the following methods;
    *   push,  pop, search, peek, empty
    *
    * */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // doing by add method
        stack.add(11);
        stack.add(12);
        stack.add(13);
        stack.add(14);

        //using push method
        stack.push(20);
        stack.push(21);
        stack.push(22);
        stack.push(23);
        //result:  [11, 12, 13, 14, 20, 21, 22, 23]
        System.out.println(stack);
        //result: Peek: 23
        System.out.println("Peek: "+stack.peek());
        //result: [11, 12, 13, 14, 20, 21, 22, 23]
        System.out.println(stack);

        //removed the emelemnt from the stack only
        //result: Pop: 23
        System.out.println("Pop: "+stack.pop());
        //result:[11, 12, 13, 14, 20, 21, 22]
        System.out.println(stack);

        //it will return the position of the data
        //result: 7
        System.out.println(stack.search(11));

        //result: false
        System.out.println(stack.isEmpty());
    }
}
