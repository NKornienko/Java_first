package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
   @Test
   public void testdistance() {

      Point a = new Point(5.0, 3.0);
      Assert.assertEquals(a.distance(2.0, 5.6), 6.441);
   }

   @Test
   public void testdistance1() {
   Point b = new Point(0.9, 3.0);
      Assert.assertEquals(b.distance(7.0, 0.0), 3.132091952673165);
    }
}
