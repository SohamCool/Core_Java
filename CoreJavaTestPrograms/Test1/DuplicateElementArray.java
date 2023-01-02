package Test1;

public class DuplicateElementArray {
    public static int[] getDuplicateElements(int[] arr) {
        int[] darr = new int[arr.length];
        int index = 1;
        int duplicateArrIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (index == arr.length) {
                i++;
                index = i + 1;
            }

            if (i == arr.length - 1)
                break;

            if (arr[i] == arr[index]) {
                darr[duplicateArrIndex++] = arr[i];
                index = i + 2;
                continue;
            }
            i--;
            index++;
        }
        return darr;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 56, 10, 23};
        int[] arr2 = {76, 66, 65, 22, 42, 45, 65, 22};
        int[] arr3 = {88, 4, 3, 70, 2, 3, 4};

        int[] darr1 = getDuplicateElements(arr1);
        int[] darr2 = getDuplicateElements(arr2);
        int[] darr3 = getDuplicateElements(arr3);

        int length = darr1.length + darr2.length + darr3.length;
        int[] darr = new int[length];
        int index = 0;
        for (int element : darr1) {
            if (element == 0)
                break;
            darr[index++] = element;
        }
        for (int element : darr2) {
            if (element == 0)
                break;
            darr[index++] = element;
        }
        for (int element : darr3) {
            if (element == 0)
                break;
            darr[index++] = element;
        }

        for (int element : darr) {
            if (element != 0)
                System.out.print(element + " ");
        }
    }
}
