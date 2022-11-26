package Array;


public class LargestElement {
    /**
     *
     * @param ->to find largestt element in an array
     */
    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 5, 12, 13, 15};
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];

            }
        }
        System.out.println("largest element  = "+largest);
    }
}
