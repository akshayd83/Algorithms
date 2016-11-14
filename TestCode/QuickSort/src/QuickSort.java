
public class QuickSort {
	int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	 
	public int[] quickSort(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	      return arr;
	}
	
	public static void main (String[] args) {
		int[] unsortedArray = {10,2,3,75,4,6,7};
		QuickSort qs = new QuickSort();
		int[] sortedArray = qs.quickSort(unsortedArray, 0,6);
		for( int element : sortedArray){
			System.out.print(" | " + element + " |" );
		}
	}

}
