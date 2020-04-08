import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in Simple Calculator");
        int option = 1;
        double first_value, second_value;
        while (option != 0){
            System.out.println("Choose an option: " + "\n" +
                    "1. Addition" + "\n" +
                    "2. Subtraction" + "\n" +
                    "3. Multiplication" + "\n" +
                    "4. Division" + "\n" +
                    "5. Exponentation" + "\n" +
                    "0. Exit");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("You have chosen addition. Insert two numbers");
                    first_value = scanner.nextDouble();
                    second_value = scanner.nextDouble();
                    System.out.println(Functionalities.addition(first_value, second_value));
                    break;
                case 2:
                    System.out.println("You have chosen subtraction. Insert two numbers");
                    first_value = scanner.nextDouble();
                    second_value = scanner.nextDouble();
                    System.out.println(Functionalities.subtraction(first_value, second_value));
                    break;
                case 3:
                    System.out.println("You have chosen multiplication. Insert two numbers");
                    first_value = scanner.nextDouble();
                    second_value = scanner.nextDouble();
                    System.out.println(Functionalities.multiplication(first_value, second_value));
                    break;
                case 4:
                    System.out.println("You have chosen division. Insert two numbers");
                    first_value = scanner.nextDouble();
                    second_value = scanner.nextDouble();
                    if (second_value != 0) {
                        System.out.println(Functionalities.division(first_value, second_value));
                    } else {
                        System.out.println("Second value must be different than 0");
                    }
                    break;
                case 5:
                    System.out.println("You have chosen exponentation. Insert two numbers");
                    first_value = scanner.nextDouble();
                    int exponentation_value = scanner.nextInt();
                    System.out.println(Functionalities.exponentation(first_value, exponentation_value));
                    break;
                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("You have chosen wrong number!");
            }
        }

    }
}
