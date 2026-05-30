import java.util.Scanner;

public class Calculator {
    // Calculator...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number1:- ");
        float num1 = sc.nextInt();

        System.out.println("Enter operator:- ");
        char operator = sc.next().charAt(0);

        System.out.println("Enter the number 2:- ");
        int num2 = sc.nextInt();

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                break;

            default:
                System.out.println("Invalid Operator");
                return;
        }

        System.out.println("Result:- " + result);

    }
}