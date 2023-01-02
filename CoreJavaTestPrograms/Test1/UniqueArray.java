package Test1;

public class UniqueArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 43, 43, 52, 100, 120, 100, 43};
        System.out.println("Given array: ");
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\nGiven array with unique elements: ");
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 0)
                System.out.print(arr[i] + " ");
            else
                count = 0;
        }
    }
}
