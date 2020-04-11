import java.text.DecimalFormat;
import java.util.Scanner;

public class BMICalculator {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in BMI Calculator! \nPlease insert your height in centimeters: ");
        double height = scanner.nextDouble()/100;
        System.out.println("Please insert your weight in kilogrammes:");
        double weight = scanner.nextDouble();
        double result = weight/(height*height);
        if (result<18.5){
            System.out.println("Your BMI is " + df2.format(result) + " Oh no! You are underweight!");
        } else if (result>= 18.5 && result<=25){
            System.out.println("Your BMI is " + df2.format(result) + " Good job, your BMI is perfect!");
        } else if (result>25){
            System.out.println("Your BMI is " + df2.format(result) + " Oh no! You are overweight!");
        }
    }
}
