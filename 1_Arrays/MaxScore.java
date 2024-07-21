import java.util.Arrays;

public class MaxScore {
    public static void main(String[] args) {
        System.out.println(maxScore("011101"));
        ;
    }

    public static int maxScore(String s) {
        int maxScore = 0;
        int leftZeros = 0;
        int rightOnes = 0;

        // Count the number of ones in the string initially
        for (char c : s.toCharArray()) {
            if (c == '1') {
                rightOnes++;
            }
        }

        // Iterate through the string and calculate the score for each split
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                leftZeros++;
            } else {
                rightOnes--;
            }

            int currentScore = leftZeros + rightOnes;
            maxScore = Math.max(maxScore, currentScore);
        }

        return maxScore;
    }
}
