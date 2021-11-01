class Circle extends Shape
{
   private int x, y, r;

   Circle(int x, int y, int r)
   {
      this.x = x;
      this.y = y;
      this.r = r;
   }

   void draw(Graphics g)
   {
      // Java uses the drawOval class to draw a circle.
      // This draws an oval in a rectangle, so we need to work out
      // The rectangle (really square) which surrounds the circle
      g.drawOval(x - r, y - r, 2 * r, 2 * r);
   }
}