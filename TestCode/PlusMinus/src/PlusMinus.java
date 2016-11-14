
import java.util.*;

public class PlusMinus {
    
    static void plusMinus(int[] myArray) {         
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        float fractionSum;
        
        for(int i = 0 ; i < myArray.length; i++) {
             if (myArray[i] > 0) {
                  positiveCount++ ;
              } else if (myArray[i] < 0) {
                  negativeCount++;
              } else if (myArray[i] == 0) {
                  zeroCount++;
              }
        }
        
         
               fractionSum = (float) positiveCount/myArray.length;
               System.out.println(fractionSum);
               
               fractionSum = (float)negativeCount/myArray.length;
               System.out.println(fractionSum);
               
                fractionSum = (float)zeroCount/myArray.length;
               System.out.println(fractionSum);
         
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t;
       
        
         t = in.nextInt();
        int[] myArray = new int[t];
          for (int i =0; i < t; i++) {
             myArray[i] = in.nextInt();
          }
          
          plusMinus(myArray);
          
          in.close();
    }
}