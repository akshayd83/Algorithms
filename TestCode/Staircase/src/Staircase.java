
import java.util.*;

public class Staircase {
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    Scanner in = new Scanner (System.in);
    int t;
    t = in.nextInt();
    for (int i= 1; i<=t ; i++) {
        int spaces =i;
         while (spaces <= t-1) {
             System.out.print(" ");
             spaces++;
         }
          int stairs = i;
          while (stairs > 0) {
              System.out.print("#");
              stairs--;
          }
          System.out.println();
    }
    
    in.close();
 }
}