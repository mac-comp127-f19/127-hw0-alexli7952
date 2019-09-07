package edu.macalester.comp127.hw0;

/**
 * @author Shilad Sen
 */
public class Area {
    /**
     * Calculates the area of a square.
     * @param sideLength The length of the side of a square
     * @return The area
     */
    public static double getSquareArea(double sideLength) {
        double ASqr;
        ASqr = Math.pow(sideLength, 2);
        return ASqr;
    }

    /**
     * Calculates the area of a circle.
     * @param radius The radius of the circle
     * @return The area
     */
    public static double getCircleArea(double radius) {
        double ACir;
        ACir = Math.pow(radius, 2) * Math.PI;
        return ACir;
    }

}
