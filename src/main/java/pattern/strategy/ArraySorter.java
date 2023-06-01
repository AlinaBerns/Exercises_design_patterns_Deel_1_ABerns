package pattern.strategy;

public class ArraySorter {
    private ArraySortingAlgorithm arraySortingAlgorithm;

    public ArraySorter(ArraySortingAlgorithm arraySortingAlgorithm) {
        this.arraySortingAlgorithm = arraySortingAlgorithm;
    }

    public int[] sortArray(int[] array) {
        System.out.println("Sort array with " + Colors.ANSI_YELLOW+arraySortingAlgorithm+Colors.ANSI_RESET);
        return arraySortingAlgorithm.sortArray(array);
    }
}
