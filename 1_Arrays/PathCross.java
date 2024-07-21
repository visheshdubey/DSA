import java.util.ArrayList;
import java.util.List;

public class PathCross {

    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        System.out.println(sol.isPathCrossing("ENNNNNNNNNNNEEEEEEEEEESSSSSSSSSS"));
    }

}

class Solution2 {
    public boolean isPathCrossing(String path) {
        List<String> list = new ArrayList<>();

        int origin[] = { 0, 0 };

        char c[] = path.toCharArray();

        list.add("0,0");

        for (char item : c) {
            switch (item) {
                case 'N':
                    origin[1] += 1;
                    break;
                case 'S':
                    origin[1] -= 1;
                    break;
                case 'E':
                    origin[0] += 1;
                    break;
                case 'W':
                    origin[0] -= 1;
                    break;
            }

            String originStr = origin[0] + "," + origin[1];
            System.out.println(originStr);
            if (list.contains(originStr)) {
                return true;
            }

            list.add(originStr);
        }

        return false;
    }
}