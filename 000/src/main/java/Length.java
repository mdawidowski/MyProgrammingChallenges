public class Length {
    public static double selectParam(int param, double length){
        if (param == 1){
            return  metersToFeet(length);
        } else if (param == 2){
            return feetToMeters(length);
        } else {
            System.out.println("You have entered wrong number");
        }
        return 0;
    }

    public static double metersToFeet(double length){
        return length*3.2808399;
    }

    public static double feetToMeters(double length){
        return length*0.304;
    }

}
