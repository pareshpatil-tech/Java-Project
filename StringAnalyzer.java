import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        // String Analyzer
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = sc.nextLine();
        int count = 0;
        int upper = 0;
        int lower = 0;
        int digits = 0;
        int spaces = 0;
        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                upper++;
            }
            if (Character.isLowerCase(ch)) {
                lower++;
            }
            if (ch == 'a' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'e') {
                vowels++;
            }
            if (ch == ' ') {
                spaces++;
            }
            if (Character.isDigit(ch)) {
                digits++;
            }

        }
        System.out.println("-----String Analyzer-----");
        System.out.println("Uppercase : " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("vowels: " + vowels);
        System.out.println("Spaces: " + spaces);
        System.out.println("digits: " + digits);

    }
}