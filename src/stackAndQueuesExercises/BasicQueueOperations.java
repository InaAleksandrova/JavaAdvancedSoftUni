package stackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        ArrayDeque<Integer> numbersQueue = new ArrayDeque<>();
        String[] numbers = scanner.nextLine().split("\\s+");
        for (String number : numbers) {
            numbersQueue.offer(Integer.parseInt(number));
        }

        for (int i = 0; i < s; i++) {
            numbersQueue.poll();
        }

        if (numbersQueue.isEmpty()) {
            System.out.println("0");
        } else {
            if (numbersQueue.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(numbersQueue.stream().mapToInt(e -> e).min().getAsInt());
                //System.out.println(Collections.min(numbersQueue));
                //System.out.println(getMinNumber(numbersQueue));
            }
        }
    }


    private static int getMinNumber(ArrayDeque<Integer> stackOfNumbers) {
        int minNum = Integer.MAX_VALUE;
        for (int num : stackOfNumbers) {
            if (num < minNum) {
                minNum = num;
            }
        }
        return minNum;
    }
}
