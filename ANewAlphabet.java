package Contest1;

import java.util.*;

public class ANewAlphabet {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "@");
        map.put("b", "8");
        map.put("c", "(");
        map.put("d", "|)");
        map.put("e", "3");
        map.put("f", "#");
        map.put("g", "6");
        map.put("h", "[-]");
        map.put("i", "|");
        map.put("j", "_|");
        map.put("k", "|<");
        map.put("l", "1");
        map.put("m", "[]\\/[]");
        map.put("n", "[]\\[]");
        map.put("o", "0");
        map.put("p", "|D");
        map.put("q", "(,)");
        map.put("r", "|Z");
        map.put("s", "$");
        map.put("t", "']['");
        map.put("u", "|_|");
        map.put("v", "\\/");
        map.put("w", "\\/\\/");
        map.put("x", "}{");
        map.put("y", "`/");
        map.put("z", "2");

        Scanner myscan = new Scanner(System.in);
        String linetotranslate = myscan.nextLine();
        String[] arr = linetotranslate.split("");

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i].toLowerCase())) {
                String value = map.get(arr[i].toLowerCase());
                arr[i] = value;
            }
        }

        String finalstring = String.join("", arr);
        System.out.println(finalstring);

    }


}
