import java.util.Arrays;

public class Experiment {
    Sorter sorter = new Sorter();
    Searcher searcher = new Searcher();

    public long measureSortTime(int[] arr, String type) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        long start = System.nanoTime();
        if (type.equals("basic")) sorter.basicSort(copy);
        else sorter.advancedSort(copy);
        return System.nanoTime() - start;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};
        for (int size : sizes) {
            int[] arr = sorter.generateRandomArray(size);
            System.out.println("Current Size: " + size);
            System.out.println("Bubble Sort: " + measureSortTime(arr, "basic") + " ns");
            System.out.println("Selection Sort: " + measureSortTime(arr, "advanced") + " ns\n");
        }
    }
}
