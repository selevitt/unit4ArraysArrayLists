
import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       
       System.out.println(names);
       
       String first = names.get(0);
       String last = names.get(7);
       
       System.out.println(first);
       System.out.println(last);
       
       System.out.println(names.size());
       
   }
} 