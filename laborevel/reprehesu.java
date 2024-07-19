public class Main {
    public static void main(String[] args) {
        String sentence = "Splits it into words.";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        // Output:
        // Splits
        // it
        // into
        // words.
    }
}
