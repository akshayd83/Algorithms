
public class MaximumSubArraySum {
	
	/**
	 * Find the contiguous subsequence in an array with Maximum sum
	 * @param array
	 * @return Maximum sum.
	 */
	public static int getMaximumSubArraySum(final int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
			int localMaxSum = 0;
			int finalMaxSum = array[0];
		    for (int index = 0; index < array.length; index++){
		    	//  add local maximum sum to the value at array index
		    	localMaxSum =  localMaxSum + array[index];
		    	finalMaxSum = Math.max(finalMaxSum, localMaxSum);
		    }
		    return finalMaxSum;  
	    
	}
	
	//Main method as a tester program to test various input sets.
	public static void main(String[] args) {
	    int[] subArray = { 1, 2, 0, 3, 4, 5, 0 };//positive Array
	    //int[] subArray = { -1, -2, 0, -3, -4,-5, -6, -77, -3, -6, -10 }; //negative Array
	    //int[] subArray = { -1, 2, 3, -4, 5, 6, -77, -3, -6, -10 };//Mix
	    //int[] subArray = new int[0]; //empty array
	    int max = getMaximumSubArraySum(subArray);
	    System.out.println("The maximum value of the seq is " + max);
	}
	

}
