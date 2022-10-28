import java.io.*;
import java.util.*;

class problem158A {
    public static void main(String args[]) throws IOException   {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int k = scan.nextInt();
int[] nums = new int[n + 1];
int threshold = 0;
for (int i = 1; i <= n; i++) {
    int score = scan.nextInt();
    nums[i] = score;
    if (i == k)
        threshold = score;
}
int count = 0;
for (int i = 1; i <= n; i++) {
    if (nums[i] >= threshold && nums[i] > 0)
        count++;
}
System.out.println(count);
    }
}