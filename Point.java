public class Point
{
   private double x;
   private double y;

   public Point(double newX, double newY)
   {
      x = newX;
      y = newY;
   }

   public Point midPoint(Point p)
   {
        double x1 = (x + p.x) / 2;
        double y1 = (y + p.y) / 2;
        return new Point(x1, y1);
   }

   public String toString()
   {
      return "(" + x + ", " + y + ")";
   }
}