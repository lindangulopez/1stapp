
// An Example of a class Declarion, 
// a template to make objects:

// Declare a class called Point
public class Point {
// Declarion of two variables, 
// fields or instance objects:
// only code in the class can 
// manipulate, as private
	private int x;
	private int y;
// Constructor Declarion, how
// to create the objects:
	public Point(int startx, int starty){
		x=startx
		y=starty
//looks like a function but
//no return type and is 
//named the same as the class
//it is public, any code can use 
//the constructor to create a point
	}
//Declaration of three methods:
// getX, getY and distance are 
//functions inside a class which 
//act on another object
	public int getX() {return x;}
	public int getY() {return y;}
	public double distance(Point otherPt){
		int dx = x-otherPt.getX();
		int dy = y-otherPt.getY();
//they return a value
		return Math.sqrt(dx*dx+dy*dy);
	}
//Here's a static method, it does not act 
//on any of the instances, here it is 
// the main which means that excecution will 
// begin here:
	public static void main(String[] args) {
		Point p1 = new Point(3,4);
		Point p2 = new Point(6,8);
//it returns a value
		System.out.printIn(p1.distance(p2))		 
	}
}


//////////////////////////////////////////
// Step by Step Execution ////////////////
//////////////////////////////////////////
//public static void main(String[] args)//
//Point p1 = new Point(3,4);//////////////
// main 
// arg
// p1 // x 0
//////// y 0
//Point 
//this // Point
////// startx 3 
////// starty 4
////// x 3
////// y 4
//Point p2 = new Point(6,8);///////////////
// p2 // x 0
//////// y 0
//Point 
//this // Point
////// startx 6 
////// starty 8
////// x 6
////// y 8
//System.out.printIn(p1.distance(p2))/////	
//this // Point(p1)
//otherPt // Point(p2)
//In distance()///////////////////////////
// dx 0
//getX()
// otherPt()
///////// x 6
//this 
///////// x 3
//public double distance(Point otherPt)///
//dx 0
//getX()
//////// this
//////// otherPt
//public int getX() {return x;}///////////
//////// otherPt
// x 6 //getX()
//////// this
// x 3
// int dx = x-otherPt.getX(); ////////////
// dx =3-6 =-3
// int dy = y-otherPt.getY(); ////////////
//dy 0
//getY()
//////// this
//////// otherPt
//public int getY() {return y;}///////////
//////// otherPt
// y 8 //getY()
//////// this
// x 4
// int dy = y-otherPt.getY(); ////////////
// dy = 4-8=-4
///////////STATIC METHOD//////////////////
//return Math.sqrt(dx*dx+dy*dy);//////////
// Math.sqrt(9+16) =5.0
//System.out.printIn(p1.distance(p2))=5.0	
/////////////////////////////////////////











