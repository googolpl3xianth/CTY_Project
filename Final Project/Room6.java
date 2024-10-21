import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class Room6 extends JPanel implements KeyListener, MouseListener, Room
{
   // Movement vars
   Collisable player; 
   Collisable door;
   Collisable doorBack;
   Collisable doorX;
   
   Collisable leftBord;
   Collisable rightBord;
   Collisable topBord;
   Collisable botBord;
   
   int speed = 8;
  
   boolean upPressed = false;
   boolean downPressed = false;
   boolean leftPressed = false;
   boolean rightPressed = false;
   
   // Computers
   boolean myComputerPower1 = false;
   boolean myComputerPower2 = false;
   boolean myComputerPower3 = false;
   boolean myComputerPower4 = false;
   boolean myComputerPower5 = false;
   boolean myComputerPower6 = false;
   boolean myComputerPower7 = false;
   boolean myComputerPower8 = false;
   
   Computer myComputer1;
   Computer myComputer2;
   Computer myComputer3;
   Computer myComputer4;
   Computer myComputer5;
   Computer myComputer6;
   Computer myComputer7;
   Computer myComputer8;
   
   
   boolean myLightPower = true;
   
   
   FloorTile myFloorTile;
   Light myLight;
   
   public Room6()
   {
      myComputer1 = new Computer (1175,250);
      myComputer2 = new Computer (1075,250);
      myComputer3 = new Computer (975,250);
      myComputer4 = new Computer (875,250);
      myComputer5 = new Computer (775,250);
      myComputer6 = new Computer (675,250);
      myComputer7 = new Computer (575,250);
      myComputer8 = new Computer (475,250);
   
      myFloorTile = new FloorTile (375, 50, 9, 9);
      myLight = new Light (780, 251);
      
      addMouseListener(this);
      addKeyListener(this);
      setFocusable(true);
      
      player = new Collisable(800, 475, 50, 50);
      door = new Collisable(1271, 450, 5, 100);
      doorBack = new Collisable (375, 450, 5, 100);
      doorX = new Collisable(775, 50, 100, 5);
      
      leftBord = new Collisable(280, 50, 100, 900);
      rightBord = new Collisable(1270, 50, 100, 900);
      topBord = new Collisable(375, -45, 900, 100);
      botBord = new Collisable(375, 945, 900, 100);
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
      if(myComputerPower4 == true)
      {
         g.setColor(Color.GREEN);
         myComputer4.drawTo(g);
      }
      else if(myComputerPower4 == false)
      {
         g.setColor(Color.RED);
         myComputer4.drawTo(g);
      }
      
      if(myComputerPower5 == true)
      {
         g.setColor(Color.GREEN);
         myComputer5.drawTo(g);
      }
      else if(myComputerPower5 == false)
      {
         g.setColor(Color.RED);
         myComputer5.drawTo(g);
      }
      
      if(myComputerPower6 == true)
      {
         g.setColor(Color.GREEN);
         myComputer6.drawTo(g);
      }
      else if(myComputerPower6 == false)
      {
         g.setColor(Color.RED);
         myComputer6.drawTo(g);
      }
      if(myComputerPower7 == true)
      {
         g.setColor(Color.GREEN);
         myComputer7.drawTo(g);
      }
      else if(myComputerPower7 == false)
      {
         g.setColor(Color.RED);
         myComputer7.drawTo(g);
      }
      
      if(myComputerPower8 == true)
      {
         g.setColor(Color.GREEN);
         myComputer8.drawTo(g);
      }
      else if(myComputerPower8 == false)
      {
         g.setColor(Color.RED);
         myComputer8.drawTo(g);
      }
            
      if(myComputerPower7 == false && myComputerPower3 == false && myComputerPower1 == true && myComputerPower2 == false && myComputerPower4 == true && myComputerPower5 == false && myComputerPower6 == false && myComputerPower8 == true)
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
      
      if(myComputerPower7 == true && myComputerPower3 == true && myComputerPower1 == true && myComputerPower2 == false && myComputerPower4 == false && myComputerPower5 == false && myComputerPower6 == false && myComputerPower8 == false)
      {
         doorColor = new Color(0x00fff7);
         g.setColor(doorColor);
         doorX.drawTo(g);
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
         
         if(player.intersects(door) && myComputerPower7 == false && myComputerPower3 == false && myComputerPower1 == true && myComputerPower2 == false && myComputerPower4 == true && myComputerPower5 == false && myComputerPower6 == false && myComputerPower8 == true)
         {
            return 7;
         }
         if(player.intersects(doorBack))
         {
            return 5;
         }
         if(player.intersects(doorX) && myComputerPower7 == true && myComputerPower3 == true && myComputerPower1 == true && myComputerPower2 == false && myComputerPower4 == false && myComputerPower5 == false && myComputerPower6 == false && myComputerPower8 == false)
         {
            return 0;
         }
      }
   }
   
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
               myComputerPower1 = !myComputerPower1;
            }
            else if (myComputerPower1 == false)
            {
               myComputerPower1 = !myComputerPower1;
            }
         }
         if(myComputer2.clicked(x, y))
         {
            if (myComputerPower2 == true)
            {
               myComputerPower2 = !myComputerPower2;
            }
            else if (myComputerPower2 == false)
            {
               myComputerPower2 = !myComputerPower2;
            }
         }
         if(myComputer3.clicked(x, y))
         {
            if (myComputerPower3 == true)
            {
               myComputerPower3 = !myComputerPower3;
            }
            else if (myComputerPower3 == false)
            {
               myComputerPower3 = !myComputerPower3;
            }
         }
         if(myComputer4.clicked(x, y))
         {
            if (myComputerPower4 == true)
            {
               myComputerPower4 = !myComputerPower4;
            }
            else if (myComputerPower4 == false)
            {
               myComputerPower4 = !myComputerPower4;
            }
         }
         if(myComputer5.clicked(x, y))
         {
            if (myComputerPower5 == true)
            {
               myComputerPower5 = !myComputerPower5;
            }
            else if (myComputerPower5 == false)
            {
               myComputerPower5 = !myComputerPower5;
            }
         }
         if(myComputer6.clicked(x, y))
         {
            if (myComputerPower6 == true)
            {
               myComputerPower6 = !myComputerPower6;
            }
            else if (myComputerPower6 == false)
            {
               myComputerPower6 = !myComputerPower6;
            }
         }

         if(myComputer7.clicked(x, y))
         {
            if (myComputerPower7 == true)
            {
               myComputerPower7 = !myComputerPower7;
            }
            else if (myComputerPower7 == false)
            {
               myComputerPower7 = !myComputerPower7;
            }
         }
         if(myComputer8.clicked(x, y))
         {
            if (myComputerPower8 == true)
            {
               myComputerPower8 = !myComputerPower8;
            }
            else if (myComputerPower8 == false)
            {
               myComputerPower8 = !myComputerPower8;
            }
         }
         
         if(myLight.clicked(x,y))
         {
            if (myLightPower == true)
            {
               myLightPower = !myLightPower;
            }
            else if (myLightPower == false)
            {
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