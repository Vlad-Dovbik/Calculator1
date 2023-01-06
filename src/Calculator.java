import java.util.Scanner;

public class Calculator {
    public static String calc(String input) {
        String[] arr = input.split(" ");
        int number1 = Integer.parseInt(arr[0]);
        int number2 = Integer.parseInt(arr[2]);
        String str = arr[1];
        int result;
        if (number1 <= 0 || number1 > 10 || number2 <= 0 || number2 > 10) {
            return "throws Exception";
        } else {
            switch (str) {

                case "+":
                    result = number1 + number2;
                    return number1 + " + " + number2 + " = " + result;

                case "-":
                    result = number1 - number2;
                    return number1 + " - " + number2 + " = " + result;

                case "*":
                    result = number1 * number2;
                    return number1 + " * " + number2 + " = " + result;

                case "/":
                    result = number1 / number2;
                    return number1 + " / " + number2 + " = " + result;

                default:
                    return "throws Exception";
            }
        }
    }

    public static void main(String[] args) {
        String str;
        Scanner s = new Scanner(System.in);
        System.out.println("Введите 2 целых числа от 1 до 10 включительно и операцию между ними. прим: 2 + 6");
        str = s.nextLine();
       System.out.println(Calculator.calc(str));
    }
}

