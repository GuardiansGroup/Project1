//used the source code from the professor, so the other methods are tested and work
import java.util.Arrays;

public class LinkedBagTest 
{
   public static void main(String[] args) 
   {
      //creating two bags to compare with each other using the below methods
      BagInterface<String> bag1 = new LinkedBag<>();

      BagInterface<String> bag2 = new LinkedBag<>();

      //adding items to both bags
      bag1.add("x");
      bag1.add("y");
      bag1.add("z");
      bag1.add("d");
      
      bag2.add("x");
      bag2.add("y");
      bag2.add("s");
      bag2.add("m");
      
      System.out.println("The contents in bag1: " + Arrays.toString(bag1.toArray()));
      System.out.println("The contents in bag2: " + Arrays.toString(bag2.toArray()));
      
      //implementing union method
      System.out.println("bag1 union to bag2 is: " + Arrays.toString(bag1.union(bag2).toArray()));
      
      //implementing difference method
      System.out.println("bag1 difference to bag2 is: " + Arrays.toString(bag1.difference(bag2).toArray()));

   }

}
