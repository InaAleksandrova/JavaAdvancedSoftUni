package multidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
    }


    public static void fillMatrixType_1 (Scanner scanner, int matrix[][], int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).
                    mapToInt(Integer::parseInt).
                    toArray();
        }
    }

    public static void fillMatrixType_2 (Scanner scanner, int matrix[][], int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }

        public static void printMatrix (int[][] matrix, int rows, int cols) {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col] + " ");
                }
                System.out.println();
            }
        }
    }
