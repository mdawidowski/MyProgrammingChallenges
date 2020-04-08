public class Speed {
    public static double selectParam(int param, double speed){
        if (param == 1){
            return  kmhTomph(speed);
        } else if (param == 2){
            return mphTokmh(speed);
        } else {
            System.out.println("You have entered wrong number");
        }
        return 0;
    }

    public static double kmhTomph(double speed){
        return speed*0.621371192;
    }

    public static double mphTokmh(double speed){
        return speed*1.609344;
    }
}
