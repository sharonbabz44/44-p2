public class Average
   {
      public static void main(String []arg)
         {
            double num[]={10.5,12.5,15.0,20.5,22.5};
            double result=0;
            int i;
            for (i=0;i<5;i++)
               result=result+num[i];
            
            System.out.println("Average is" +result/5);
         }
   }
