package Test1;

public class SameArray {
    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40};
        int[] arr2 = {40,30,05,20,10};
        int count = 0;
        int index = 1;
        for(int i = 0; i < arr1.length; i++){
            if(index == arr1.length)
                break;
            if(arr1[i] == arr2[index]) {
                count++;
                index = 0;
                continue;
            }
            i--;
            index++;
        }
        if(count == arr1.length){
            System.out.println("Both array contains same elements");
            return;
        }
        System.out.println("Both array contains different elements");
    }
}