package ProgramPractice;

import java.util.Arrays;

public class CmnThreeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7, 2, 4, 5};
        int[] arr2 = {7, 6, 5, 2, 2, 4, 5, 9, 7};
        int[] arr3 = {9, 5, 3, 4, 6, 7};

        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr3.length; k++) {
                    if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
        }
    }
}
