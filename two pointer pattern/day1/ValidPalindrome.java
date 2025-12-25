import java.util.Scanner;
public class ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check if it is palindrome?");
        String s = sc.next();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                System.out.println("not a palindrome");
                return;
            }else{
                i++;
                j--;
            }
        }
        System.out.println("input string is palindrome");
    }
}
