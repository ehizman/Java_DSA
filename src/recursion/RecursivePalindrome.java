package recursion;

public class RecursivePalindrome {
    public static void main(String[] args) {
        boolean result = palindrome("tabdbat");
        System.out.println(result);
    }

    public static boolean palindrome(String s){
        if (!(s.length() < 2)){
            if(s.charAt(0) != s.charAt(s.length()-1)){
                return false;
            }
            else{
                palindrome(s.substring(1, s.length()-1));
            }
        }
        return true;
    }
}
