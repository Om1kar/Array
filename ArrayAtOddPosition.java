package Array;

public class ArrayAtOddPosition {
    public static void main(String[] args) {
        System.out.println("Elements of array at odd position =" );
        int[] array = new int[]{1, 7, 5, 11, 9, 2};
        /**
         * index length-> 0 1 2 3 4 5
         */
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}