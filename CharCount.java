import java.util.*;

public class CharCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str[] = new String[3];
        int len[] = new int[3];
        int i;
        for (i = 0; i < 3; i++) {
            str[i] = sc.nextLine();

            len[i] = str[i].length();
        }
        for (i = 0; i < 3; i++) {
            System.out.print(str[i] + len[i]);
        }
        sc.close();
    }
}
