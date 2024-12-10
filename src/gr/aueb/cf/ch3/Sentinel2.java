package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int positivesCount = 0;
    Scanner in = new Scanner(System.in);
    int inputNumber = in.nextInt();

        System.out.println("Please insert a num");


        while((inputNumber = in.nextInt()) != 0) {


        positivesCount++;
        System.out.println("Please insert a num");
        inputNumber = in.nextInt();


    }

        System.out.println("Positives count: "+positivesCount);
}
}
