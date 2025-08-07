public class Patterns{
    public static void main(String[] args)
    {
        System.out.println("Hello MF!");
        diamond();
    }

    static  void diamond()
    {
        int size= 4; //Size of upper half of the diamond
        char ch= 'A';

        //Upper half of the diamond
        for(int i=1; i<=size; i++)
        {
            for (int j=size; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.printf("%c ",ch);
                ch++;
            }
            System.out.println("");
        }

        //Lower half of diamond
        for(int i=1; i<=size-1; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int k=size-1; k>=i; k--)
            {
                System.out.printf("%c ",ch);
                ch++;
            }
            System.out.print("\n");
        }
    }
}