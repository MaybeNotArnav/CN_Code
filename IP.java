import java.util.*;

public class IP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = new String();
        String subnet = new String();
        System.out.println("Enter the Ip addresss");
        ip = sc.next();

        int index = ip.indexOf(".");
        int ipClass = Integer.parseInt(ip.substring(0, index));

        if (ipClass >= 1 && ipClass <= 127) {
            subnet = "255.0.0.0";
            System.out.println("The class is A and subnet mask is 255.0.0.0");
        }

        else if (ipClass >= 128 && ipClass <= 191) {
            subnet = "255.255.0.0";
            System.out.println("The class is B and subnet mask is 255.255.0.0");
        } else if (ipClass >= 192 && ipClass <= 223) {
            subnet = "255.255.255.0";
            System.out.println("The class is C and subnet mask is 255.255.255.0");
        } else if (ipClass >= 224 && ipClass <= 239) {
            System.out.println("The class is D and subnet mask is not valid as it is used for Broadcast");
        } else if (ipClass >= 240 && ipClass <= 255) {
            System.out
                    .println("The class is E and subnet mask is not valid as it is reserved fir experimental purposes");
        } else {
            System.out.println("The current IP is not valid");
        }

        String[] ipArr = ip.split("\\.");
        String[] subnetMask = subnet.split("\\.");
        String networkString = new String();
        for (int i = 0; i < 4; i++) {
            networkString += Integer.toString(Integer.parseInt(ipArr[i]) & Integer.parseInt(subnetMask[i]));
            networkString += ".";
        }

        System.out.println(networkString);

    }
}
