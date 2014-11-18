
public class ArrayTracing
{
    public static void main(String[] args)
    {
        int[] a = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        
        int total = 0;
        
        for( int i = 0; i < 10; i++)
        {
            total = total + a[i];
        }
        System.out.println(total);
        
        total = 0;
        
        for( int i = 0; i < 10; i+=2)
        {
            total = total + a[i];
        }
        System.out.println(total);
        
        total = 0;
        
        for( int i = 1; i < 10; i+=2)
        {
            total = total + a[i];
        }
        System.out.println(total);
        
        total = 0;
        
        ///for( int i = 2; i <= 10; i++)
        //{
        //    total = total + a[i];
        //}
        
        //System.out.println(total);
        
        total = 0;
        
        for( int i = 1; i < 10; i= 2*i)
        {
            total = total + a[i];
        }
        System.out.println(total);
        
        total = 0;
        
        for( int i = 9; i >= 0; i--)
        {
            total = total + a[i];
        }
        System.out.println(total);
        
        
        total = 0;
        
        for( int i = 9; i >= 0; i-= 2)
        {
            total = total + a[i];
        }
        System.out.println(total);
        
        total = 0;
        
        for( int i = 0; i < 10; i++)
        {
            total =  a[i] - total;
        }
        System.out.println(total);
        
        for(int i = 1; i < 10; i++)
        {
            a[i] = a[i - 1];
        }
        
        for(int i = 9; i > 0; i--)
        {
            a[i] = a[i - 1];
        }
        
        for(int i = 0; i < 9; i++)
        {
            a[i] = a[i + 1];
        }
        
        for(int i = 8; i >= 0; i--)
        {
            a[i] = a[i + 1];
        }
        
        for(int i = 1; i < 10; i++)
        {
            a[i] = a[i] - a[i-1];
        }
        
        for(int i = 1; i < 10; i = i + 2)
        {
            a[i] = 0;
        }
        
        for(int i = 0; i < 5; i++)
        {
            a[i+5] = a[i];
        }
        
        for(int i = 1; i < 5; i++)
        {
            a[i] = a[9-i];
        }
    }
}
