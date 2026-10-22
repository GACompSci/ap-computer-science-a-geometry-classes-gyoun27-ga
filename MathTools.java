public class MathTools {
    
    public static int randInt (int min, int max){
        return (int) ((Math.random()) * (max-min+1)) +min;

     }

     

     public static double round (double number, int places ){
        double a = number * Math.pow(10, places); 
        int rounded = (int) (a+ 0.5);
        return rounded/Math.pow(10, places);
     }

     
     public static double distance(Point a, Point b) {
        double xDifference = a.getX() - b.getX();
        double yDifference = a.getY() - b.getY();

        return Math.sqrt((Math.pow(xDifference, 2) + Math.pow(yDifference, 2)));

        
     }

     public static double slope(Point a, Point b) {
        double xDifference = a.getX() - b.getX();
        double yDifference = a.getY() - b.getY();

        return yDifference/ xDifference;
     }

     public static double area(Point A, int b){
      return Math.PI * b * b;


     }

      
      
     }

