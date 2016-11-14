import java.util.*;

public class DiagonalArray {
    
    static int absDiagDifference(int[][] myArray) {
        int difference = 0;
        int diag1Sum = 0;
        int diag2Sum = 0;
        //Main diagonal sum.
          for (int i = 0; i < myArray.length; i++){
              for(int j = 0; j <  myArray[i].length ; j++){
                  if (i == j) {
                      diag1Sum += myArray[i][j];
                  }
              }
          }
        //Anti diagonal sum
        for(int i = 0, j = myArray[i].length -1; i < myArray.length; i++, j--) {
            diag2Sum += myArray[i][j];
            
        }
        
        difference = Math.abs( diag1Sum - diag2Sum);
        
        return difference;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t;
        int difference;
        t = in.nextInt();
        int[][] myArray = new int[t][t];
        
          for (int i = 0; i < myArray.length; i++) {
              for (int j = 0; j < myArray[i].length ; j++) {
                  myArray[i][j] = in.nextInt();
              }
          }
        
        difference = absDiagDifference(myArray);
        System.out.println(difference);
        in.close();
    }
}