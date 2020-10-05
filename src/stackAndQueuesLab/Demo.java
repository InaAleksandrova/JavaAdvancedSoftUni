package stackAndQueuesLab;

public class Demo {
    public static void main(String[] args) {
        int sumEven = getSumEven(new int[]{1, 3, 5, 13, 42, 69});
        System.out.println(sumEven);
    }

    public static int getSumEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        return sum;
    }

}
