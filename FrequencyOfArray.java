package Array;

public class FrequencyOfArray {
    public static void toFindFrequency(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++) {
            int temp = 0;
            int count = 0;
            for (int j = i + 1; j < arraySize; j++) {
                if (array[i] == array[j]) {
                    temp = 1;
                    break;
                }
            }
            if (temp == 1)
                continue;

            for (int j = 0; j <= i; j++) {
                if (array[i] == array[j])
                    count++;

            }
            System.out.println(array[i] + "=" + count);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 4, 3, 5, 2};
        int arraySize = array.length;
        toFindFrequency(array, arraySize);
    }
}