public class Main {
    // will be doing Parametric polymorphism
    public static boolean isPalindrome(String s) {
        boolean palindrome = true;
        int length = s.length();

        for (int i = 0; i < length / 2; i++) {
            char start = s.charAt(i);
            char end = s.charAt(length - 1 - i);

            if (start != end) {
                palindrome = false;
                break;
            }
        }

        return palindrome;
    }
    public static boolean isPalindrome(double d) {
        String input = String.valueOf(d);
        return isPalindrome(input);
    }
    public static boolean isPalindrome(long d) {
        String input = String.valueOf(d);
        return isPalindrome(input);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(121.121));
        System.out.println(isPalindrome("Aba"));
        System.out.println(isPalindrome("(((("));
    }
}
