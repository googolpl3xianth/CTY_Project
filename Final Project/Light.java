import java.awt.Graphics;
import java.awt.Color;

public class Light
{
   private int x;
   private int y;
   
   public Light(int X, int Y)
   {
      x = X;
      y = Y;
   }
   
   public void drawTo(Graphics g)
   {
      g.fillRect(x + 35, y, 20, 10);
   }
   
   public boolean clicked (int X, int Y)
   {
      return X > x + 35 && X < x + 55 && Y > y && Y < y + 10;
   }
}