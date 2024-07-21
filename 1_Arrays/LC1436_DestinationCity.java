import java.util.List;

public class LC1436_DestinationCity {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // List<List<String>> paths = new List<>();
        // [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
        // System.out.println(sol.destCity(paths));
    }
}

class Solution {
    public String destCity(List<List<String>> paths) {
        for (int i = 0; i < paths.size(); i++) {
            String city2 = paths.get(i).get(1);

            int hasOutgoingPath = 0;
            for (int j = 0; j < paths.size(); j++) {
                String city1 = paths.get(j).get(0);

                if (city2.equals(city1)) {
                    hasOutgoingPath = 1;
                    break;
                }
            }

            if (hasOutgoingPath == 0)
                return city2;
        }

        return "";
    }
}