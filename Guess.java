import java.util.Scanner;
import java.util.Random;

class Number
{
    int systeminput;
    int userinput;
    int noofguesses=0;

Number()
{
  Random random = new Random();  
  this.systeminput=random.nextInt(100)+1;
}
    public boolean userInput()
    {
        if(noofguesses<10)
        {
            System.out.print("Guess the number : ");
            this.userinput = Guess.takeIntegerInput(100);
            noofguesses++;
            return false;
        }
        else
        {
            System.out.println("Finished attempting...Try Again\n");
            return true;
        }
    }
    
    public boolean isrightguess()
    {
        if(systeminput==userinput)
        {
            System.out.println("Congratulations,your guess is correct " + systeminput + " in " + noofguesses + " guesses");
            switch(noofguesses)
            {
                case 1:
                    System.out.println("Your score is 100");
                    break;
                case 2:
                      System.out.println("Your score is 90");
                    break;
                case 3:
                      System.out.println("Your score is 80");
                    break;
                case 4:
                      System.out.println("Your score is 70");
                    break; 
                case 5:
                      System.out.println("Your score is 60");
                    break; 
                 case 6:
                      System.out.println("Your score is 50");
                    break;   
                 case 7:
                      System.out.println("Your score is 40");
                    break;   
                 case 8:
                      System.out.println("Your score is 30");
                    break;  
                case 9:
                      System.out.println("Your score is 20");
                    break;    
                 case 10:
                      System.out.println("Your score is 10");
                    break;   
                }
                System.out.println();
                return true;
            }
        
        else if (noofguesses<10 && userinput>systeminput)
        {
            if (userinput-systeminput > 10)
            {
                System.out.println("Too High");
            }
            else
            {
                System.out.println("Little High");
            }
        }
         else if(noofguesses<10 && userinput<systeminput)
         {
             if(systeminput-userinput>10)
             {
                 System.out.println("Too Low");
             }
             else
             {
                 System.out.println("Little low");
             }
             }
             return false;
    }
            
    }
    
    public class Guess
    {
        public static int takeIntegerInput(int limit)
        {
            int a=0;
            boolean flag=false;
            
            while(!flag)
            {
                try
                {
                    Scanner sc=new Scanner(System.in);
                    a = sc.nextInt();
                    flag=true;
                    
                    if(flag&&a>limit || a<1)
                    {
                        System.out.println("Choose number between 1 to " + limit);
                        flag=false;
                        }
                }
                catch(Exception e)
                {
                   System.out.println("Enter integer value");
                        flag=false; 
                }
            };
                return a;
            }
            
            public static void main(String[] args)
            {
               System.out.println("1. Start game \n2. Quit");
               System.out.println("Enter your choice : ");
               int ch=takeIntegerInput(2);
               int nextround=1;
               int noofround=0;
               if(ch==1)
               {
                   while(nextround==1)
                   {
                       Number no = new Number();
                       boolean iscorrect=false;
                       boolean islimit=false;
                       System.out.println("\nRound " + ++noofround + " starting....");
                       
                       while(!iscorrect && !islimit)
                       {
                           islimit=no.userInput();
                           iscorrect=no.isrightguess();
                       }
                       System.out.println("1. Next Round \n2. Quit");
                       System.out.println("Enter your choice : ");
                       nextround=takeIntegerInput(2);
                       if(nextround!=1)
                       {
                           System.exit(0);
                       }
                   }
               }
               else
               {
                   System.exit(0);
               }
            }
                
            }
        
    
    


