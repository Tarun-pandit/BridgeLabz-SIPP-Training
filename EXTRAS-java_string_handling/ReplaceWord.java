public class ReplaceWord {

    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        String oldWord = "Java";
        String newWord = "Python";
        String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(words[i]);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        System.out.println("Modified Sentence: " + result.toString());
    }
}
