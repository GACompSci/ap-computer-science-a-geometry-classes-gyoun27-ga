public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double distance() {
        return MathTools.round(MathTools.distance(a, b), 2);
    }

    public double area() {
        int x1 = a.getX();
        int x2 = b.getX();
        int x3 = c.getX();

        int y1 = a.getY();
        int y2 = b.getY();
        int y3 = c.getY();

        double area = (0.5*(x1*(y2-y3) + x2*(y3-y1) + x3*(y3-y1)));
        return MathTools.round(area, 2);
    }
}
