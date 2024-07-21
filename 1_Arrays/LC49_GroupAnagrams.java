import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC49_GroupAnagrams {

    public static void main(String[] args) {
        String arr[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(groupAnagrams(arr));
        ;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char carr[] = new char[26];
            for (char c : s.toCharArray()) {
                carr[c - 'a']++;
            }
            String keyStr = String.valueOf(carr);
            System.out.println(carr);
            if (!map.containsKey(keyStr))
                map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }

}
