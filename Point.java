// 10/10/18
public class Point {
  //instance variables
  private double x,y;
  // constructor
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  // methods
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
  public double distanceTo(Point p){
    double x1 = p.x;
    double y1 = p.y;
    double x2 = this.x;
    double y2 = this.y;
    return Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
  }
  public static double distance(Point a, Point b) {
    return a.distanceTo(b);
  }
  public String toString() {
    return "(" + x + "," + y + ")";
  }

  public Point copy() {
    return new Point(this);
  }
}
