package multidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        String [][] matrix = new String[rows][cols];

        fillMatrix(scanner, rows, cols, matrix);
        String input = "";
        while (!"END".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            if (!tokens[0].equals("swap") || tokens.length != 5) {
                System.out.println("Invalid input!");
                continue;
            }

            int row1;
            int col1;
            int row2;
            int col2;

            try {
                row1 = Integer.parseInt(tokens[1]);
                col1 = Integer.parseInt(tokens[2]);
                row2 = Integer.parseInt(tokens[3]);
                col2 = Integer.parseInt(tokens[4]);
            } catch (Exception e) {
                System.out.println("Invalid input!");
                continue;
            }

            if (row1 >= rows || col1 >= cols || row2 >= rows || col2 >= cols) {
                System.out.println("Invalid input!");
                continue;
            }

            String temp = matrix[row1][col1];
            matrix[row1][col1] = matrix[row2][col2];
            matrix[row2][col2] = temp;
            printMatrix(matrix, rows, cols);
        }
    }

    private static void fillMatrix(Scanner scanner, int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = input[col];
            }
        }
    }

    public static void printMatrix(String[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
