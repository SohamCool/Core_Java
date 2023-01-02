package Array_Programs;

public class SecondLargestNum{
    public static void main(String[] args){
        int[] arr = {89,4,100,34,2,1,35,10,89,100,100,};
        for(int i = 0; i < arr.length-1; i++)
            System.out.println(arr[i]);
        int temp = 0;
        for(int i = 0; i< arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted");
        for(int i =0; i<arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("Second largest number");
        System.out.println(getSecondLargest(arr));

    }
    public static int getSecondLargest(int[] arr){
        int secondMax = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] < secondMax){
                secondMax = arr[i];
                break;
            }
        }
        return secondMax;
    }
}
