package setsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("search")) {
                String searchedName = scanner.nextLine();
                while (!searchedName.equals("stop")) {
                    if (!phoneBook.containsKey(searchedName)) {
                        System.out.println("Contact " + searchedName + " does not exist.");
                    } else {
                        System.out.println(searchedName + " -> " + phoneBook.get(searchedName));
                    }
                    searchedName = scanner.nextLine();
                }
                break;
            } else {
                String name = input.split("-")[0];
                String number = input.split("-")[1];
                phoneBook.put(name, number);
            }
        }
    }
}
