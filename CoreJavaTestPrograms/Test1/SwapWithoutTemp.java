package Test1;

public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 30;
        int b = 50;
        System.out.println("Before Swapping: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a += b;//80
        b = a - b;
        a -= b;
        System.out.println("After Swapping: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
