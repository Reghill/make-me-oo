package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point to) {
        double xDistance = xDistance(to);
        double yDistance = yDistance(to);
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    private double xDistance(Point to) {
        return to.x - x;
    }

    public double direction(Point to) {
        double xDistance = xDistance(to);
        double yDistance = yDistance(to);
        return Math.atan2(yDistance, xDistance);
    }

    private double yDistance(Point to) {
        return to.y - y;
    }
}
