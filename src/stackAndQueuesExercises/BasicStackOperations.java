package stackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);

        ArrayDeque<Integer> stackOfNumbers = new ArrayDeque<>();
        String[] numbers = scanner.nextLine().split("\\s+");
        for (String number : numbers) {
            stackOfNumbers.push(Integer.parseInt(number));
        }

        for (int i = 0; i < s; i++) {
            stackOfNumbers.pop();
        }

        if (stackOfNumbers.isEmpty()) {
            System.out.println("0");
        } else {
            if (stackOfNumbers.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(stackOfNumbers.stream().mapToInt(e -> e).min().getAsInt());
                //System.out.println(Collections.min(stackOfNumbers));
                //System.out.println(getMinNumber(stackOfNumbers));
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
