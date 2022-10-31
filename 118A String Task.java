import java.io.*;
import java.util.*;


class  problem118A {
    
    public static void main (String args[]) throws IOException  {
        Scanner scan = new Scanner(System.in);
        char[] charArray = new char[100];
        char[] vowel = {'a','o','y','e','u','i'};
        String out = scan.next().toLowerCase().replaceAll("[aoyeuiAOYEUI]", "");
        StringBuilder str = new StringBuilder();

        for(int i=0;i<out.length();i++) {
            str.append(".");
            str.append(out.charAt(i));
        }
        System.out.println(str);
    }
}
