package Array;

public class SmallestElement {
    /**
     * @param ->to find small element in an array
     */
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 5, 12, 13, 15};
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];

            }
        }
        System.out.println("smallest element  = " + smallest);
    }
}