public class SignOfArray {
    public static void main(String[] args) {

        int arr[] = { 9, 72, 34, 29, -49, -22, -77, -17, -66, -75, -44, -30, -24 };
        System.out.println(arraySign(arr));
    }

    public int arraySign(int[] nums) {
        int negative = 0;

        for (int i : nums) {
            if (i == 0)
                return 0;

            if (i < -1)
                negative++;
        }

        if (negative % 2 != 0)
            return -1;

        return 1;
    }
}
