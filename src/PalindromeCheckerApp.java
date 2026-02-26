import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();
        PalindromeStrategy strategy = new StackStrategy();
        boolean isPalindrome = strategy.checkPalindrome(input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        scanner.close();
    }
}
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String input) {
        if (input == null) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}
class PointerStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}