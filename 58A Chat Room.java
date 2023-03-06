import java.util.*;
import java.io.*;
import java.lang.*;

public class problem58A    {
	public static void main (String args[]) throws IOException  {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		Character[] word = {'h', 'e', 'l', 'l', 'o'};
		int i = 0;
		char search = word[i];
		for (char c : s.toCharArray()) {
			if (c == search && i == 4)  {
				System.out.println("YES");
				return;
			} 
            else if (c == search) {
				i++;
				search = word[i];
			}
		}

		System.out.println("NO");
	}	
}
