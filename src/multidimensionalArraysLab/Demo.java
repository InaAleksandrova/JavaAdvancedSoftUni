package multidimensionalArraysLab;

public class Demo {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        int[][] matrix1 = {
                {12, 13},
                {13, 14},
                {1},
                {0}
        };

        int[] innerArr = matrix1[0];
        System.out.println(innerArr[1]);

    }
}
