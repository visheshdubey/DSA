public class GreatestGoodNumber {
    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
        ;
    }

    public static String largestGoodInteger(String num) {
        int arr[] = new int[10];

        for (int i = 0; i < num.length(); i++) {
            if (arr[num.charAt(i) - '0'] == 0) {
                arr[num.charAt(i) - '0'] = isGoodInteger(i, num);
            }
        }

        for (int i = 9; i >= 0; i--) {
            if (arr[i] == 1)
                return i * 100 + i * 10 + i + "";
        }

        return "";
    }

    public static int isGoodInteger(int index, String num) {
        if (index + 2 < num.length() &&
                num.charAt(index) == num.charAt(index + 1) &&
                num.charAt(index + 1) == num.charAt(index + 2)) {
            return 1;
        }

        return 0;
    }

}
