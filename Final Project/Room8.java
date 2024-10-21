import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class Room8 extends JPanel implements KeyListener, MouseListener, Room
{
   // Movement vars
   Collisable player; 
   Collisable doorBack;
   Collisable player2;
   
   // Borders
   Collisable leftBord;
   Collisable rightBord;
   Collisable topBord;
   Collisable botBord;
   
   int speed = 8;
  
   boolean upPressed = false;
   boolean downPressed = false;
   boolean leftPressed = false;
   boolean rightPressed = false;
   
   
   FloorTile myFloorTile;
   
   Computer myComputer;
   
   public Room8()
   {
      myFloorTile = new FloorTile (375, 50, 9, 9);
      
      addMouseListener(this);
      addKeyListener(this);
      setFocusable(true);
      
      player = new Collisable(600, 475, 50, 50);
      player2 = new Collisable(1000, 475, 50, 50);
      doorBack = new Collisable (375, 450, 5, 100);
      
      myComputer = new Computer(1075,450);
      
      leftBord = new Collisable(280, 50, 100, 900);
      rightBord = new Collisable(1270, 50, 100, 900);
      topBord = new Collisable(375, -45, 900, 100);
      botBord = new Collisable(375, 945, 900, 100);
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      
      // Border
      Color bord = new Color(0,0,0,0);
      g.setColor(bord);
      leftBord.drawTo(g);
      rightBord.drawTo(g);
      topBord.drawTo(g);
      botBord.drawTo(g);
      
      g.setColor(Color.GRAY);
      g.fillRect(0,0,1650,1080);
      
      myFloorTile.drawTo(g);
      g.setColor(Color.BLUE);
      player.drawTo(g);
      
      g.setColor(Color.BLUE);
      player2.drawTo(g);
      
      Color doorColor = new Color(0x00fff7);
      g.setColor(doorColor);
      doorBack.drawTo(g);
      
      g.setColor(Color.GREEN);
      myComputer.drawTo(g);
      
      g.setColor(Color.BLACK);
      g.drawString("This is where it ends. I have ran out of time to create and ending for you.", 775, 450);
   }
  
   public int mainLoop()
   {
      while(true)
      { 
         if(rightPressed && !player.intersects(rightBord))
         {
           player.moveRight(speed);
         }
         if(leftPressed && !player.intersects(leftBord))
         {
           player.moveLeft(speed);
         }
         if(upPressed && !player.intersects(topBord))
         {
           player.moveUp(speed);
         }
         if(downPressed && !player.intersects(botBord))
         {
           player.moveDown(speed);
         }
                  
         try
         {
           Thread.sleep(20);
         }
         catch(Exception e){e.printStackTrace();}
         
         repaint();
         
         if(player.intersects(player2))
         {
            return 8;
         }
         
         if(player.intersects(doorBack))
         {
            return 6;
         }
      }
   }
  
   /* Required methods for KeyListener (no change from EvenBetterKeyboardExample) */
   public void keyPressed(KeyEvent e)
   {
      int code = e.getKeyCode();
       
      if(code == KeyEvent.VK_RIGHT)
      {
         rightPressed = true;
      }
      else if(code == KeyEvent.VK_LEFT)
      {
         leftPressed = true;
      }
      else if(code == KeyEvent.VK_UP)
      {
         upPressed = true;
      }
      else if(code == KeyEvent.VK_DOWN)
      {
         downPressed = true;
      }
   }
  
   public void keyReleased(KeyEvent e)
   { 
      int code = e.getKeyCode();
       
      if(code == KeyEvent.VK_RIGHT)
      {
         rightPressed = false;
      }
      else if(code == KeyEvent.VK_LEFT)
      {
         leftPressed = false;
      }
      else if(code == KeyEvent.VK_UP)
      {
         upPressed = false;
      }
      else if(code == KeyEvent.VK_DOWN)
      {
         downPressed = false;
      }
   }
   public void keyTyped(KeyEvent e)
   {
   }
   
   public void mousePressed(MouseEvent e)
   {
      // getButton tells us which button was clicked.
      int button = e.getButton();
       
      // BUTTON1 = left click
      if(button == MouseEvent.BUTTON1)
      {
         int x = e.getX();
         int y = e.getY();
      }
      repaint();
   }
   public void mouseReleased(MouseEvent e)
   {
   }
   public void mouseClicked(MouseEvent e)
   {
   }  
   public void mouseEntered(MouseEvent e)
   { 
   } 
   public void mouseExited(MouseEvent e)
   { 
   } 

}

class Collisable
{
  int x;
  int y;
  int width;
  int height;
  
  public Collisable(int nx, int ny, int nw, int nh)
  {
    x = nx;
    y = ny;
    width = nw;
    height = nh;
  }
  
  public void drawTo(Graphics g)
  {
    g.fillRect(x, y, width, height);
  }
  
  public boolean containsPoint(int pointX, int pointY)
  {
    return pointX > x && pointX < x + width && pointY > y && pointY < y + height ;
  }
  
  public boolean intersects(Collisable other)
  {
    return x < other.x + other.width &&
           other.x < x + width &&
           y < other.y + other.height && 
           other.y < y + height;
  }
  
  /* Movement methods for our square.
     We will modify this in a future file to stop our player square from being
     able to run into other squares.
   */
  public void moveRight(int amount)
  {
    x += amount;
  }
  
  public void moveLeft(int amount)
  {
    x -= amount;
  }
  
  public void moveUp(int amount)
  {
    y -= amount;
  }
  
  public void moveDown(int amount)
  {
    y += amount;
  }
}