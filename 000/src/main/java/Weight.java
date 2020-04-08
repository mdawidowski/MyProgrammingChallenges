import java.util.Scanner;

public class Weight {
    public static double selectParam(int param, double weight){
        if (param == 1){
            return kilogramsToPounds(weight);
        } else if (param == 2){
            return  poundsToKilograms(weight);
        } else {
            System.out.println("You have entered wrong number");
        }
        return 0;
    }
    public static double kilogramsToPounds(double weight){
        return weight*2.205;
    }

    public static double poundsToKilograms(double weight){
        return weight*0.45359237;
    }
}
