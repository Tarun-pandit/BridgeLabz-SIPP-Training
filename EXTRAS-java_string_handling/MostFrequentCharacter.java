public class MostFrequentCharacter {

    public static void main(String[] args) {
        String str = "success";
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        int max = -1;
        char result = '\0';
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }
        System.out.println("Most Frequent Character: '" + result + "'");
    }
}
