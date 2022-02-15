package Contest1;

import java.util.ArrayList;
import java.util.Scanner;

public class EngineeringEnglish {
    public static void main (String[] args) {

        Scanner myscan = new Scanner(System.in);
        ArrayList<String> reusedwords = new ArrayList<String>();
        while(myscan.hasNextLine()) {
            String myline = myscan.nextLine();
            String[] mywords = myline.split(" ");

            for (int i = 0; i < mywords.length; i++) {
                if (reusedwords.contains(mywords[i].toLowerCase())) {
                    mywords[i] = ".";
                } else {
                    reusedwords.add(mywords[i].toLowerCase());
                }
            }
            String fullstring = String.join(" ", mywords);
            System.out.println(fullstring);


        }

    }


}
