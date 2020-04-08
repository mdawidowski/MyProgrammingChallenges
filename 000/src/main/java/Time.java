public class Time {
    public static double selectParam(int param, double time){
        if (param == 1){
            return  hoursToMinutes(time);
        } else if (param == 2){
            return minutesToHours(time);
        } else {
            System.out.println("You have entered wrong number");
        }
        return 0;
    }

    public static double hoursToMinutes(double time){
        return time*60;
    }

    public static double minutesToHours(double time){
        return time/60;
    }
}
