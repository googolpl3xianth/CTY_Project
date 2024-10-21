import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class Room4 extends JPanel implements KeyListener, MouseListener, Room
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
   int powerReq = 16;
  
   boolean upPressed = false;
   boolean downPressed = false;
   boolean leftPressed = false;
   boolean rightPressed = false;
   
   // Computers
   boolean myComputerPower1 = true;
   boolean myComputerPower2 = true;
   boolean myComputerPower3 = true;
   boolean myComputerPower4 = true;
   boolean myComputerPower5 = true;
   boolean myComputerPower6 = true;
   boolean myComputerPower7 = true;
   boolean myComputerPower8 = true;
   boolean myComputerPower9 = true;
   boolean myComputerPower10 = true;
   boolean myComputerPower11 = true;
   boolean myComputerPower12 = true;
   boolean myComputerPower13 = true;
   boolean myComputerPower14 = true;
   boolean myComputerPower15 = true;
   boolean myComputerPower16 = true;
   
   Computer myComputer1;
   Computer myComputer2;
   Computer myComputer3;
   Computer myComputer4;
   Computer myComputer5;
   Computer myComputer6;
   Computer myComputer7;
   Computer myComputer8;
   Computer myComputer9;
   Computer myComputer10;
   Computer myComputer11;
   Computer myComputer12;
   Computer myComputer13;
   Computer myComputer14;
   Computer myComputer15;
   Computer myComputer16;
   
   
   boolean myLightPower = true;
   
   
   FloorTile myFloorTile;
   Light myLight;
   
   public Room4()
   {
      myComputer1 = new Computer (575,250);
      myComputer2 = new Computer (675,250);
      myComputer3 = new Computer (775,250);
      myComputer4 = new Computer (875,250);
      myComputer5 = new Computer (975,250);
      myComputer6 = new Computer (975,350);
      myComputer7 = new Computer (975,450);
      myComputer8 = new Computer (975,550);
      myComputer9 = new Computer (975,650);
      myComputer10 = new Computer (875,650);
      myComputer11 = new Computer (775,650);
      myComputer12 = new Computer (675,650);
      myComputer13 = new Computer (575,650);
      myComputer14 = new Computer (575,550);
      myComputer15 = new Computer (575,450);
      myComputer16 = new Computer (575,350);
   
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
      
      if(myComputerPower9 == true)
      {
         g.setColor(Color.GREEN);
         myComputer9.drawTo(g);
      }
      else if(myComputerPower9 == false)
      {
         g.setColor(Color.RED);
         myComputer9.drawTo(g);
      }
      if(myComputerPower10 == true)
      {
         g.setColor(Color.GREEN);
         myComputer10.drawTo(g);
      }
      else if(myComputerPower10 == false)
      {
         g.setColor(Color.BLACK);
         myComputer10.drawTo(g);
      }
      
      if(myComputerPower11 == true)
      {
         g.setColor(Color.GREEN);
         myComputer11.drawTo(g);
      }
      else if(myComputerPower11 == false)
      {
         g.setColor(Color.RED);
         myComputer11.drawTo(g);
      }
      
      if(myComputerPower12 == true)
      {
         g.setColor(Color.GREEN);
         myComputer12.drawTo(g);
      }
      else if(myComputerPower12 == false)
      {
         g.setColor(Color.RED);
         myComputer12.drawTo(g);
      }
      if(myComputerPower13 == true)
      {
         g.setColor(Color.GREEN);
         myComputer13.drawTo(g);
      }
      else if(myComputerPower13 == false)
      {
         g.setColor(Color.RED);
         myComputer13.drawTo(g);
      }
      
      if(myComputerPower14 == true)
      {
         g.setColor(Color.GREEN);
         myComputer14.drawTo(g);
      }
      else if(myComputerPower14 == false)
      {
         g.setColor(Color.RED);
         myComputer14.drawTo(g);
      }
      
      if(myComputerPower15 == true)
      {
         g.setColor(Color.GREEN);
         myComputer15.drawTo(g);
      }
      else if(myComputerPower15 == false)
      {
         g.setColor(Color.RED);
         myComputer15.drawTo(g);
      }
      if(myComputerPower16 == true)
      {
         g.setColor(Color.GREEN);
         myComputer16.drawTo(g);
      }
      else if(myComputerPower16 == false)
      {
         g.setColor(Color.RED);
         myComputer16.drawTo(g);
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
      
      if(power < powerReq)
      {
         Color doorColor = new Color(0xb0b0b0);
         g.setColor(doorColor);
         door.drawTo(g);
      }
      else
      {
         Color doorColor = new Color(0x00fff7);
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
         
         if(player.intersects(door) && power >= powerReq)
         {
            return 5;
         }
         if(player.intersects(doorBack))
         {
            return 3;
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
         if(myComputer4.clicked(x, y))
         {
            if (myComputerPower4 == true)
            {
               power += 1;
               myComputerPower4 = !myComputerPower4;
            }
            else if (myComputerPower4 == false && power > 0)
            {
               power -= 1;
               myComputerPower4 = !myComputerPower4;
            }
         }
         if(myComputer5.clicked(x, y))
         {
            if (myComputerPower5 == true)
            {
               power += 1;
               myComputerPower5 = !myComputerPower5;
            }
            else if (myComputerPower5 == false && power > 0)
            {
               power -= 1;
               myComputerPower5 = !myComputerPower5;
            }
         }
         if(myComputer6.clicked(x, y))
         {
            if (myComputerPower6 == true)
            {
               power += 1;
               myComputerPower6 = !myComputerPower6;
            }
            else if (myComputerPower6 == false && power > 0)
            {
               power -= 1;
               myComputerPower6 = !myComputerPower6;
            }
         }

         if(myComputer7.clicked(x, y))
         {
            if (myComputerPower7 == true)
            {
               power += 1;
               myComputerPower7 = !myComputerPower7;
            }
            else if (myComputerPower7 == false && power > 0)
            {
               power -= 1;
               myComputerPower7 = !myComputerPower7;
            }
         }
         if(myComputer8.clicked(x, y))
         {
            if (myComputerPower8 == true)
            {
               power += 1;
               myComputerPower8 = !myComputerPower8;
            }
            else if (myComputerPower8 == false && power > 0)
            {
               power -= 1;
               myComputerPower8 = !myComputerPower8;
            }
         }
         if(myComputer9.clicked(x, y))
         {
            if (myComputerPower9 == true)
            {
               power += 1;
               myComputerPower9 = !myComputerPower9;
            }
            else if (myComputerPower9 == false && power > 0)
            {
               power -= 1;
               myComputerPower9 = !myComputerPower9;
            }
         }
         if(myComputer10.clicked(x, y))
         {
            if (myComputerPower10 == true)
            {
               myComputerPower10 = !myComputerPower10;
               try
               {
                  Thread.sleep(100);
               }
               catch(InterruptedException exception) {}
               myComputerPower10 = !myComputerPower10;
               morbBot.chatBox();
               myComputerPower10 = !myComputerPower10;
            }
         }
         if(myComputer11.clicked(x, y))
         {
            if (myComputerPower11 == true)
            {
               power += 1;
               myComputerPower11 = !myComputerPower11;
            }
            else if (myComputerPower11 == false && power > 0)
            {
               power -= 1;
               myComputerPower11 = !myComputerPower11;
            }
         }
         if(myComputer12.clicked(x, y))
         {
            if (myComputerPower12 == true)
            {
               power += 1;
               myComputerPower12 = !myComputerPower12;
            }
            else if (myComputerPower12 == false && power > 0)
            {
               power -= 1;
               myComputerPower12 = !myComputerPower12;
            }
         }

         if(myComputer13.clicked(x, y))
         {
            if (myComputerPower13 == true)
            {
               power += 1;
               myComputerPower13 = !myComputerPower13;
            }
            else if (myComputerPower13 == false && power > 0)
            {
               power -= 1;
               myComputerPower13 = !myComputerPower13;
            }
         }
         if(myComputer14.clicked(x, y))
         {
            if (myComputerPower14 == true)
            {
               power += 1;
               myComputerPower14 = !myComputerPower14;
            }
            else if (myComputerPower14 == false && power > 0)
            {
               power -= 1;
               myComputerPower14 = !myComputerPower14;
            }
         }
         if(myComputer15.clicked(x, y))
         {
            if (myComputerPower15 == true)
            {
               power += 1;
               myComputerPower15 = !myComputerPower15;
            }
            else if (myComputerPower15 == false && power > 0)
            {
               power -= 1;
               myComputerPower15 = !myComputerPower15;
            }
         }

         if(myComputer16.clicked(x, y))
         {
            if (myComputerPower16 == true)
            {
               power += 1;
               myComputerPower16 = !myComputerPower16;
            }
            else if (myComputerPower16 == false && power > 0)
            {
               power -= 1;
               myComputerPower16 = !myComputerPower16;
            }
         }

         if(myLight.clicked(x,y))
         {
            if (myLightPower == true)
            {
               power += 1;
               myLightPower = !myLightPower;
            }
            else if (myLightPower == false && power > 0)
            {
               power -= 1;
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