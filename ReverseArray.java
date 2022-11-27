package Array;

public class ReverseArray {
    /**
     * @param ->to print array in reverse order.
     */
    public static void main(String[] args) {
        //Initializing array
        int [] array = new int [] {11, 3, 7, 9, 1};
        System.out.println("Original array= ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order= ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
