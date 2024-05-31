import javax.net.SocketFactory;

public class starpatn{
    public static void main(String args[]){
        int n=5;
        //outer llop
        /*for(int i=1; i<=n; i++)
        {
            //loop for space print
            for(int j=1; j<=n-i; j++)
            {
             System.out.print(" ");   
            }

            //loop for descending number print
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }

            //loop for print start 2 3 4 ...
            for(int j=2; j<=i; j++)
            {
             System.out.print(j);   
            }
        System.out.println();    

        }*/
            System.out.println("\n");

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=5; j++)
            {
                System.out.print("*");
            }

            
            System.out.println();
            

        }
        
    }
}