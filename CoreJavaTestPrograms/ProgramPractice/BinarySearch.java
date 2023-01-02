package ProgramPractice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    private static int[] sortArr(int[] arr) {
        int j = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (j == arr.length){
             i++;
             j = i;
            }
            if (arr[i] > arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i--;
            j++;
        }
        return arr;
    }

    private static int binarySearch(int[] arr, int key) {
        int mid = 0;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (low > high)
                break;
            mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            if (key > arr[mid])
                low = mid + 1;
            if (key < arr[mid])
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 14, 12, 5, 33, 199};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int pos = binarySearch(arr, key) + 1;
        if(pos <= 0){
            System.out.println("Element not found");
            return;
        }
        System.out.println("Element found at position "+pos);
    }
}