import java.io.*;
import java.util.*;

class problem4A  {
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num==2)
        {
            System.out.println("NO");
        }
        else if (num % 2 == 0)   {
            System.out.println("YES");
        }
        else    {
            System.out.println("NO");
        }
    }
}
