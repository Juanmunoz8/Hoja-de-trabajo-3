import java.util.Arrays;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] array = generateRandomNumbers(3000);
        saveToFile(array, "unsorted.txt");

        // Gnome Sort
        int[] gnomeSorted = gnomeSort(Arrays.copyOf(array, array.length));
        saveToFile(gnomeSorted, "gnomeSorted.txt");

        // Merge Sort
        int[] mergeSorted = mergeSort(Arrays.copyOf(array, array.length));
        saveToFile(mergeSorted, "mergeSorted.txt");

        // Quick Sort
        int[] quickSorted = quickSort(Arrays.copyOf(array, array.length));
        saveToFile(quickSorted, "quickSorted.txt");

        // Radix Sort
        int[] radixSorted = radixSort(Arrays.copyOf(array, array.length));
        saveToFile(radixSorted, "radixSorted.txt");

        // Your Custom Sort
        int[] customSorted = customSort(Arrays.copyOf(array, array.length));
        saveToFile(customSorted, "customSorted.txt");
    }

    public static int[] generateRandomNumbers(int n) {
        Random rand = new Random();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(5000);
        }
        return array;
    }

    public static void saveToFile(int[] array, String filename) {
        try {
            FileWriter writer = new FileWriter(filename);
            for (int i : array) {
                writer.write(i + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Implement your sorting algorithms here
    public static int[] gnomeSort(int[] array) {
        // TODO: Implement Gnome Sort
        return array;
    }

    public static int[] mergeSort(int[] array) {
        // TODO: Implement Merge Sort
        return array;
    }

    public static int[] quickSort(int[] array) {
        // TODO: Implement Quick Sort
        return array;
    }

    public static int[] radixSort(int[] array) {
        // TODO: Implement Radix Sort
        return array;
    }

    public static int[] customSort(int[] array) {
        // TODO: Implement your custom sort
        return array;
    }
}
