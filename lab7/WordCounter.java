package lab_30_5_24;
import java.util.Scanner;
public class WordCounter {
	public static void main(String[] args) {
		        // Create a scanner object for input
		        Scanner scanner = new Scanner(System.in);

		        // Input from the user
		        System.out.print("Enter the word: ");
		        String word = scanner.nextLine();

		        System.out.print("Enter the sentence: ");
		        String sentence = scanner.nextLine();

		        // Get the count of the word in the sentence
		        int count = countWordInSentence(word, sentence);

		        // Display the result
		        System.out.println("The word '" + word + "' appears " + count + " times in the sentence.");
		    }

		    public static int countWordInSentence(String word, String sentence) {
		        // Convert both word and sentence to lowercase to make the search case insensitive
		        word = word.toLowerCase();
		        sentence = sentence.toLowerCase();

		        // Split the sentence into words
		        String[] words = sentence.split("\\s+");

		        // Count the occurrences of the word
		        int count = 0;
		        for (String w : words) {
		            if (w.equals(word)) {
		                count++;
		            }
		        }

		        return count;
		    }
		
	}


