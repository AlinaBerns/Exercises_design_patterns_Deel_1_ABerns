package pattern.strategy;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        ArraySorter arraySorterBubble = new ArraySorter(new BubbleSortAlgorithm());
        System.out.println(Arrays.toString
                (arraySorterBubble.sortArray(new int[]{1, 5, 6, 9, 7, 2, 5})));

        ArraySorter arraySorterMerge = new ArraySorter(new MergeSortAlgorithm());
        System.out.println(Arrays.toString
                (arraySorterMerge.sortArray(new int[]{1, 5, 6, 9, 7, 2, 5})));
    }
}
