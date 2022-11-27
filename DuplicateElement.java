package Array;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] array = {5, 3, 4, 5, 6, 7, 6, 4,};
        System.out.println("Duplicate elements is array= ");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.print(array[j]+" ");
            }
        }
    }
}
