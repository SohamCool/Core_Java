package ProgramPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch;
        boolean flag = false;
        for (int i = 0; i < str.length() - 1; i++) {
            ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                flag = true;
            }
        }
        if(flag == false)
            System.out.println("String doesn't contain any vowel");
        else
            System.out.println("String contains vowel");
    }
}
