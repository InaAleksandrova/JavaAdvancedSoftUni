package stackAndQueuesLab;

import java.util.ArrayDeque;

public class DemoQueue {
    public static void main(String[] args) {
        //add in front
        //remove first
        //peek first
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        queue.offer(13);
        queue.offer(42);
        queue.offer(69);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

//        System.out.println(queue.size());
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.size());
    }
}
