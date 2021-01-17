So Shivam had just learned about OOP. He had written a program before that did two things,
- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference - 

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```
He thought it'll be a good idea to convert this to Object Oriented Programming. So he wrote a new implementation in package `org.oop`, he got 2 classes - 
- `org.oop.DistanceAndDirectionCalculator`
- `org.oop.Point`

However, his trainer told him that what he did is not Object Oriented programming and asked Shivam to try again. 
- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.


**Problem Articulation**

Some of the problems in Shivam's OOP solution are listed below:
* `final` keyword is not used for the properties of Point `x` and `y` . It should have been used because if the properties x and y are changed, then it would become a different `point` altogether. 
* Unused setters are implemented in Point.java
* There are no behaviours in `Point.java`. The distance calculation is between two points and direction is with respect to two points. 
  Also, the calculation is done in `DistanceAndDirectionCalculator` class by getting Point values using getters. This should not be done by the principle of `Tell Don't Ask`.
  Hence distance and direction calculation should have been done in Point.java.
* Thus, `DistanceAndDirectionCalculator.java` is not required and could be deleted. 