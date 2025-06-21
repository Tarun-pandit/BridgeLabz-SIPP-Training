public class PalindromeCheck {

    public static void main(String[] args) {
        String str = "madam";
        String lowerStr = str.toLowerCase();
        int left = 0, right = lowerStr.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (lowerStr.charAt(left) != lowerStr.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
