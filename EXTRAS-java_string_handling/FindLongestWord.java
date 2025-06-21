public class FindLongestWord {

    public static void main(String[] args) {
        String sentence = "This is a sample sentence";
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Longest word: " + longest);
    }
}
