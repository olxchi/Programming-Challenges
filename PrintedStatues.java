package Contest1;

import java.util.Scanner;

public class PrintedStatues {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int numstatues = myscan.nextInt();
        int numdays = 0;
        int printed = 0;
        int printernum = 1;

        if(numstatues == 1) {
            System.out.println(1);
        } else {
            while(printed < numstatues) {
                if ((numstatues - printed) > printernum) {
                    numdays++;
                    printernum++;
                } else {
                    numdays++;
                    printed += printernum;
                }
            }

        //    numdays++;

        }
        System.out.println(numdays);

    }


}
