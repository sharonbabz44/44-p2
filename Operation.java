public class Operation
   {
      int sum=0;
      int sub=0;
      public int Addition(int a, int b)
         {
            //adding two integers values
            sum=a+b;
            //returning the summation of two values
            return sum;
         }
      public int Subtraction(int x, int y)
         {
            // Subtracting two integers
            sub=x-y;
            return sub;
         }
      
      public static void main(String []arg)
         {
            //create the instance of Operation class
            Operation add=new Operation();
            Operation minus=new Operation();
            
            // calling Addition method to add two integers
            int s=add.Addition(10,5);
            //calling Subtraction method 
            int p=minus.Subtraction(50,10);
            
            System.out.println("The sum of the two integers is " + s);
            System.out.println("The difference of the two integers is " + p);
         }
   }