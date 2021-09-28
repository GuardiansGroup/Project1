import java.util.Arrays;

public class ArrayBagTest 
{
   public static void main(String[] args) 
   {
      BagInterface<String> bag1 = new ResizeableArrayBag<String>();

      BagInterface<String> bag2 = new ResizeableArrayBag<String>();

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
      
      //implmenting the union method
      System.out.println("bag1 union to bag2 is: " + Arrays.toString(bag1.union(bag2).toArray()));
   }

}
