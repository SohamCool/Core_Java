package Test1;

public class PossibleSubArrays {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e'};
        int n = arr.length;
        for(int i = 0; i < (i<<n); i++)
        {
            System.out.print("{ ");
            for(int j = 0; j<n; j++){
                if((i & (1 << j)) > 0)
                    System.out.print(arr[j] + " ");
                System.out.print("}");
            }
        }
    }
}