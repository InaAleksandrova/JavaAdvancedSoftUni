package setsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class СръбскоUnleashedRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "(?<name>[A-Za-z ]+) \\@(?<venue>[A-Za-z ]+) (?<price>[\\d]+) (?<tickets>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);

        LinkedHashMap<String, LinkedHashMap<String, Integer>> concerts = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String name = matcher.group("name");
                String venue = matcher.group("venue");
                int price = Integer.parseInt(matcher.group("price"));
                int tickets = Integer.parseInt(matcher.group("tickets"));
                int money = price * tickets;
                concerts.putIfAbsent(venue, new LinkedHashMap<>());
                concerts.get(venue).putIfAbsent(name, 0);
                concerts.get(venue).put(name, concerts.get(venue).get(name) + money);
            }
            input = scanner.nextLine();
        }

        concerts
                .entrySet()
                .forEach( v -> {
                    System.out.println(v.getKey());
                    v.getValue().
                            entrySet().
                            stream().
                            sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue()))
                            .forEach(s -> System.out.printf("#  %s -> %d%n", s.getKey(), s.getValue()));
                });
    }
}
