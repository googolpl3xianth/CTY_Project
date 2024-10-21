import java.awt.Graphics;
import java.awt.Color;

public class FloorTile
{
   private int x;
   private int y;
   private int width;
   private int height;
   
   public FloorTile(int X, int Y, int Width, int Height)
   {
      x = X;
      y = Y;
      width = Width;
      height = Height;
   }
   
   public void drawTo(Graphics g)
   {
      for(int i = 0; i < width; i++)
      {
         for(int j = 0; j < height; j++)
         { 
            g.setColor(Color.WHITE);
            Color tile = new Color(0x00fffb);
            g.fillRect(x + 1 + (i * 100), y + 1 + (j* 100), 98, 98);
            g.setColor(tile);
            g.drawRect(x + (i * 100), y + (j * 100), 100, 100);
         }
      }
   }
}