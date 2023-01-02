package Test1;

import java.util.Scanner;

public class PermutationsOfString {
     static void getPermutations(String str, String pStr){
        if (str.length() == 0) {
            System.out.print(pStr + " ");
            return;
        }

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            String combination = str.substring(0, i) + str.substring(i+1);
            getPermutations(combination, pStr+ch);
        }
    }

    // Using swap
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        getPermutations(str, "");
    }
}
