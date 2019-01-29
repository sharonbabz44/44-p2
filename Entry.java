import java.util.Scanner;
public class Entry
   {
      public static void main(String [] arg)
         {
            Scanner a=new Scanner(System.in); 
            int age;
            
            System.out.println("Enter your age");
            age=a.nextInt();

            if (age>18)
               {
                  System.out.println("YOU CAN ENTER SINCE YOU HAVE AN ID");
               }
            else
               {
                  System.out.println("YOU ARE TOO YOUNG");
               }
         }
   }
