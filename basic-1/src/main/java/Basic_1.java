import java.util.Random;
import java.util.Scanner;

public class Basic_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int msg = scanner.nextInt();

        switch (msg) {
            case 1:
                greetings();
                break;
            case 2:
                checkSign(randomVal(), randomVal(), randomVal());
                break;
            case 3:
                selectColor(randomVal());
                break;
            case 4:
                compareNumbers(randomVal(), randomVal());
                break;
            case 5:
                addOrSubtractAndPrint(randomVal(), randomVal(), randomBoolean());
                break;
            default:
                break;
        }


    }

    public static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("From");
        System.out.println("Java");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        String resultSum = sum > 0 ? "Сумма положительная" : "Сумма отрицательная";
        System.out.println(resultSum);
    }

    public static void selectColor(int data) {
        if (data <= 10) System.out.println("Красный");
        else if (data > 10 && data <= 20) System.out.println("Желтый");
        else if (data > 20) System.out.println("Зеленый");
    }

    public static void compareNumbers(int a, int b) {
        String resultCompare = a > b ? "a >= b" : "a < b";
        System.out.println(resultCompare);

    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        int resultOperation = increment ? initValue + delta : initValue - delta;
        System.out.println(resultOperation);

    }

    public static int randomVal() {
        return (int) (Math.random() * (200 + 1)) - 100;
    }

    public static boolean randomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }


}
