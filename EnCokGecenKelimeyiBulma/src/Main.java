import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Metninizi giriniz: ");

        String text = input.nextLine();
        String[] words = text.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            // Eğer kelime haritada varsa, değerini bir arttır.
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Eğer kelime haritada yoksa, değerini bir yap.
                wordCount.put(word, 1);
            }
        }

        String mostWord = null;
        int mostWordCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > mostWordCount) {
                mostWord = entry.getKey();
                mostWordCount = entry.getValue();
            }
        }

        System.out.println("Metinde en çok geçen kelime: " + mostWord);
        System.out.println("Bu kelime metinde " + mostWordCount + " kez geçiyor.");








    }
}