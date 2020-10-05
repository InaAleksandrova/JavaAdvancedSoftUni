package multidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];

        fillMatrix(scanner, size, matrix);

        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

//        for (int index = 0; index < size; index++) {
//            primaryDiagonalSum += matrix[index][index];
//        }
//
//        for (int index = 0; index < size; index++) {
//            secondaryDiagonalSum += matrix[(size - 1) - index][index];
//        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                int number = matrix[row][col];
                if (row == col) {
                    primaryDiagonalSum += number;
                }
                if (col == size - row - 1) {
                    secondaryDiagonalSum += number;
                }
            }
        }

        System.out.println(Math.abs(primaryDiagonalSum - secondaryDiagonalSum));

//        if (primaryDiagonalSum > secondaryDiagonalSum) {
//            System.out.println(primaryDiagonalSum - secondaryDiagonalSum);
//        } else if (secondaryDiagonalSum > primaryDiagonalSum) {
//            System.out.println(secondaryDiagonalSum - primaryDiagonalSum);
//        }
    }

    private static void fillMatrix(Scanner scanner, int size, int[][] matrix) {
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
    }
}
