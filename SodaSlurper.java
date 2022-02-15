package Contest1;

import java.util.Scanner;

public class SodaSlurper {

    public static int sodaslurp(int e,int f,int cost) {
        int emptybottles = e + f;
        int boughtbottles = 0;
        int consumed = 0;
        int a = emptybottles % cost;
        int b = (int) Math.floor(emptybottles/cost);

        if (emptybottles < cost) {
            return 0;
        }

        while (emptybottles >= cost) {
            a = emptybottles % cost;
            b = (int) Math.floor(emptybottles/cost);
            consumed += (b);

            emptybottles = b+a;

    }

        return consumed;
}

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int e = myscan.nextInt();
        int f = myscan.nextInt();
        int cost = myscan.nextInt();
        System.out.println(sodaslurp(e,f,cost));

}
}
