package ProgramPractice;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {39, 2, 12,44,33};
        int j = 1;
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(j == arr.length){
             i++;
             j = i;
            }
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
            i--;
        }
        System.out.println(Arrays.toString(arr));
    }
}