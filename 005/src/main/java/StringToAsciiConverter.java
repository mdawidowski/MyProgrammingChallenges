import java.util.Scanner;

public class StringToAsciiConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in String to Ascii Converter! Please insert text:");
        String text = scanner.nextLine();
        System.out.println("Ascii value is:");
        for (int i = 0; i < text.length(); i++) {
            if ((int)text.charAt(i) != 32){
                System.out.print((int)text.charAt(i) + " ");
            }
        }
    }
}
