public class Functionalities {

    public static double addition(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }

    public static double subtraction(double firstNumber, double secondNumber){
        return firstNumber-secondNumber;
    }

    public static double multiplication(double firstNumber, double secondNumber){
        return firstNumber*secondNumber;
    }

    public static double division(double firstNumber, double secondNumber){
        return firstNumber/secondNumber;
    }

    public static double exponentation(double firstNumber, int secondNumber){
        double result = 1;
        for (int i = 0; i < secondNumber; i++) {
            result*=firstNumber;
        }
        return result;
    }

}
