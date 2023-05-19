import java.util.*;

public class CRC {

    static void rec(int data[], int divisor[]) {
        int rem[] = check(data, divisor);
        System.out.println("Remainder");
        for (int i = 0; i < rem.length; i++) {
            System.out.print(rem[i]);
        }
    }

    static int exor(int x, int y) {
        if (x == y) {
            return 0;
        }
        return 1;
    }

    static int[] check(int data[], int divisor[]) {
        int rem[] = new int[divisor.length];
        int dividend[] = new int[data.length + 1];
        int i, j;
        System.out.println("This is dividend");
        for (i = 0; i < data.length; i++) {
            dividend[i] = data[i];
            System.out.print(dividend[i]);
        }
        System.out.println();
        for (i = 0; i < divisor.length; i++)
            rem[i] = data[i];

        i = 0;
        while (i < data.length - divisor.length) {
            if (rem[0] == 1) {
                for (j = 1; j < divisor.length; j++) {
                    rem[j - 1] = exor(rem[j], divisor[j]);
                }
            } else {
                for (j = 1; j < divisor.length; j++) {
                    rem[j - 1] = rem[j];
                }
            }
            rem[divisor.length - 1] = dividend[i + divisor.length];
            i++;
            for (j = 0; j < divisor.length; j++) {

                System.out.print(rem[j]);
            }
            System.out.println();
        }
        return rem;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        int divsize = 5;
        // System.out.println("Enter the length of the divisor");
        // divsize = sc.nextInt();
        // System.out.println("Enter the bits of the divisor");
        // int divi[] = new int[divsize];
        int divi[] = { 1, 0, 1, 0, 1 };

        // for (i = 0; i < divsize; i++) {
        // divi[i] = sc.nextInt();
        // }
        int size = 9;
        // System.out.println("Enter the length of the data");
        // size = sc.nextInt();
        // System.out.println("Enter the bits of the data");
        int data[] = { 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0 };
        // for (i = 0; i < size; i++) {
        // data[i] = sc.nextInt();
        // }

        int rem[] = check(data, divi);
        for (i = 0; i < divsize; i++) {

            System.out.print(rem[i]);
        }

        int sentData[] = new int[14];
        for (i = 0; i < size; i++) {
            sentData[i] = data[i];
        }
        System.out.println();

        for (i = 0; i < divsize - 1; i++) {
            sentData[size + i] = rem[i];
        }
        for (i = 0; i < sentData.length; i++) {

            System.out.print(sentData[i]);
        }
        System.out.println();
        rec(sentData, divi);
    }
}
