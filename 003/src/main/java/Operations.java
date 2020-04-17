import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Operations {

    public static Boolean checkWhetherIPIsCorrect(String[] ip){
        if (ip.length == 4) {
            for (int i = 0; i < ip.length; i++) {
                if (Integer.parseInt(ip[i]) > 255 && ip[i].length()>3) {
                    System.out.println("You have entered wrong IP number!");
                    return false;
                }
            }
            return true;
        }
        System.out.println("You have entered wrong IP number!");
        return false;
    }

    public static Boolean checkWhetherSubnetMaskIsCorrect(String[] subnetMask){
        if (subnetMask.length == 4){
            for (int i = 0; i < subnetMask.length; i++) {
                if (Integer.parseInt(subnetMask[i])>255 && subnetMask[i].length()>3){
                    System.out.println("You have entered wrong Subnet Mask!");
                    return false;
                }
            }
            return true;
        }
        System.out.println("You have entered wrong Subnet Mask!");
        return false;
    }

    private static String to8BitBinary(int number){
        String binary = Integer.toBinaryString(number);
        while (binary.length() < 8){
            binary = "0" + binary;
        }
        return binary;
    }

    public static String[] getBinaryIP(String[] ip){
        String[] binaryIP = new String[4];
        for (int i = 0; i < ip.length; i++) {
            binaryIP[i] = to8BitBinary(Integer.parseInt(ip[i]));
        }
        return binaryIP;
    }

    public static String[] getBinarySubnetMask(String[] subnetMask){
        String[] binarySubnetMask = new String[4];
        for (int i = 0; i < subnetMask.length; i++) {
            binarySubnetMask[i] = to8BitBinary(Integer.parseInt(subnetMask[i]));
        }
        return binarySubnetMask;
    }

    public static String getNetwork(String[] ip, String[] subnetMask){
        for (int i = 0; i < subnetMask.length; i++) {
            for (int j = 0; j < subnetMask[i].length(); j++) {
                if (subnetMask[i].charAt(j) == '0'){
                    ip[i] = ip[i].substring(0, j) + '0' + ip[i].substring(j+1);
                }
            }
        }
        String network = Integer.parseInt(ip[0], 2) + "." + Integer.parseInt(ip[1], 2) + "." + Integer.parseInt(ip[2], 2) + "." + Integer.parseInt(ip[3], 2);
        return network;
    }

    public static String getBroadcast(String[] ip, String[] subnetMask){
        for (int i = 0; i < subnetMask.length; i++) {
            for (int j = 0; j < subnetMask[i].length(); j++) {
                if (subnetMask[i].charAt(j) == '0'){
                    ip[i] = ip[i].substring(0, j) + '1' + ip[i].substring(j+1);
                }
            }
        }
        String broadcast = Integer.parseInt(ip[0], 2) + "." + Integer.parseInt(ip[1], 2) + "." + Integer.parseInt(ip[2], 2) + "." + Integer.parseInt(ip[3], 2);
        return broadcast;
    }

    public static String getFirstHost(String[] network){
        if (Integer.parseInt(network[3]) < 255){
            network[3] = String.valueOf(Integer.parseInt(network[3])+1);
        }
        String firstHost = network[0]+ "." + network[1]+ "." + network[2]+ "." + network[3];
        return firstHost;
    }

    public static String getLastHost(String[] broadcast){
        if (Integer.parseInt(broadcast[3]) > 0){
            broadcast[3] = String.valueOf(Integer.parseInt(broadcast[3])-1);
        }
        String lastHost = broadcast[0]+ "." + broadcast[1]+ "." + broadcast[2]+ "." + broadcast[3];
        return lastHost;
    }
}
