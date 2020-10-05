package streamsFilesDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "input.txt";

        Scanner scanner = new Scanner(new FileInputStream(path));
        PrintWriter printWriter = new PrintWriter("integers-out.txt");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                printWriter.println(number);
            }
            scanner.next();
        }
        printWriter.flush();
        printWriter.close();
    }
}
