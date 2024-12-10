package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is dark.
 */
public class LightsOn {

    public static void main(String[] args) {
        final int MAX_CAR_SPEED = 100;
        boolean isRaining = false;
        boolean isDark = false;
        Scanner sc = new Scanner(System.in);
        boolean isCarRunning = false;
        boolean areLightsOn = false;
        int carSpeed;

        System.out.println("Please insert if it is raining: ");
        isRaining = sc.nextBoolean();

        System.out.println("Please insert if it is dark: ");
        isDark = sc.nextBoolean();

        System.out.println("Please insert car speed: ");
        carSpeed = sc.nextInt();

        isCarRunning = carSpeed > MAX_CAR_SPEED;
        //areLightsOn = isRaining && (isDark) // (isRaining && isCarRunning);
        areLightsOn = isCarRunning && isRaining && isDark;


        System.out.println("Turn lights on: " + areLightsOn);
    }
}
