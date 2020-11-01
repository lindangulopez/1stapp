import edu.duke.*;
import java.io.File;

public class PerimeterAssignmentRunner {
//1. Complete writing the method getNumPoints that has one 
//parameter s that is of type Shape. This method returns an 
//integer that is the number of points in Shape s. Hint: You 
//will need to iterate over all the points in the Shape S 
//and count them.    
    public int getNumPoints (Shape s) {
        int numPoints = 0;
        for(Point p : s.getPoints()){
            numPoints += 1;
        }
        return numPoints;
    }

//3. Complete writing the method getAverageLength that has 
//one parameter s that is of type Shape. This method returns 
//a number of type double that is the calculated average of 
//all the sides’ lengths in the Shape S.
    public double getAverageLength(Shape s) {
        // Put code here
        double length = getPerimeter(s);
        double numSides = (double) getNumPoints(s);
        double avgLength = length / numSides;
        return avgLength;
    }

//5. Complete writing the method getLargestSide that has one 
//parameter s that is of type Shape. This method returns a number 
//of type double that is the longest side in the Shape S.

    public double getLargestSide(Shape s) {
        // Put code here
        Point lastPoint = s.getLastPoint();
        double largestSide = 0.0;
        
        for(Point p : s.getPoints()){
            double dist = lastPoint.distance(p);
            if(dist > largestSide) {
                largestSide = dist;
            }
            lastPoint = p;
        }
        return largestSide;
    }

//7. Complete writing the method getLargestX that has one 
//parameter s that is of type Shape. This method returns a 
//number of type double that is the largest x value over all 
//the points in the Shape s.    

    public double getLargestX(Shape s) {
        // Put code here
        Point lastPoint = s.getLastPoint();
        int lastPointX = lastPoint.getX();
        double largestX = (double) lastPointX;
        
        for(Point p : s.getPoints()){
            int newX = p.getX();
            if(newX > largestX) {
                largestX = (double) newX;
            }
        }
        return largestX;
    }

////////////////////////////////////////////////////////////////////////
//2.1. Complete writing the method getLargestPerimeterMultipleFiles that 
//has no parameters. This method creates a DirectoryResource (so you can 
//select multiple files) and then iterates over these files. For each File 
//f, it converts the file into a FileResource with the line
//FileResource fr = new FileResource(f);
//
//Then it creates a Shape from the FileResource and calculates the shapes 
//perimeter. What else does it need to do? It needs to return the the 
//largest perimeter over all the shapes in the files you have selected.
////////////////////////////////////////////////////////////////////////

    public double getLargestPerimeterMultipleFiles() {
        // Put code here
        DirectoryResource dr = new DirectoryResource();
        double largestPerim = 0.0;
        FileResource largestFile = null;

        for(File f : dr.selectedFiles()){
            FileResource file = new FileResource(f);
            Shape shape = new Shape(file);
            double perim = getPerimeter(shape);
            if(perim > largestPerim) {
                largestPerim = perim;
            }
        }
        return largestPerim;
    }

    public String getFileWithLargestPerimeter() {
        // Put code here
        DirectoryResource dr = new DirectoryResource();
        double largestPerim = 0.0;
        File largestFile = null;

        for(File f : dr.selectedFiles()){
            FileResource file = new FileResource(f);
            Shape shape = new Shape(file);
            double perim = getPerimeter(shape);
            if(perim > largestPerim) {
                largestPerim = perim;
                largestFile = f;
            }
        }

        return largestFile.getName();
    }
//////////////////////////////////////////////////////////////////
//2.2. Finish writing the void method testPerimeterMultipleFiles 
//to call getLargestPerimeterMultipleFiles and to print out the 
//largest such perimeter. This method has no parameters and no 
//return value. You will select the files when you run this method 
//(hint: see our documentation for the DirectoryResource class).
///////////////////////////////////////////////////////////////////

    public void testPerimeterMultipleFiles() {
        // Put code here
        double largest = getLargestPerimeterMultipleFiles();
        System.out.println("Largest perimeter is: " + largest);
    }
//////////////////////////////////////////////////////////////////
//2.3. Finish writing the method getFileWithLargestPerimeter that 
//has no parameters. This method should, like the getLargestPerimeterMultipleFiles 
//method, create its own Directory Resource, except that this new 
//method returns the File that has the largest such perimeter, so it 
//has return type File.
//4. Add code to the method testFileWithLargestPerimeter to call getFileWithLargestPerimeter. 
//For the File that is returned, print the name of that file.
    public void testFileWithLargestPerimeter() {
        String file = getFileWithLargestPerimeter();
        System.out.println("Largest perimeter file is: " + file);
    }
    
//(a) The getPerimeter method has one parameter s of type Shape. Given a shape, 
//this method returns the perimeter of the shape.    
    public double getPerimeter (Shape s) {
        double totalPerim = 0.0;
        Point prevPt = s.getLastPoint();
        for (Point currPt : s.getPoints()) {
            double currDist = prevPt.distance(currPt);
            totalPerim = totalPerim + currDist;
            prevPt = currPt;
        }
        return totalPerim;
    }

//(c) The triangle method has no return value and creates a triangle that you can use 
//to test the methods you will create in this assignment.
    public void triangle(){
        Shape triangle = new Shape();
        triangle.addPoint(new Point(0,0));
        triangle.addPoint(new Point(6,0));
        triangle.addPoint(new Point(3,6));
        for (Point p : triangle.getPoints()){
            System.out.println(p);
        }
        double peri = getPerimeter(triangle);
        System.out.println("perimeter = "+peri);
    }

//(b) The testPerimeter method has no return value, hence its return type is void. 
//This method is used to select a data file by using the FileResource class, create 
//a shape based on the points from that data file, and then calculate the perimeter 
//of the shape and output its value. 
//2. Add code in the method testPerimeter to call getNumPoints and to print the result.
//4. Add code in the method testPerimeter to call the method getAverageLength and to 
//print out the result. Note if you were to select the file example1.txt, then the 
//average side length should be 4.0.
//6. Add code in the method testPerimeter to call the method getLargestSide and to print 
//out the result. Note if you were to select the file example1.txt, then the longest side 
//should be 5.0.   
//8. Add code in the method testPerimeter to call the method getLargestX and to print 
//out the result. Note if you were to select the file example1.txt, then the longest side 
//should be 4.0.
    
    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        int numPoints = getNumPoints(s);
        double averageLength = getAverageLength(s);
        double largestSide = getLargestSide(s);
        double largestX = getLargestX(s);
        
        System.out.println("perimeter = " + length);
        System.out.println("Number of Points: " + numPoints);
        System.out.println("Average Length: " + averageLength);
        System.out.println("Largest Side: " + largestSide);
        System.out.println("Largest X is: " + largestX );
        testPerimeterMultipleFiles();
        testFileWithLargestPerimeter();
    }

    // (d) This method prints names of all files in a chosen folder that you can 
    //use to test your other methods, see Assignment 2.
    public void printFileNames() {
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()) {
            System.out.println(f);
        }
    }
//(e) The main method, the program starts here:
    public static void main (String[] args) {
        PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
        pr.testPerimeter();
    }
}

//////////////////////////////////////////////////////////////////////////////
//Assignment 1: Calculating information about shapes//////////////////////////
//In this assignment, you will complete the PerimeterAssignmentRunner class/// 
//to calculate lots of interesting facts about shapes. This class has been ///
//started for you in the BlueJ project called assignmentPerimeter ////////////
//(go to: http://www.dukelearntoprogram.com/course2/files.php and download ///
//the Calculating the Perimeter of a Shape BlueJ project). This project also /
//contains several data files. In addition, you will need to look at the /////
//documentation for the Shape class and the Point class.//////////////////////
//////////////////////////////////////////////////////////////////////////////

//////////////////////////////////////////////////////////////////////////////
//Assignment 2: Processing multiple Shape files///////////////////////////////
//In this assignment you will find the largest perimeter over several shapes//
//by examining several files representing shapes, calculating the size of the/
//largest perimeter and also the name of the file with the largest perimeter./
//You will add new methods to the PerimeterAssignmentRunner class.////////////
//////////////////////////////////////////////////////////////////////////////
//The PerimeterAssignmentRunner class already includes the following method you 
//should understand the following. The printFileNames method has no parameters 
//and no return value, hence return type void. This method first creates a 
//DirectoryResource. When this happens you are prompted to select a file or files. 
//You can select a bunch of files together by clicking on the name of one file, 
//and then hold down the shift key and select a second file. All the files between 
//the first and second file will be highlighted. The code then iterates over all 
//the files you have selected using a for loop and the selectedFiles method, 
//printing out the filename for each file.////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////