package WhileLoop;

public class OddnumberEvenumber
{
    public static void main(String[] args)
    {
        int i=1;
        while(i<=10)
        {
            if(i%2==0)
            {
               System.out.println("even number  "+i);

            }
           if(i%2==1)
            {
                System.out.println("odd number  "+i);

            }
            i++;
        }
    }
}
