import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine().replace(" ", "");
        String[] mas = s.split("");
        LinkedHashMap<Character, Integer> fD = new LinkedHashMap<>();
        char[] symbols = in.nextLine().replace(" ", "").toCharArray();
        for (char sym : symbols) {
            int val;
            if (fD.containsKey(sym)) val = fD.get(sym) + 1;
            else val = 1;
            fD.put(sym, val);
        }
        for (char key : fD.keySet()) {
            System.out.println(key + " : " + fD.get(key));
        }
    }
}
