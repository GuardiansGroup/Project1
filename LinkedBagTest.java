import java.util.Arrays;

public class LinkedBagTest 
{
   public static void main(String[] args) 
   {

      BagInterface<String> bag1 = new LinkedBag<>();

      BagInterface<String> bag2 = new LinkedBag<>();

      bag1.add("x");
      bag1.add("y");
      bag1.add("z");
      bag1.add("d");
      
      bag2.add("x");
      bag2.add("y");
      bag2.add("s");
      bag2.add("m");

   }

}