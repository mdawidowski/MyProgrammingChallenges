import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert integer:");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number > 1){
            for (int i = 2; i <= 7; i++) {
                if (number % i == 0 && number != i){
                    isPrime = false;
                }
            }
        } else {
            System.out.println("Number must be greater than 1!");
            isPrime = false;
        }
        if (isPrime){
            System.out.println("Number "  + number + " is prime!");
        } else {
            System.out.println("Number "  + number + " is not prime!");
        }
    }
}
