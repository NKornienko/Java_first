package ru.stqa.pft.sandbox;

public class Point {
   public double x;
   public double y;
   private double х1;
   private double у1;

   public Point(double x, double y) {
      this.x = x;
      this.y = y;
   }

    public double distance (double x1, double y1)
   {
      double sx = (this.x - х1);
      double sy = (this.y - у1);
      return Math.sqrt(sx*sx + sy*sy);
   }


}