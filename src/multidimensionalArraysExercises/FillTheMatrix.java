package multidimensionalArraysExercises;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String methodType = input[1];

        int[][] matrix = new int[size][size];
        int startNumber = 1; 

        if (methodType.equals("A")) {
            fillMatrixTypeA(size, startNumber, matrix);
            printMatrix(matrix, size, size);
        } else if (methodType.equals("B")) {
            fillMatrixTypeB(size, startNumber, matrix);
            printMatrix(matrix, size, size);
        }
    }

    public static void fillMatrixTypeB(int size, int startNumber, int[][] matrix) {
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            }
        }
    }

    public static void fillMatrixTypeA(int size, int startNumber, int[][] matrix) {
//        int counter = 1;
//        for (int row = 0; row < size; row++) {
//            for (int col = 0; col < matrix[row].length; col++) {
//                if (col == 0) {
//                    matrix[row][col] = startNumber;
//                } else {
//                    startNumber = startNumber + size;
//                    matrix[row][col] = startNumber;
//                }
//
//                if (startNumber > size * size) {
//                    break;
//                }
//            }
//            counter++;
//            startNumber = counter;
//        }

        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = startNumber;
                startNumber++;

            }
        }
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
