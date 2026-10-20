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

    public double getRadius(){
        return MathTools.round(radius,2);
    }
    
    public double getArea() {
        double area = Math.PI * radius * radius ;
        return MathTools.round(area, 2);

    }
    }
    
    
       
