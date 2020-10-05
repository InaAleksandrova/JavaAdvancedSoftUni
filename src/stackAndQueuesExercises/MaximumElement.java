package stackAndQueuesExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numberStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "1":
                    int x = Integer.parseInt(tokens[1]);
                    numberStack.push(x);
                    break;
                case "2":
                    numberStack.pop();
                    break;
                case "3":
                    System.out.println(numberStack.stream().mapToInt(e -> e).max().getAsInt());
                    break;
            }
        }
    }
}
