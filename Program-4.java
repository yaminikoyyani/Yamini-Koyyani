import java.util.*;

public class MultiplesCounter {
    public static void main(String[] args) {
        // Sample input
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Use a LinkedHashMap to maintain insertion order
        Map<Integer, Integer> multiplesCount = new LinkedHashMap<>();

        // Initialize map with 0 counts
        for (int i = 1; i <= 9; i++) {
            multiplesCount.put(i, 0);
        }

        // Count multiples
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    multiplesCount.put(i, multiplesCount.get(i) + 1);
                }
            }
        }

        // Print the output
        System.out.println("Output:");
        for (Map.Entry<Integer, Integer> entry : multiplesCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
