import java.util.Arrays;

public class Experiment {
    private Sorter sorter = new Sorter();
    private Searcher searcher = new Searcher();

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        for (int size : sizes) {
            System.out.println("=== Experiment for Size: " + size + " ===");

            int[] originalArray = sorter.generateRandomArray(size);

            int[] bubbleArray = Arrays.copyOf(originalArray, originalArray.length);
            long startBubble = System.nanoTime();
            sorter.basicSort(bubbleArray);
            long endBubble = System.nanoTime();
            long timeBubble = endBubble - startBubble;
            int[] quickArray = Arrays.copyOf(originalArray, originalArray.length);
            long startQuick = System.nanoTime();
            sorter.advancedSort(quickArray);
            long endQuick = System.nanoTime();
            long timeQuick = endQuick - startQuick;

            long startSearch = System.nanoTime();
            searcher.search(originalArray, -1);
            long endSearch = System.nanoTime();
            long timeSearch = endSearch - startSearch;

            System.out.println("Bubble Sort:    " + timeBubble + " ns");
            System.out.println("Quick Sort:     " + timeQuick + " ns");
            System.out.println("Linear Search:  " + timeSearch + " ns");
            System.out.println();
        }
    }
}