package stackAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String navigation = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();
        String current = "";

        while (!navigation.equals("Home")) {
            if (navigation.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    navigation = scanner.nextLine();
                    continue;
                } else {
                    forwardHistory.addFirst(current);
                    current = history.pop();
                }

            } else if (navigation.equals("forward")) {
                if (forwardHistory.isEmpty()) {
                    System.out.println("no next URLs");
                    navigation = scanner.nextLine();
                    continue;
                } else {
                    current = forwardHistory.poll();
                }
            } else {
                if (!current.isEmpty()) {
                    history.push(current);
                    forwardHistory.clear();
                }
                current = navigation;
            }
            navigation = scanner.nextLine();
            System.out.println(current);

        }
    }
}
