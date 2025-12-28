import java.util.Scanner;
public class Leetcode125 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        boolean result =ValidPalindrome(s);
        if(result){
            System.out.println("given word is palindrome");
        }else{
            System.out.println("Given word is not palindrome ");
        }
    }
    static boolean ValidPalindrome(String s ){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);
            if(!Character.isLetterOrDigit(left)){
                i=i+1;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                j=j-1;
                continue;
            }
            if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            i=i+1;
            j=j-1;
               
        }
        return true;
    }
}
