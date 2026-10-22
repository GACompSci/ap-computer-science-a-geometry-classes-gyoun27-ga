public class App {
    public static void main(String[] args) throws Exception {

        Point a = new Point(MathTools.randInt(-10,10), MathTools.randInt(-10,10));

        Point b = new Point( a.getX() + 4, a.getY());

        Point c = new Point(a.getX(), a.getY() + MathTools.randInt(1,10));


        // Calling and printing the methods for each point (A,B,C)
        System.out.println("Point Section");

        System.out.println("Point a x:" + a.getX());
        System.out.println("Point a y:" + a.getY());

        System.out.println("Point b x:" + b.getX());
        System.out.println("Point b y:" + b.getY());
        
        System.out.println("Point c x:" + c.getX());
        System.out.println("Point c y:" + c.getY());

        //All the MathTools methods

        System.out.println("Random Integer 1-10: " + MathTools.randInt(1,10));

        System.out.println("5.64578 rounded to two decimals: " + MathTools.round(5.64578,2));

        System.out.println("Distance between a and b: " + MathTools.distance(a,b));

        System.out.println("Slope between b and c: " + MathTools.slope(b,c));

        //Create a circle

        Circle circle = new Circle(a, MathTools.randInt(1,10));
        System.out.println("Radius " + circle.getRadius());
        System.out.println("Area " + circle.getArea());
        System.out.println("Point Center: (" + circle.getCenter().getX() + ","+ circle.getCenter().getY() + ")");

        //Create a rectangle
        Rectangle rectangle = new Rectangle(b, MathTools.randInt(1,10), MathTools.randInt(1,10));
        System.out.println("Area " + rectangle.getArea());

        //Create a Traingle

        Triangle triangle = new Triangle(a, b, c);
        System.out.println("Area " + triangle.getArea());


    }
}