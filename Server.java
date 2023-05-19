import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        byte sData[] = new byte[1024];
        byte rData[] = new byte[1024];
        String msg;
        DatagramSocket ds = new DatagramSocket(5000);
        while (true) {
            DatagramPacket rPacket = new DatagramPacket(rData, rData.length);
            ds.receive(rPacket);

            msg = "Hello";
            sData = msg.getBytes();

            InetAddress ipadd = rPacket.getAddress();
            int port = rPacket.getPort();
            DatagramPacket sPacket = new DatagramPacket(sData, sData.length, ipadd, port);
            ds.send(sPacket);
        }
    }
}
