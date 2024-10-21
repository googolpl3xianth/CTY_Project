import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class Room1 extends JPanel implements KeyListener, MouseListener, Room
{
   Collisable player; 
   Collisable door;
   
   Collisable leftBord;
   Collisable rightBord;
   Collisable topBord;
   Collisable botBord;
   
   int speed = 8;
  
   int power = 0;
   int powerReq = 0;
  
   boolean upPressed = false;
   boolean downPressed = false;
   boolean leftPressed = false;
   boolean rightPressed = false;
   
   boolean myComputerPower = false;
   boolean myComputerHover = false;
   
   boolean myLightPower = false;
   boolean myLightHover = false;
   
   FloorTile myFloorTile;
   Computer myComputer;
   Light myLight;
   
   public Room1()
   {
      myFloorTile = new FloorTile (675, 350,3,3);
      myComputer = new Computer (675, 350);
      myLight = new Light (780, 351);
      
      addMouseListener(this);
      addKeyListener(this);
      setFocusable(true);
      
      player = new Collisable(800, 475, 50, 50);
      door = new Collisable(971, 450, 5, 100);
      
      leftBord = new Collisable(575, 350, 100, 300);
      rightBord = new Collisable(975, 350, 100, 300);
      topBord = new Collisable(675, 250, 300, 100);
      botBord = new Collisable(675, 650, 300, 100);
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
      
      // Background
      g.setColor(Color.GRAY);
      g.fillRect(0,0,1650,1080);
      
      // Floor
      myFloorTile.drawTo(g);
      
      
      // Computer
      if(myComputerPower == true)
      {
         g.setColor(Color.GREEN);
         myComputer.drawTo(g);
      }
      else if(myComputerPower == false)
      {
         g.setColor(Color.RED);
         myComputer.drawTo(g);
      }
      
      g.setColor(Color.BLUE);
      player.drawTo(g); 
      
      if(myLightPower == true)
      {
         g.setColor(Color.GREEN);
         myLight.drawTo(g);
         Color lightRays = new Color(255,255,0,128);
         g.setColor(lightRays);
         g.fillRect(675, 350, 300, 300);
      }
      else if(myLightPower == false)
      {
         g.setColor(Color.RED);
         myLight.drawTo(g);
      }
      
      Color doorColor = new Color(0x00fff7);
      g.setColor(doorColor);
      door.drawTo(g);
      
      if (myComputerHover == true)
      {
         g.setColor(Color.BLACK);
         g.drawString("Computer", 675, 350);
      }
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
         
         if(player.intersects(door))
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
         if(myComputer.clicked(x, y))
         {
            if(myComputerPower == false)
            {
               power -= 1;
               myComputerPower = !myComputerPower;
            }
            else if(myComputerPower == true)
            {
               power += 1;
               myComputerPower = !myComputerPower;
            }
         }
         if(myLight.clicked(x,y))
         {
            if(myLightPower == false)
            {
               power -= 1;
               myLightPower = !myLightPower;
            }
            else if(myLightPower == true)
            {
               power += 1;
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
      int x = e.getX();
      int y = e.getY();
      if(myComputer.clicked(x, y))
      {
         myComputerHover = true;
         System.out.println("HI");
      }
      else
      {
         myComputerHover = false;
      }
      if(myLight.clicked(x,y))
      {
         myLightHover = true;
      }
      else
      {
         myLightHover = false;
      }
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

interface Room
{
  public int mainLoop();
}
