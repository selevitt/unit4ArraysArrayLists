import java.util.Scanner;

public class RandomDistribution
 {
     public static void main(String[] args) 
     {
         Scanner in = new Scanner(System.in);

         System.out.print("How many random numbers? ");
         int num = in.nextInt();

         System.out.print("What is the number of values for each random draw? ");
         int val = in.nextInt();

         int[] all = new int[num];
         int[] draw = new int[val];

         for (int i = 0; i < num; i++) 
         {
             all[i] = (int)(Math.random() * i);
         }

         for (int i = 0; i < val; i++) 
         {
             draw[i] = all[((int)(Math.random() * num))];
         }

         for (int i = 0; i < val; i++) 
         {
             System.out.println(i + "\t" + draw[i]);
         }
     }
}