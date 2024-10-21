import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class Room3 extends JPanel implements KeyListener, MouseListener, Room
{
   // Movement vars
   Collisable player; 
   Collisable door;
   Collisable doorBack;
   
   Collisable leftBord;
   Collisable rightBord;
   Collisable topBord;
   Collisable botBord;
   
   int speed = 8;
  
   int power = 0;
   int powerReq = 4;
  
   boolean upPressed = false;
   boolean downPressed = false;
   boolean leftPressed = false;
   boolean rightPressed = false;
   
   // Computers
   boolean myComputerPower1 = true;
   boolean myComputerPower2 = true;
   boolean myComputerPower3 = true;
   
   Computer myComputer1;
   Computer myComputer2;
   Computer myComputer3;
   
   
   boolean myLightPower = false;
   
   
   FloorTile myFloorTile;
   Light myLight;
   
   public Room3()
   {
      myComputer1 = new Computer (675,250);
      myComputer2 = new Computer (775,250);
      myComputer3 = new Computer (875,250);
   
      myFloorTile = new FloorTile (575,250,5,5);
      myLight = new Light (780, 251);
      
      addMouseListener(this);
      addKeyListener(this);
      setFocusable(true);
      
      player = new Collisable(800, 475, 50, 50);
      door = new Collisable(1071, 450, 5, 100);
      doorBack = new Collisable (575, 450, 5, 100);
      
      leftBord = new Collisable(480, 250, 100, 500);
      rightBord = new Collisable(1070, 250, 100, 500);
      topBord = new Collisable(575, 155, 500, 100);
      botBord = new Collisable(575, 745, 500, 100);
   }
   
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      g.setColor(Color.GRAY);
      g.fillRect(0,0,1650,1080);
      
      // Border
      Color bord = new Color(0,0,0,0);
      g.setColor(bord);
      leftBord.drawTo(g);
      rightBord.drawTo(g);
      topBord.drawTo(g);
      botBord.drawTo(g);
      
      myFloorTile.drawTo(g);
      
      g.setColor(Color.BLUE);
      player.drawTo(g);
      
      // Door check for enough power
      
      if(myComputerPower1 == true)
      {
         g.setColor(Color.GREEN);
         myComputer1.drawTo(g);
      }
      else if(myComputerPower1 == false)
      {
         g.setColor(Color.RED);
         myComputer1.drawTo(g);
      }
      
      if(myComputerPower2 == true)
      {
         g.setColor(Color.GREEN);
         myComputer2.drawTo(g);
      }
      else if(myComputerPower2 == false)
      {
         g.setColor(Color.RED);
         myComputer2.drawTo(g);
      }
      
      if(myComputerPower3 == true)
      {
         g.setColor(Color.GREEN);
         myComputer3.drawTo(g);
      }
      else if(myComputerPower3 == false)
      {
         g.setColor(Color.RED);
         myComputer3.drawTo(g);
      }
      
      if(myLightPower == true)
      {
         g.setColor(Color.GREEN);
         myLight.drawTo(g);
         Color lightRays = new Color(255,255,0,128);
         g.setColor(lightRays);
         g.fillRect(575, 250, 500, 500);
      }
      else if(myLightPower == false)
      {
         g.setColor(Color.RED);
         myLight.drawTo(g);
      }
      
      if(myLightPower == true)
      {
         Color doorColor = new Color(0x00fff7);
         g.setColor(doorColor);
         door.drawTo(g);
      }
      else
      {
         Color doorColor = new Color(0xb0b0b0);
         g.setColor(doorColor);
         door.drawTo(g);
      }
      
      Color doorColor = new Color(0x00fff7);
      g.setColor(doorColor);
      doorBack.drawTo(g);
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
         
         if(player.intersects(door) && myLightPower == true)
         {
            return 4;
         }
         if(player.intersects(doorBack))
         {
            return 2;
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
         if(myComputer1.clicked(x, y))
         {
            if (myComputerPower1 == true)
            {
               power += 1;
               myComputerPower1 = !myComputerPower1;
            }
            else if (myComputerPower1 == false && power > 0)
            {
               power -= 1;
               myComputerPower1 = !myComputerPower1;
            }
         }
         if(myComputer2.clicked(x, y))
         {
            if (myComputerPower2 == true)
            {
               power += 1;
               myComputerPower2 = !myComputerPower2;
            }
            else if (myComputerPower2 == false && power > 0)
            {
               power -= 1;
               myComputerPower2 = !myComputerPower2;
            }
         }
         if(myComputer3.clicked(x, y))
         {
            if (myComputerPower3 == true)
            {
               power += 1;
               myComputerPower3 = !myComputerPower3;
            }
            else if (myComputerPower3 == false && power > 0)
            {
               power -= 1;
               myComputerPower3 = !myComputerPower3;
            }
         }
         if(myLight.clicked(x,y))
         {
            if (myLightPower == true)
            {
               power += 3;
               myLightPower = !myLightPower;
            }
            else if (myLightPower == false && power >= 3)
            {
               power -= 3;
               myLightPower = !myLightPower;
            }
         }
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