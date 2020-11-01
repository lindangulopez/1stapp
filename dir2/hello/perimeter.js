/*Given a shape finds its perimeter:
* Draw a coordinate Grid
*Iterate through all points
* Compute each Lengths
/Sum All Lengths
////////////////////////////////////
//0. Start with totalPerim = 0
//1. Start with prevPt = last Point
//2. For each point currPt in the shape:
/////3. Find the distance of the prevPt to 
///////currPt, name it currDist
/////4. Update totalPerim to be 
///////totalPermin + currDist
/////5. Update prevPt to be currPt
//6. Return totalPerim
////////////////////////////////////






import edu.duke.*;

public class PerimeterRunner {
    public double getPerimeter (Shape s) {
        // Start with totalPerim = 0
        double totalPerim = 0.0;
        // Start wth prevPt = the last point 
        Point prevPt = s.getLastPoint();
        // For each point currPt in the shape,
        for (Point currPt : s.getPoints()) {
            // Find distance from prevPt point to currPt 
            double currDist = prevPt.distance(currPt);
            // Update totalPerim by currDist
            totalPerim = totalPerim + currDist;
            // Update prevPt to be currPt
            prevPt = currPt;
        }
        // totalPerim is the answer
        return totalPerim;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }

    public static void main (String[] args) {
        PerimeterRunner pr = new PerimeterRunner();
        pr.testPerimeter();
    }
}
