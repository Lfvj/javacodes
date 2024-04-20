import java.util.HashMap;
public class yy {
    public static void main(String[] args) {
        String input = "aabc";
        for (int i = 0; i < input.length(); i++) {
            HashMap<Character, Integer> countMap = new HashMap<>();
            for (int j = i; j < input.length(); j++) {
                countMap.put(input.charAt(j), countMap.getOrDefault(input.charAt(j), 0) + 1);
                if (countMap.size() > 1) continue;
                System.out.print(input.charAt(j));
                System.out.print(countMap.get(input.charAt(j)) == 1 ? "" : Integer.toString(countMap.get(input.charAt(j)) - 1));
                System.out.print("");
                break;
            }
        }
    }
}