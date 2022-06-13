package question4;

public class cheng {
    public static long calNum(int a) {
        return a <= 0 ? 1 : a * calNum(a - 1);
    }

    public static long ansCalNum(int a) {
        int ans = 1;
        for (int i = a; i > 0; i--) {
            ans *= i;
        }
        return ans;
    }

    public static void main(String[] args) {
        long l = calNum(3);
        System.out.println("l = " + l);
        long l1 = ansCalNum(3);
        System.out.println("l1 = " + l1);
    }
}
