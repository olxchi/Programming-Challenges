package Contest1;

import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int numqueries = Integer.parseInt(myscan.nextLine());

        for (int i = 0; i < numqueries; i++) {
            //get line
            String myline = myscan.nextLine();
            String[] mywords = myline.split(" ");

            if (mywords.length < 2) {
                continue;
            }

            if (mywords[0].equals("Simon") && mywords[1].equals("says")) {
                mywords[0] = "";
                mywords[1] = "";
               System.out.println(myline.substring(10));
            }

        }
    }

}
