import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            map.put(num, 10);
        }
        return false;
    }
}

class Driver {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int input[] = { 1, 2, 3, 4, 4 };
        sol.containsDuplicate(input);
    }
}