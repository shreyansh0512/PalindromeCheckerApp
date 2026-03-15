public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long start = System.nanoTime();

        boolean isPalindrome = checkPalindrome(input);

        long end = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + (end - start) + " ns");
    }

    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}
