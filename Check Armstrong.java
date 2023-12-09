//Check Armstrong
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int p = n;
        int sumu = 0, s = 0, c = 0;

        if (p <= 9) {
            sumu = p + (int) Math.pow(s, 1);
        } else {
            while (temp != 0) {
                temp = temp / 10;
                c++;
            }

            temp = n;
            while (temp != 0) {
                s = temp % 10;
                sumu = sumu + (int) Math.pow(s, c);
                temp = temp / 10;
            }
        }

        if (sumu == p)
            System.out.print("true");
        else
            System.out.print("false");
    }
}
