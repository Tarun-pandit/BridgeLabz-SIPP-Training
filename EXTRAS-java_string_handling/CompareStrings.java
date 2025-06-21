public class CompareStrings {

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        int len1 = s1.length();
        int len2 = s2.length();
        int lim = Math.min(len1, len2);
        int result = 0;
        for (int i = 0; i < lim; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                result = c1 - c2;
                break;
            }
        }
        if (result == 0) {
            result = len1 - len2;
        }
        if (result < 0) {
            System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + s1 + "\" comes after \"" + s2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + s1 + "\" is equal to \"" + s2 + "\"");
        }
    }
}
