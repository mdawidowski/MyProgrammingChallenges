import java.util.Scanner;

public class IPCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert IPv4 address:");
        String ip = scanner.nextLine();
        System.out.println("Please insert subnet mask:");
        String subnetMask = scanner.nextLine();
        String[] ipParts = ip.split("\\.");
        String[] subnetMaskParts = subnetMask.split("\\.");
        if (Operations.checkWhetherIPIsCorrect(ipParts) == true && Operations.checkWhetherSubnetMaskIsCorrect(subnetMaskParts)){
            String[] binaryIP = Operations.getBinaryIP(ipParts);
            String[] binarySubnetMask = Operations.getBinarySubnetMask(subnetMaskParts);

            String network = Operations.getNetwork(binaryIP, binarySubnetMask);
            System.out.println("Network is " + network);

            String broadcast =  Operations.getBroadcast(binaryIP, binarySubnetMask);
            System.out.println("Broadcast is " + broadcast);

            System.out.println("First host is " + Operations.getFirstHost(network.split("\\.")));

            System.out.println("Last host is " + Operations.getLastHost(broadcast.split("\\.")));
        }
    }
}
