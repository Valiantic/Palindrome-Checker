import java.util.Scanner;

public class Palindrome_Checker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {

            System.out.println("Welcome to Palindrome Checker!");
            System.out.println("");
            System.out.println("Enter a Word");
            String input = scan.nextLine();

            if (isPalindrome(input)) {
                System.out.println("The word you entered is a palindrome: " + input);
            } else {
                System.out.println("The word you entered is not a palindrome: " + input);
            }

        }

    }

    public static boolean isPalindrome(String word) {

        word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
