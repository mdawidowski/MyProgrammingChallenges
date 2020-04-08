import java.util.Scanner;

import static java.lang.System.out;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        double secondParam;
        while (option!=0){
            out.println("Please enter the number of operation you want to use:" + "\n" +
                    "1. Weight Converter" + "\n" +
                    "2. Length Converter" + "\n" +
                    "3. Speed Converter" + "\n" +
                    "4. Time Converter" + "\n" +
                    "5. Temperature Converter" + "\n" +
                    "0. Exit");

            option = scanner.nextInt();
            switch (option){
                case 1:
                    out.println("You have chosen weight converter");
                    out.println("Please enter the number of operation you want to use:" + "\n" +
                            "1. Kilograms to Pounds" + "\n" +
                            "2. Pounds to Kilograms");
                    option = scanner.nextInt();
                    out.println("Please enter weight:");
                    secondParam = scanner.nextDouble();
                    out.println(Weight.selectParam(option, secondParam));
                    break;
                case 2:
                    out.println("You have chosen length converter");
                    out.println("Please enter the number of operation you want to use:" + "\n" +
                            "1. Meters to Feet" + "\n" +
                            "2. Feet to Meters");
                    option = scanner.nextInt();
                    out.println("Please enter length:");
                    secondParam = scanner.nextDouble();
                    out.println(Length.selectParam(option, secondParam));
                    break;
                case 3:
                    out.println("You have chosen speed converter");
                    out.println("You have chosen temperature converter");
                    out.println("Please enter the number of operation you want to use:" + "\n" +
                            "1. KMH to MPH" + "\n" +
                            "2. MPH to KMH");
                    option = scanner.nextInt();
                    out.println("Please enter speed:");
                    secondParam = scanner.nextDouble();
                    out.println(Speed.selectParam(option, secondParam));
                    break;
                case 4:
                    out.println("You have chosen time converter");
                    out.println("Please enter the number of operation you want to use:" + "\n" +
                            "1. Hours to Minutes" + "\n" +
                            "2. Minutes to Hours");
                    option = scanner.nextInt();
                    out.println("Please enter time:");
                    secondParam = scanner.nextDouble();
                    out.println(Time.selectParam(option, secondParam));
                    break;
                case 5:
                    out.println("You have chosen temperature converter");
                    out.println("Please enter the number of operation you want to use:" + "\n" +
                            "1. Celsius to Fahrenheit" + "\n" +
                            "2. Fahrenheit to Celsius");
                    option = scanner.nextInt();
                    out.println("Please enter temperature:");
                    secondParam = scanner.nextDouble();
                    out.println(Temperature.selectParam(option, secondParam));
                    break;
                case 0:
                    out.println("Exiting program");
                    break;
                default:
                    out.println("There is no option " + option + "! Choose again.");
                    break;
            }
        }
    }
}
