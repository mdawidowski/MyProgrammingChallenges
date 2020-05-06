import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert text:");
        String text = scanner.nextLine();
        String reversedText = "";
        for (int i = text.length()-1; i >= 0; i--) {
            reversedText = reversedText + String.valueOf(text.charAt(i));
        }
        System.out.println(reversedText);
    }
}
