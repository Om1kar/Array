package Array;

public class DescendingArray {

    public static void main(String[] args) {
        System.out.println("Elements in Descending Order = ");
        int temp;  //variable to store the elements
        int[] array = new int[]{2, 12, 4, 5, 13, 9};
        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                //comparing
                if (array[i] < array[j]) {
                /*
               to swap the elements
                 */
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}