package pattern.strategy;

public class BubbleSortAlgorithm implements ArraySortingAlgorithm {

    @Override
    public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        return array;
    }

    @Override
    public String toString() {
        return "BubbleSortAlgorithm";
    }
}

