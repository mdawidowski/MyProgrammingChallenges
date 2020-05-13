import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string of numbers separated by commas:");
        String stringNumbers = scanner.nextLine();
        stringNumbers = stringNumbers.replace(" ", "");
        stringNumbers = stringNumbers.replace(".", ",");
        String[] numbers = stringNumbers.split(",");
        int[] digits = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            digits[i] = Integer.parseInt(numbers[i]);
        }

        int temp, status = 1;
        while (status > 0){
            status = 0;
            for (int i = 0; i < digits.length-1; i++) {
                if (digits[i] > digits[i+1]){
                    temp = digits[i];
                    digits[i] = digits[i+1];
                    digits[i+1]= temp;
                    status += 1;
                }
            }
            for (int i = 0; i < digits.length; i++) {
                System.out.print(digits[i] + " ");
            }
            System.out.println();
        }
    }
}
