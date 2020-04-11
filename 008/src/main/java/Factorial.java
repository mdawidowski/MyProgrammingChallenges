import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert number of factorial:");
        int number = scanner.nextInt();
        System.out.println(factorial(number, result));
    }

    private static int factorial(int number, int result){
        result *= number;
        if (number==1){
            return result;
        } else {
            return factorial(number - 1, result);
        }
    }
}
