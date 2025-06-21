public class RemoveSpecificCharacter {

    public static void main(String[] args) {
        String str = "Hello World";
        char chToRemove = 'l';
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != chToRemove) {
                result.append(ch);
            }
        }
        System.out.println("Modified String: " + result.toString());
    }
}
