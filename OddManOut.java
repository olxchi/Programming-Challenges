package Contest1;

import java.util.*;

public class OddManOut {

    public static int oddmanout(int[] guests) {
        Stack<Integer> mystack = new Stack<Integer>();

        for (int k = 0; k < guests.length; k++) {
            // check if it's the last integer
            if (k == guests.length - 1) {
                return guests[k];
            }

            //push onto stack
            if (mystack.isEmpty()) {
                mystack.push(guests[k]);
                continue;
            }

            if (guests[k] == mystack.peek()) {
                mystack.pop();
                continue;
            }

            return mystack.peek();

        }

        return mystack.peek();
    }

    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int numtestcases = myscan.nextInt();

        // for every test case
        for (int i = 0; i < numtestcases; i++) {
            int numguests = myscan.nextInt();
            ArrayList<Integer> mylist = new ArrayList<>();
            int[] guestcode = new int[numguests];
            // for every guest
            for (int j = 0; j < numguests; j++) {
                guestcode[j] = myscan.nextInt();
            }

            Arrays.sort(guestcode);

            System.out.println("Case #" + (i + 1) + ": " + oddmanout(guestcode));


        }


    }
}
