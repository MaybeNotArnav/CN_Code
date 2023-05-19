import java.util.*;

public class BitStuff {
    public static void main(String[] args) {
        // String flag = new String();
        Scanner sc = new Scanner(System.in);
        String frame = new String();
        String stuffFrame = new String();
        int i;
        System.out.println("Enter the frame");
        frame = sc.next();
        int count = 0;
        for (i = 0; i < frame.length(); i++) {
            stuffFrame += frame.charAt(i);
            if (frame.charAt(i) == '1') {
                count++;
                if (count == 5) {
                    stuffFrame += '0';
                    count = 0;
                }
            } else {
                count = 0;
            }

        }
        System.out.println(stuffFrame);
    }

}
