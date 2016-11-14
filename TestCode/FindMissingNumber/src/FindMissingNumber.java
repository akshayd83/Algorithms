
public class FindMissingNumber {

	void missingSum(int arr[])

	{

	    int tempSum = 0;
		 int i;
		 int sumOfMyArray = 0;
		 int size = arr.length;
		    int min = arr[0];
		    for (i = 0; i < size; i++) {
		    	if (min > arr[i]) {
		    		min = arr[i];
		    	}
		    	sumOfMyArray += arr[i];
		    }
		    int j = min;
		    
		     for (i = 0; i <= size; i++) {
		  
		    	tempSum += j; 
		    	j++;
		    	 
		     }
		  	  
		    int missingNum = tempSum - sumOfMyArray;
		    System.out.println("Missing number is" + missingNum);
		    
		 
	}

	public static void main(String[] args) {

		int a[]={7,8,10,11,12};

		FindMissingNumber ms=new FindMissingNumber();
		  

		ms.missingSum(a);

	}

}