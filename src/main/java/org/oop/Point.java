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
        double distance = Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
        return distance;
    }

    public double direction(Point to) {
        double xDistance = to.x - x;
        double yDistance = to.y - y;
        double direction = Math.atan2(yDistance, xDistance);
        return direction;
    }
}
