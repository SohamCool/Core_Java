package FunctionalInterfaces;

public class LambdaFunction {
    public static void main(String[] args) {
        int x = 10;
        int y = 30;

        // Addition
        Addition addition = (int a, int b) -> (a + b);
        System.out.println("Addition of a and b is: " + addition.add(x, y));

        // Multiplication
        Multiplication multi = (int a, int b) -> (a * b);
        System.out.println("Multiplication of a and b is: " + multi.multiply(x, y));

        // Square
        Square square = (int a) -> (a * a);
        System.out.println("Square of a is: " + square.getSquare(x));

        // Area of circle
        AreaOfCircle areaOfCircle = (int r) -> (3.14 * r * r);
        System.out.println("Area of Circle: " + areaOfCircle.getArea(x));

        // Area of Triangle
        AreaOfTriangle areaOfTriangle = (int base, int height) -> (0.5 * base *height);
        System.out.println("Area of Triangle: " + areaOfTriangle.getArea(x, y));
    }
}