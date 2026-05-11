import java.util.*;

class FindDuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(map.containsKey(ch)) {

                int prev = map.get(ch);

                map.put(ch, prev + 1);
            }
            else {

                map.put(ch, 1);
            }
        }

        for(char ch : map.keySet()) {

            if(map.get(ch) > 1) {

                System.out.println(ch);
            }
        }
    }
}
