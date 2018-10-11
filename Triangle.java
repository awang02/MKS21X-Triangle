public class Triangle {
  private Point v1,v2,v3;
  private double ax,ay,bx,by,cx,cy;

  public String toString() {
    return "Triangle: A" + v1 + " B" + V2 + " C" + v3;
  }

  public Triangle(Point x, Point y, Point z);
    v1 = x;
    v2 = y;
    v3 = z;
  }
  public Triangle(double a, double b, double c, double d, double e, double f);
    ax = a;
    ay = b;
    bx = c;
    by = d;
    cx = e;
    cy = f;
  }
  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v3.distanceTo(v1);
  }

  public Point getVertex(int index) {
    Point pointCopy;
    if (i == 0) {
      pointCopy = new Point(v1.getX(), v1.getY());
    }
    else if (i == 1) {
      pointCopy = new Point(v2.getX(), v2.getY());
    }
    else {
      pointCopy = new Point(v3.getX(), v3.getY());
    }
  }

  public void setVertex(int index, Point newP) {
    if (i == 0) {
      v1 = newP;
    }
    else if (i == 1) {
      v2 = newP;
    }
    else {
      v3 = newP;
    }
  }
}
