import java.util.Scanner;

public class SRclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        

        StringBuilder reversedSentence = new StringBuilder();
        String words[] = sentence.split(" ");
        for (String word : words) {
        	reversedSentence.append(new StringBuilder(word).reverse()).append(" ");
        	}
        
       
        System.out.println("Reversed sentence:");
        System.out.println(reversedSentence.toString());
        
        scanner.close();
    }
}