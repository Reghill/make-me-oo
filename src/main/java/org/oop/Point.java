package org.oop;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point to) {
        double xDistance = to.x - x;
        double yDistance = to.y - y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double direction(Point to) {
        double xDistance = to.x - x;
        double yDistance = to.y - y;
        return Math.atan2(yDistance, xDistance);
    }
}
