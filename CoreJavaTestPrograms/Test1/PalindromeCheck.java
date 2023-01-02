package Test1;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String revStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            revStr += str.charAt(i);
        }
        if(str.equals(revStr)){
            System.out.println("String " +str+ " is Palindrome.");
            return;
        }
        System.out.println("String " +str+ " is not Palindrome.");
    }
}
