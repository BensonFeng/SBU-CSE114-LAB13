public class Rectangle {
    private double width = 0;
    private double height = 0;

    public Rectangle() {   
    }
    
    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }
    
    public double getArea() {
        return width*height;
    }
    
    public double getPerimeter() {
        return (width + height)*2;
    }
    
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        System.out.println("The area of a 4.0 x 40.0 Rectangle is " + rectangle1.getArea());
        System.out.println("The perimeter of a 4.0 x 40.0 Rectangle is " + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        System.out.println("The area of a 3.5 x 35.9 Rectangle is " + rectangle2.getArea());
        System.out.println("The perimeter of a 3.5 x 35.9 Rectangle is " + rectangle2.getPerimeter());
    }
}