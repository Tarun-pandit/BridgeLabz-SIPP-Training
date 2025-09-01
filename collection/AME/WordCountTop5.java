import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCountTop5 {
    public static void main(String[] args) {
        String filename = "input.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(wordCount.entrySet());
            sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

            System.out.println("Top 5 most frequently occurring words:");
            for (int i = 0; i < Math.min(5, sortedList.size()); i++) {
                Map.Entry<String, Integer> entry = sortedList.get(i);
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
