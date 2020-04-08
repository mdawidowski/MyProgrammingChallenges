public class Temperature {
    public static double selectParam(int param, double temperature){
        if (param == 1){
            return  celsiusToFahrenheit(temperature);
        } else if (param == 2){
            return fahrenheitToCelsius(temperature);
        } else {
            System.out.println("You have entered wrong number");
        }
        return 0;
    }

    public static double celsiusToFahrenheit(double temperature){
        return (temperature*2)+32;
    }

    public static double fahrenheitToCelsius(double temperature){
        return (temperature-32)/2;
    }
}
