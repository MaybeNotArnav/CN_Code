import java.net.*;

public class Client {
    public static void main(String[] args) throws Exception {

        byte sData[] = new byte[1024];
        byte rData[] = new byte[1024];
        String msg = " ";

        DatagramSocket ds = new DatagramSocket();
        sData = msg.getBytes();
        InetAddress ipadd = InetAddress.getByName("localhost");

        DatagramPacket sPacket = new DatagramPacket(sData, sData.length, ipadd, 5000);
        ds.send(sPacket);

        DatagramPacket rPacket = new DatagramPacket(rData, rData.length);
        ds.receive(rPacket);
        msg = new String(rPacket.getData());
        System.out.println(msg);

    }
}
