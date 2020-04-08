import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        double secondParam;
        while (option!=0){
            System.out.println("Please enter the number of operation you want to use:" + "\n" +
                    "1. Weight Converter" + "\n" +
                    "2. Length Converter" + "\n" +
                    "3. Speed Converter" + "\n" +
                    "4. Time Converter" + "\n" +
                    "5. Temperature Converter" + "\n" +
                    "0. Exit");

            option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("You have chosen weight converter");
                    System.out.println("Please enter the number of operation you want to use:" + "\n" +
                            "1. Kilograms to Pounds" + "\n" +
                            "2. Pounds to Kilograms");
                    option = scanner.nextInt();
                    System.out.println("Please enter weight:");
                    secondParam = scanner.nextDouble();
                    System.out.println(Weight.selectParam(option, secondParam));
                    break;
                case 2:
                    System.out.println("You have chosen length converter");
                    break;
                case 3:
                    System.out.println("You have chosen speed converter");
                    break;
                case 4:
                    System.out.println("You have chosen time converter");
                    break;
                case 5:
                    System.out.println("You have chosen temperature converter");
                    break;
                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("There is no option " + option + "! Choose again.");
                    break;
            }
        }
    }
}
