import java.io.*;
import java.util.*;

class problem71A {
    public static void main(String args[]) throws IOException   {
        Scanner scan = new Scanner(System.in);
        int num_of_cases = scan.nextInt();
        while (num_of_cases-- > 0) {
            String word = scan.next();
            int length = word.length();
            if (length > 10)
                System.out.println(word.charAt(0) + Integer.toString(length - 2) + word.charAt(length - 1));
            else
                System.out.println(word);
        }
        scan.close();
    }
}
