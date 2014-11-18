
public class ArrayOperations
{
   
    public static void main(String[] args)
    {
        double[] x = { 8, 4, 5, 21, 7, 9, 18, 2, 100};
        
        
        System.out.println(x.length);
        
        System.out.println(x[0]);
        
        System.out.println(x[8]);
        
        System.out.println(x[x.length-1]);
        
        for( int i =  0; i < x.length; i++)
        {
            System.out.print(x[i]+ ", ");
        }
        
        for( int i =  0; i < x.length; i++)
        {
            System.out.println("\nIndex: " + i + "\t" + x[i]);
        }
        
        for( int i =  x.length - 1; i >= 0; i--)
        {
            System.out.println("Index: " + i + "\t" + x[i]+ ", ");
        }
        
        for(double i: x)
        {
            System.out.println(i);
        }
        
    }

}
