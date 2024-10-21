import java.awt.Graphics;
import java.awt.Color;

public class Computer
{
   private int x;
   private int y;
   
   public Computer(int X, int Y)
   {
      x = X;
      y = Y;
   }
   
   public void drawTo(Graphics g)
   {
      g.fillRect(x + 25, y + 25, 50, 50);
   }
   
   public boolean clicked (int X, int Y)
   {
      return X > x + 25 && X < x + 75 && Y > y + 25 && Y < y + 75;
   }
}