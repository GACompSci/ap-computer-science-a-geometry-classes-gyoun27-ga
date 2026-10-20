public class Rectangle {
    private Point Topleft;
    private int length;
    private int width;
    

    public Rectangle(Point Topleft, int length, int width ) {
        this.Topleft = Topleft;
        this.length = length;
        this.width = width;


    }

    public double getArea() {
        double area = (length * width);
        return MathTools.round(area, 2);
    }
        
    
    
    
}
