public class CountSubstringOccurrences {

    public static void main(String[] args) {
        String str = "banana";
        String substr = "ana";
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        System.out.println("Number of occurrences of \"" + substr + "\": " + count);
    }
}
