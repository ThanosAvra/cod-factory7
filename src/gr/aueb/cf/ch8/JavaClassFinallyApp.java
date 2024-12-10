package gr.aueb.cf.ch8;

import java.util.InputMismatchException;

public class JavaClassFinallyApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int num = 0;

    try

    {
        System.out.println("Please insert a num");
        num = in.nextInt();
    } catch (InputMismatchException e) {
        e.printStackTrace();
    }finally {
        try {
            if (in != null) in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
}
