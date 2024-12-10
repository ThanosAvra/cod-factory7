package gr.aueb.cf.ch4;

/**
 * Calculates sum and mul of the
 * 18 first integers.
 */
public class ForSumMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++) {
           sum += i;   //sum = sum + 1;
            mul *= i;  //mul = mul * i
        }
        System.out.println("sum: " + sum);
                System.out.println("mul: " + mul);
    }
}