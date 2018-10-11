public class Triangle {
  private Point v1,v2,v3;
  private double ax,ay,bx,by,cx,cy;

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


}
