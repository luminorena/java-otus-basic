import java.util.Arrays;
import java.util.stream.Stream;

public class Basic2 {

    public static void main(String[] args) {
        printStringManyTimes(8, " >");
        System.out.println("--------------------------------------------------------------------------");
        printIntArray(new int[]{1, 3, 5, 8, 10});
        System.out.println("--------------------------------------------------------------------------");
        fillArrayWithNumber(2, new int[4]);
        System.out.println("--------------------------------------------------------------------------");
        increaseArrayOnNumber(2, new int[]{1, 3, 5, 8, 10});
        System.out.println("--------------------------------------------------------------------------");
        // если кол-во элементов нечетное, то "лишний" элемент отходит в первую часть массива
        greatestHalf(new int[]{4, 6, 3, 5, 6, 4});
    }

    public static void printStringManyTimes(int number, String str) {
        System.out.println("Печатаем строку " + number + " раз");
        Stream.generate(() -> str).limit(number).forEach(System.out::print);
        System.out.println();
    }

    public static void printIntArray(int[] arr) {
        System.out.println("Сумма чисел массива " + Arrays.toString(arr) + " больше 5и ");
        int sum = Arrays.stream(arr).filter(x -> x > 5).sum();
        System.out.println(sum);
    }

    public static void fillArrayWithNumber(int number, int[] array) {
        System.out.println("В массиве " + Arrays.toString(array) + " все числа равны " + number);
        Arrays.stream(array).map(i -> number).forEach(System.out::println);
    }

    public static void increaseArrayOnNumber(int number, int[] array) {
        System.out.println("Каждый элемент исходного массива " + Arrays.toString(array)
                + "увеличивается на значение " + number);
        Arrays.stream(array).map(i -> i + number).forEach(System.out::println);
    }

    public static void greatestHalf(int[] array) {
        int arrayLength = (array.length / 2 == 0 ? array.length / 2 : array.length / 2 + 1);

        int[] firstPart = Arrays.stream(array).limit(arrayLength).toArray();
        System.out.println("Первая часть массива: " + Arrays.toString(firstPart));

        long sumOfFirstPart = Arrays.stream(firstPart).sum();
        System.out.println("Сумма первой части массива: " + sumOfFirstPart);

        int[] secondPart = Arrays.stream(array).skip(arrayLength).limit(arrayLength).toArray();
        System.out.println("Вторая часть массива: " + Arrays.toString(secondPart));

        int sumOfSecondPart = Arrays.stream(array).skip(arrayLength).limit(arrayLength).sum();
        System.out.println("Сумма второй части массива: " + sumOfSecondPart);

        String resultSumDifference = (sumOfFirstPart > sumOfSecondPart ? "Сумма первой части массива больше" :
                "Сумма второй части массива больше");

        System.out.println(resultSumDifference);
        // вызовы методов и локальные переменные - в стеке, в хипе все остальное

    }
}
