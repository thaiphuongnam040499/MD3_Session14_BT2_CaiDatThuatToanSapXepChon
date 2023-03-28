import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 3, 45, 4, 7, 8, 95, 3, 1};
        insertionSort(list);
        System.out.println(Arrays.toString(list));

    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min < list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }
}
