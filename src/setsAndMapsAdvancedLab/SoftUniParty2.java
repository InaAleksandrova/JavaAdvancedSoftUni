package setsAndMapsAdvancedLab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Set<String> vips = new TreeSet<>();
        Set<String> regulars = new TreeSet<>();

        while (!input.equals("PARTY")) {
            if (Character.isDigit(input.charAt(0))) {
                vips.add(input);
            } else {
                regulars.add(input);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        Set<String> allGuest = new TreeSet<>(vips);
        allGuest.addAll(regulars);

        while (!input.equals("END")) {
            allGuest.remove(input);

            input = scanner.nextLine();
        }

        System.out.println(allGuest.size());
        System.out.println(String.join(System.lineSeparator(), allGuest));
    }
}
