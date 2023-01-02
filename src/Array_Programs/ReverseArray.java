package Array_Programs;

public class ReverseArray {
    public static void main(String[] args) {
        String originalStr = "Java";
        for(int i = originalStr.length() - 1; i >= 0; i--){
            System.out.print(originalStr.charAt(i));
        }
    }
}