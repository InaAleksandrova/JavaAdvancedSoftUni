package opinionPollDefineClasses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split("\\s+")[0];
            int age = Integer.parseInt(input.split("\\s+")[1]);

            if (age > 30) {
                people.add(new Person(name, age));
            }
        }
        people.sort(Comparator.comparing(p -> p.getName()));
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
