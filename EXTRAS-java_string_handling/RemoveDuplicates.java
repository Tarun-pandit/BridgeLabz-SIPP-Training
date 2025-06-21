public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                seen[ch] = true;
                result.append(ch);
            }
        }
        System.out.println("String after removing duplicates: " + result.toString());
    }
}
