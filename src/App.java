import java.util.Arrays;

public class App {
    public static void main(String args[]) {
        BubbleSort bubbleSort = new BubbleSort();
        int[][] testArrays = {
                {70, 61, 72, 83, 38},
                {7, 2, 76, 4, 99},
                {28, 9, 13, 78, 19},
                {68, 84, 41, 62, 18}
        };

        for (int[] unsorted: testArrays) {
            String sorted = Arrays.toString(bubbleSort.sort(unsorted));
            System.out.println(sorted);
        }
    }
}