package ProgramPractice;

import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7, 2, 4, 5};
        int[] arr2 = {7, 6, 5, 2, 2, 4, 5, 9, 7};
        int[] carr = new int[arr1.length];
        int j = 0;
        int count = 0;
        int index = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (j == arr2.length) {
                i++;
                j = i;
            }
            if (count > 1) {
                count = 0;
                continue;
            }
            if (arr1[i] == arr2[j]) {
                count++;
                carr[index++] = arr1[i];
            }
            i--;
            j++;
        }

        for (int i = 0; i < carr.length; i++)
            if (carr[i] != 0)
                System.out.print(carr[i] + " ");
    }
}
