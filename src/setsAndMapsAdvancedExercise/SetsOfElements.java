package setsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sizes = scanner.nextLine().split("\\s+");
        int firstSetSize = Integer.parseInt(sizes[0]);
        int secondSetSize = Integer.parseInt(sizes[1]);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>(firstSetSize);
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>(secondSetSize);

        for (int i = 0; i < firstSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }

        for (int i = 0; i < secondSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }

        firstSet.retainAll(secondSet);

        firstSet.forEach(number -> System.out.print(number + " "));
    }
}
