package Patterns_Programs;

public class RevPyramid {
    public static void main(String[] args) {
        int rows = 5;
        for(int i = 0; i < rows; i++){
            // Spacing
            for(int j = 0; j < i; j++)
                System.out.print(" ");
            // Stars
            for(int k = 0; k < rows-i; k++)
                System.out.print(" *");
            System.out.println();
        }
    }
}
