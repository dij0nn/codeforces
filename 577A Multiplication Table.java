import java.io.*;
import java.util.*;

class problem577A   {

    public static void main(String args[]) throws IOException   {
        Scanner scan = new Scanner(System.in);
        long size = scan.nextLong();
        long num = scan.nextLong();
        int count = 0;
        for (int i = 1; i <= size; i++) {
            if (num % i == 0 && num <= i * size) {
                count++;
            }
        }
        System.out.println(count);
    }
}
