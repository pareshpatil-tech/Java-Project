import java.util.Scanner;

public class PasswordStrengthChecker {
    // Password Strength Checker

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Password: ");
        String text = sc.nextLine();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }
            if (Character.isLowerCase(ch)) {
                hasLower = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }
        if (text.length() >= 8 && hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Strong Password !!!");
        } else {
            System.out.println("Weak Password !!!");
        }
    }
}
