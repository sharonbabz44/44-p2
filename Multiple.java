public class Multiple
   {
      String State;
      String Info;
      public String Message()
         {
            State="The name of the new girl is" + "  ";
            return State;
         }
      public String Bio()
         {
            Info="Martha was born on the 4th of February 1980. She is the last born in a family of 10 siblings.";
            return Info;
         }
      
      public static void main(String []arg)
         {
           //create the instance of the class
           Multiple dis=new Multiple();
           
           
           String Name=dis.Message();
           String More=dis.Bio();
           String jina="Martha";
           
           System.out.println(Name+jina);
           System.out.println(More);
         }
    }
         