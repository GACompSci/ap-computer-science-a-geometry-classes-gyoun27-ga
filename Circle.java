public class Circle {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter(){
        return center;
    }

    public int getRadius(){
        return radius;
    }
    
    public double getArea() {
        double area = Math.PI * radius * radius;
        return MathTools.round(area, 2);

    }
    }
    
    
       
