public class Palindrome {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println("Is Palindrome? " + isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
