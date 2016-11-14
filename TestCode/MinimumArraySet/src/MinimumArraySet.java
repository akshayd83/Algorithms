
public class MinimumArraySet {
	 public static int smallestSubWithSum(int[] arr, int n, int x)
	    {
	       int minLen = n + 100;
	        int sum = arr[0]; 
	        int start = 0;

	        for(int i = 1; i <= n; i++)
	        {
	            while(sum > x && start < i - 1)
	            {
	                if(minLen > i - start)
	                    minLen = i - start;

	                sum = sum - arr[start];
	                start++;
	            }

	            if(i < n)
	                sum += arr[i];
	        }

	        return minLen;
		 // Initialize current sum and minimum length
		/*    int curr_sum = 0, min_len = n+1;
		 
		    // Initialize starting and ending indexes
		    int start = 0, end = 0;
		    while(end < n) {
		        // Keep adding array elements while current sum
		        // is smaller than x
		        while(curr_sum <= x && end < n) {
		        	curr_sum += arr[end++];
		        }
		            
		 
		        // If current sum becomes greater than x.
		        while (curr_sum > x && start < n) {
		            // Update minimum length if needed
		            if (end - start < min_len)
		                min_len = end - start;
		 
		            // remove starting elements
		            curr_sum -= arr[start++];
		        }
		    }
		    return min_len;*/
	    }

	    public static void main(final String[] args)
	    {
	        int[] arr1 = {1, 4, 45, 6, 10, 19};
	        int x = 51;
	        System.out.println(smallestSubWithSum(arr1, arr1.length, x));

	        int arr2[] = {1, 10, 5, 2, 7};
	        x  = 9;
	        System.out.println(smallestSubWithSum(arr2, arr2.length, x));

	        int arr3[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
	        x  = 280;
	        System.out.println(smallestSubWithSum(arr3, arr3.length, x));

	    }

}
