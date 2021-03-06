public class BubbleSort {
    public int[] sort(int[] unsorted) {
        int arrayLen = unsorted.length;
        for (int i = 0; i < arrayLen - 1; i++) {
            for (int j = 0; j < arrayLen - i - 1; j++) {
                if (unsorted[j] > unsorted[j + 1]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }
        return unsorted;
    }
}

