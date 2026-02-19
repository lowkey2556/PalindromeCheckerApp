public class PalindromeCheckerApp {
    public static void main (String[] args){
        String text = "madam";
        System.out.println("Input text: "+text);
        boolean palindrome = true;
        for(int i=0; i<text.length()/2;i++){
            if(text.charAt(i)!=text.charAt(text.length()-i-1)){
                palindrome=false;
                break;
            }
        }
        System.out.println("Is it a palindrome? : "+palindrome);
    }
}