package streamsFilesDirectoriesLab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //The quick brown fox jumps over the lazy dog
        String path = "D:\\SoftUni_files\\Java_Advanced\\input.txt";
//
//        FileInputStream inputStream = new FileInputStream(path);
//        int nextByte = inputStream.read();
//
//        while (nextByte != -1) {
//            System.out.print(Character.toChars(nextByte));
//            System.out.println(Integer.toBinaryString(nextByte));
//            nextByte = inputStream.read();
//        }

        try {
            example();
            System.out.println("Worked");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Try catch block finished");
        }
    }

    public static void example() throws IOException {
        throw new IOException("I am exception in an empty method");
    }
}
