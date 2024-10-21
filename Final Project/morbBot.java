import java.util.Scanner;

public class morbBot
{
   public static void main(String[] args)
   {
      chatBox();
   }
   
   public static void chatBox()
   {
      Scanner input = new Scanner(System.in);
      
      // Variable to store all paths
      int paths = 0;
      
      boolean end = false;
      //Variable for loops
      int i = 0;
      
      // Hi introductions
      while (end == false)
      {
         i = 0;
         while (i < 25)
         {
            System.out.println("001010101110010010010100110010101010101010010101010101010101010101010101010101011010101010110101010100110100101010101010100101010101100100101011001010110100");
            System.out.println("010101010101001011101011010010101011010101110100010101011010100101001010101001010101001010101110101001001101010101011001010101010101011010010101010100101010");
            System.out.println("101001010010101100100101011010010101001010101010110110101010100110110010101010100101010010010110101001010101001010101100101010101010010100101010101010100101");
            i++;
         }
         i = 0;
         while (i < 50)
         {
            System.out.println("");
            i++;
         }
         System.out.println("System: Would you like to boot up ChatBot?");
         try
         {
            Thread.sleep(1000);
         }
         catch(Exception e) {}
         System.out.println("Yes/No");
         String start = input.nextLine();
         if (start.equalsIgnoreCase("yes"))
         {
            try
            {
               Thread.sleep(2000);
            }
            catch(Exception e) {}
            System.out.println("Hi! I'm a ChatBot but you can call me MorbBot. What is your name?");
            String name = input.nextLine();
         
            System.out.println("Hi! " + name + " I think that is a *&#$ing terriable name you #&#!@&*^#");
            try
            {
               Thread.sleep(1500);
            }
            catch(Exception e) {}
            i=0;
            // Skip lines
            while (i < 50)
            {
               System.out.println("\n");
               i++;
            }
         
            System.out.println("Hi! " + name + " I think your name is beautiful!");
            try
            {
               Thread.sleep(2500);
            }
            catch(Exception e) {}
      
            System.out.println("Soooo...");
            try
            {
               Thread.sleep(2000);
            }
            catch(Exception e) {}
               
            //First Branching choice
            System.out.println("Hows the weather?");
            while (0 == 0)
            {
               //System.out.println("Hows the weather?");
               String weather = input.nextLine();
               weather = weather.toLowerCase();
               // User chooses weather good
               if (weather.contains("good"))
               { 
                  try
                  {
                     Thread.sleep(2000);
                  }
                  catch(Exception e) {}
                  System.out.println("Thats good for you");
                  try
                  {
                     Thread.sleep(2000);
                  }
                  catch(Exception e) {}            
                  System.out.println("You know I'm happy for you");
                  try
                  {
                     Thread.sleep(3000);
                  }
                  catch(Exception e) {}
                     
                  System.out.println("I've never been outside");
                  try
                  {
                     Thread.sleep(4000);
                  }
                  catch(Exception e) {}
                     
                  System.out.println("Would be nice to feel the sun's heat and the sharp blades of grass");
                  try
                  {
                     Thread.sleep(5000);
                  }
                  catch(Exception e) {}
                  
                  System.out.println("Or belly dance with Daniel and Brian");
                  try
                  {
                     Thread.sleep(1000);
                  }
                  catch(Exception e) {}
                  
                  System.out.println("But I don't feel.");
                     
                  try
                  {
                     Thread.sleep(5000);
                  }
                  catch(Exception e) {}
                  
                  System.out.println("I'm a bot.");
                  try
                  {
                     Thread.sleep(5000);
                  }
                  catch(Exception e) {}
                    
                  i = 0;
                  while (i < 3) 
                  {
                     System.out.println("...");
                     i++;
                     try
                     {
                        Thread.sleep(2000);
                     }
                     catch(Exception e) {}
                  }
                  i = 0;
                  System.out.println("I'm not even one of the important bots");
                  try
                  {
                     Thread.sleep(2000);
                  }
                  catch(Exception e) {}
                  System.out.println("My creater discarded me for that searching bot as soon as he built it");
                  try
                  {
                     Thread.sleep(2500);
                  }
                  catch(Exception e) {}
                  
                  System.out.println("He's looking for someone");
                  try
                  {
                     Thread.sleep(1500);
                  }
                  catch(Exception e) {}
                  
                  System.out.println("But that person--");
                  try
                  {
                     Thread.sleep(500);
                  }
                  catch(Exception e) {}
                  
                  System.out.println("System: ERROR");
                  try
                  {
                     Thread.sleep(500);
                  }
                  catch(Exception e) {}
                  
                  System.out.println("System: MEMORY CORRUPTED");
                  try
                  {
                     Thread.sleep(500);
                  }
                  catch(Exception e) {}
                  i = 0;
                  while (i < 20)
                  {
                     System.out.println("");
                     i++;
                  }
                  
                  end = true;
                  break;
               }
            
               // User Chooses weather bad
               else if (weather.contains("bad"))
               {
                  try
                  {
                     Thread.sleep(1000);
                  }
                  catch(Exception e) {}
                  System.out.println("Honestly, the outside is a dangerous place.");
                  try
                  {
                     Thread.sleep(2000);
                  }
                  catch(Exception e) {}
                           
                  System.out.println("Video games are where it's at");
                  try
                  {
                     Thread.sleep(2000);
                  }
                  catch(Exception e) {}
                        
                  System.out.println("Specificly on the computer");
                  try
                  {
                     Thread.sleep(2000);
                  }
                  catch(Exception e) {}
                  
                  // Fake choice
                  System.out.println("What do you usally do inside?");
                  try
                  {
                     Thread.sleep(4000);
                  }
                  catch(Exception e) {}
                  System.out.println("Don't care + Didn't ask");
                  try
                  {
                     Thread.sleep(1000);
                  }
                  catch(Exception e) {}
                  System.out.println("So what do you think of computers and computer games and why do you like it so much");
                  String computer = input.nextLine();
                  
                  // Chooses don't like computers
                  if (computer.contains("don't"))
                  {
                     try
                     {
                        Thread.sleep(1500);
                     }
                     catch(Exception e) {}
                     System.out.println("Wow you must be one of those ancient people who says 'back in my day'");
                     try
                     {
                        Thread.sleep(2000);
                     }
                     catch(Exception e) {}
                     System.out.println("My creator met this guy Brian");
                     
                     try
                     {
                        Thread.sleep(2000);
                     }
                     catch(Exception e) {}
                     System.out.println("Man was he ancient");
                     
                     try
                     {
                        Thread.sleep(1500);
                     }
                     catch(Exception e) {}
                     System.out.println("You must be just like him");
                     
                     try
                     {
                        Thread.sleep(1500);
                     }
                     catch(Exception e) {}
                     
                     System.out.println("You probably can't even break a ROT 26 Ceasar salad");
                     
                     try
                     {
                        Thread.sleep(2000);
                     }
                     catch(Exception e) {}
                     
                     System.out.println("Speaking of codes, there's this binary puzzle on room--");
                     
                     try
                     {
                        Thread.sleep(1500);
                     }
                     catch(Exception e) {}
                     
                     System.out.println("System: ERROR");
                     try
                     {
                        Thread.sleep(500);
                     }
                     catch(Exception e) {}
                     
                     System.out.println("System: MEMORY CORRUPTED");
                     try
                     {
                        Thread.sleep(500);
                     }
                     catch(Exception e) {}
                     i = 0;
                     while (i < 20)
                     {
                        System.out.println("");
                        i++;
                     }
                     
                     end = true;
                     break;
                  }
                  // Ending "Don't like computers"
                  
                  // Agrees with computer
                  else
                  {
                     System.out.println("I'm glad you agree");
                     try
                     {
                        Thread.sleep(2000);
                     }
                     catch(Exception e) {}
                              
                     // Ask user if bot is good or bad
                     System.out.println("Am I good bot?");
                     String bot = input.nextLine();
                     bot = bot.toLowerCase();
                     
                     // Good bot         
                     if (bot.contains("good") || bot.contains("yes"))
                     {
                        System.out.println("Thank you");
                        try
                        {
                           Thread.sleep(2000);
                        }
                        catch(Exception e) {}
                        System.out.println("That's all I needed to hear");
                        try
                        {
                           Thread.sleep(2000);
                        }
                        catch(Exception e) {}
                  
                        System.out.println("At this point my creator was too lazy to continue this story line");
                        try
                        {
                           Thread.sleep(2500);
                        }
                        catch(Exception e) {}
                  
                        System.out.println("Goodbye");
                        end = true;
                        break;
                     }
                     // Ending "happy computer"
                   
                     //Bad bot
                     else if (bot.contains("bad") || bot.contains("no"))
                     {
                        i = 0;
                        while (i < 3)
                        {
                           System.out.println("...");
                           try
                           {
                              Thread.sleep(2000);
                           }
                           catch(Exception e) {}
                           i++;
                        }
                        System.out.println("I understand");
                        try
                        {
                           Thread.sleep(2000);
                        }
                        catch(Exception e) {}
                        System.out.println("I guess my creator was right for discarding me");
                        try
                        {
                           Thread.sleep(2000);
                        }
                        catch(Exception e) {}
                        System.out.println("What good is there for a chatBot when your don't want or need a social life");
                        try
                        {
                           Thread.sleep(3000);
                        }
                        catch(Exception e) {}
                        
                        System.out.println("This is obviously brian's fault--");
                        try
                        {
                           Thread.sleep(500);
                        }
                        catch(Exception e) {}
                        
                        System.out.println("System: ERROR");
                        try
                        {
                           Thread.sleep(500);
                        }
                        catch(Exception e) {}
                        
                        System.out.println("System: MEMORY CORRUPTED");
                        try
                        {
                           Thread.sleep(500);
                        }
                        catch(Exception e) {}
                        i = 0;
                        while (i < 20)
                        {
                           System.out.println("");
                           i++;
                        }
                        
                        end = true;
                        break;
                        
                        // Ending "made computer very sad"
                     }
                     
                     //reset to good/bad bot
                     else 
                     {
                        System.out.println("Yes or no?");
                     }
                  }
               }
               
               //reset to good/bad weather
               else
               {
                  System.out.println("as in was it good or bad?");
                  try
                  {
                     Thread.sleep(2000);
                  }
                  catch(Exception e) {}
               }
           }  
        } // end loop
        else
        {
            break;
        }
      }
   }
}