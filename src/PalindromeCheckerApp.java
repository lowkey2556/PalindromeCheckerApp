import java.util.Scanner;
import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();
        PalindromeStrategy strategy = new PointerStrategy();
        long startTime = System.nanoTime();
        boolean isPalindrome = strategy.checkPalindrome(input);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + duration + " ns");
    }
}
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}
class PointerStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String input) {
        if (input == null) return false;
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
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean checkPalindrome(String input) {
        if (input == null) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}