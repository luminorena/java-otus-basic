import java.util.Random;

public class Main {
    public static int arraySize = 4;

    public static void main(String[] args) {
        String[][] arr = new String[arraySize][arraySize];
        if (arr.length != 4) {
            throw new AppArraySizeException("Размер массива должен быть равен 4м");
        }
        getArray(arr);
    }

    public static void getArray(String[][] arr) throws AppArrayDataException {
        String valuesToInsert = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = String.valueOf(valuesToInsert
                        .charAt(new Random().nextInt(valuesToInsert.length())));
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Невозможно строку преобразовать в целое число ",
                            arr[i][j]);
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Сумма элементов массива: " + result);
    }


}
