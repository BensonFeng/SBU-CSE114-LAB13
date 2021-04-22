import java.util.Scanner;
public class part2{
	public static void main(String []args) {
		Scanner input = new Scanner(System.in);
		RegularPolygon x1 = new RegularPolygon();
		RegularPolygon x2 = new RegularPolygon(6,4);
		RegularPolygon x3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Regular Polygon 1:\nPerimeter: " + x1.getPerimeter() + "\nArea: " + String.format("%.5f", x1.getArea()) + "\n");

		System.out.println("Regular Polygon 2:\nPerimeter: " + x2.getPerimeter() + "\nArea: " + String.format("%.5f", x2.getArea()) + "\n");

		System.out.println("Regular Polygon 3:\nPerimeter: " + x3.getPerimeter() + "\nArea: " + String.format("%.5f", x3.getArea()) + "\n");
	}
}

class RegularPolygon{
	private int n=3;
	private double side=1;
	private double x=0;
	private double y=0;
	public RegularPolygon() {}
	public RegularPolygon(int numSides, double sLength) {
		n=numSides;
		side=sLength;
		
	}
	public RegularPolygon(int numSides, double sLength, double spotX, double spotY) {
		n=numSides;
		side=sLength;
		x=spotX;
		y=spotY;
	}
	
	public void setNumSides(int numSides) {
		n=numSides;
	}
	
	public void setSideLength(double sideLength) {
		side = sideLength;
	}
	
	public void setX(double spotX) {
		x=spotX;
	}
	
	public void setY(double spotY) {
		y=spotY;
	}
	
	public int getNumSides() {
		return n;
	}
	
	public double getSideLength() {
		return side;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getPerimeter(){
		return side*n;
	}
	
	public double getArea() {
		return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
	}
}