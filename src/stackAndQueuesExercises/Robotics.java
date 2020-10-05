package stackAndQueuesExercises;

import java.util.*;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(";");

        LinkedHashMap<String, Integer> robots = getLinkedHashMap(input);
        String staringTime = scanner.nextLine();
        int hours = Integer.parseInt(staringTime.split(":")[0]);
        int minutes = Integer.parseInt(staringTime.split(":")[1]);
        int seconds = Integer.parseInt(staringTime.split(":")[2]);
        long totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        ArrayDeque<String> products = new ArrayDeque<>();
        int[] workingTime = new int[robots.size()];
        String product = scanner.nextLine();

        while (!product.equals("End")) {
            products.offer(product);
            product = scanner.nextLine();
        }

        while (!products.isEmpty()) {
            String currentProduct = products.poll();
            totalTimeInSeconds++;
            boolean isAssigned = false;
            for (int robot = 0; robot < workingTime.length; robot++) {
                if(workingTime[robot] > 0) {
                    --workingTime[robot];
                }
            }
            for (int i = 0; i < workingTime.length; i++) {
                if (workingTime[i] == 0) {
                    int counter = 0;
                    for (Map.Entry<String, Integer> robot : robots.entrySet()) {
                        if (counter == i) {
                            workingTime[i] = robot.getValue();
                            long takenHour = totalTimeInSeconds / 3600 % 24;
                            long takenMinute = totalTimeInSeconds % 3600 / 60;
                            long takenSeconds = totalTimeInSeconds % 60;
                            System.out.printf("%s - %s [%02d:%02d:%02d]%n", robot.getKey(), currentProduct, takenHour, takenMinute, takenSeconds);
                            isAssigned = true;
                            break;
                        }
                        counter++;
                    }
                    break;
                }
            }
            if (!isAssigned) {
                products.offer(currentProduct);
            }
        }
    }

    private static LinkedHashMap<String, Integer> getLinkedHashMap(String[] input) {
        LinkedHashMap<String, Integer> robots = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            String[] robotsAndProcessTime = input[i].split("-");
            robots.put(robotsAndProcessTime[0], Integer.parseInt(robotsAndProcessTime[1]));
        }
        return robots;
    }
}
