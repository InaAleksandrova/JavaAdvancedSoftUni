package multidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = compareMatrices(firstMatrix, secondMatrix);

        System.out.println(areEqual ? "equal" : "not equal");
        //always returns the 1st if it's true and the second if it's false

//        if (areEqual) {
//            System.out.println("equal");
//        } else {
//            System.out.println("not equal");
//        }

    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }

        for (int rows = 0; rows < firstMatrix.length; rows++) {
            int[] firstArr = firstMatrix[rows];
            int[] secondArr = secondMatrix[rows];
            if (firstArr.length != secondArr.length) {
                return false;
            }
            for (int col = 0; col < firstArr.length; col++) {
                if (firstArr[col] != secondArr[col]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] readMatrix(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");

        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).
                    mapToInt(Integer::parseInt).
                    toArray();

            matrix[i] = arr;
        }

        //        //same - without stream
//        for (int r = 0; r < rows; r++) {
//            String[] line = scanner.nextLine().split("\\s+");
//            for (int c = 0; c < cols; c++) {
//                firstMatrix[r][c] = Integer.parseInt(line[c]);
//            }
//        }

        return matrix;
    }
}
