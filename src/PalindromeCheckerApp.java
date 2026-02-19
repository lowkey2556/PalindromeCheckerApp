public class PalindromeCheckerApp {
    public static void main (String[] args){
        String text = "zeeshan";
        String reversed = "";
        System.out.println("Input text: "+text);
        for(int i = text.length()-1;i>=0;i--){
            reversed+=text.charAt(i);
        }
        if(text.equals(reversed)){
            System.out.println("Is it a palindrome? : true");
        }else{
            System.out.println("Is it a palindrome? : false");
        }
    }
}