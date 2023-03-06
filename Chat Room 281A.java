import java.io.*;
import java.util.*;

class problem131A {
    
    public static void main (String args[]) throws IOException {
Scanner scan = new Scanner(System.in);
System.out.println("helowe enter word");
String word = scan.next();
String word1 = (word.substring(0,1)).toUpperCase() + word.substring(1);
System.out.println(word1);
    }
}
