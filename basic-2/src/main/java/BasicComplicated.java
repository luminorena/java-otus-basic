import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BasicComplicated {
    public static void main(String[] args) {
        unionArrays(new int[]{3, 1, 4, 4, 2, 18}, new int[]{3, 4, 2, 4});
        System.out.println("-------------------------------------------");
        isSorted(new int[]{-1, -2, -4});
        System.out.println("-------------------------------------------");
        reverseArray(new Integer[]{-1, -445, -4});
        System.out.println("-------------------------------------------");
        equalArrays(new int[]{1, 3, 4, 8});


    }

    public static void unionArrays(int[] arr, int[] arr1) {
        int length = (Math.max(arr.length, arr1.length));
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = 0;
            if (i < arr.length)
                result[i] += arr[i];
            if (i < arr1.length)
                result[i] += arr1[i];
        }
        System.out.println(Arrays.toString(result));

    }

    public static void isSorted(int[] array) {
        int[] copiedArray = new int[array.length];
        System.arraycopy(array, 0, copiedArray, 0, array.length);
        System.out.println("Исходный массив " + Arrays.toString(array));
        Arrays.sort(copiedArray);
        String result = "массив не отсортирован";
        for (int i = 0; i < copiedArray.length; i++) {
            if (array[i] == copiedArray[i]) {
                result = "по возрастанию";
                break;
            }
        }
        for (int i = copiedArray.length - 1; i >= 0; i--) {
            if (array[i] == copiedArray[i]) {
                result = "по убыванию";
                break;
            }
        }
        System.out.println(result);

    }

    public static void reverseArray(Integer[] array) {
        // Guava, ArrayUtils...
        System.out.println("Исходный массив " + Arrays.toString(array));
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println("Перевернутый массив " + list);

    }

    public static void equalArrays(int[] arr) {
        System.out.println("Исходный массив " + Arrays.toString(arr));
        if (arr.length < 2) {
            System.out.println(false);
            return;
        }
        int i = 0;
        int j = arr.length - 1;
        int sum1 = arr[i], sum2 = arr[j];
        do {
            if (sum1 < sum2) {
                i++;
                sum1 += arr[i];
            } else {
                j--;
                sum2 += arr[j];
            }
        }
        while (i < j - 1);
        if (sum1 == sum2)
            for (i = 0; i < arr.length; i++) {
                if (i == j)
                    System.out.print("| ");
                System.out.print(arr[i] + " ");
            }
        else
            System.out.println(false);
    }
}




