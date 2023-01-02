package Test1;

public class CheckDuplicateArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 7, 2, 4, 5};
        int[] arr2 = new int[arr1.length];
        int index = 1;
        int duplicateArrIndex = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (index == arr1.length) {
                i++;
                index = i + 1;
            }

            if (i == arr1.length - 1)
                break;

            if (arr1[i] == arr1[index]) {
                arr2[duplicateArrIndex++] = arr1[i];
                index = i + 2;
                continue;
            }
            i--;
            index++;
        }
        for (int element : arr2)
            System.out.print(element + " ");
    }
}
