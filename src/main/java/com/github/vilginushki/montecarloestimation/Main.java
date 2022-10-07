package com.github.vilginushki.montecarloestimation;

public class Main {
    /**
     * Function is emulating Monte Carlo estimation of Pi method
     * Coordinates are randomized in range (-radius;radius)
     * Number of points is determined by int points
     */
    private static double simulate(int points, int radius) {
        int inCircle = 0;//Count points in circle
        for (int i = 0; i < points; i++) {
            double cordX = (Math.random() - 0.5) * 2 * radius;//Generate random coordinates for point
            double cordY = (Math.random() - 0.5) * 2 * radius;

            if ((Math.pow(cordX, 2) + Math.pow(cordY, 2)) <= radius * radius) {//check if point is in circle
                inCircle++;
            }
        }
        return (4 * ((double) inCircle / points));//return pi estimation

    }

    public static void main(String[] args) {
        System.out.printf("Estimated value of PI is: %6f\n", simulate((int) (1000000000), 1));//print pi estimation
    }
}
