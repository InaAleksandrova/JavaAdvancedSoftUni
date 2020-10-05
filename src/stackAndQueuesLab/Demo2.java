package stackAndQueuesLab;

import java.util.ArrayDeque;

public class Demo2 {
    public static void main(String[] args) {
        // Push -> add at the top of the stack
        // Pop -> removes at the top of the stack
        // Peek -> gets at the top of the stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(13);
        stack.push(42);
        stack.push(69);

        System.out.println(stack.size());
    }
}
