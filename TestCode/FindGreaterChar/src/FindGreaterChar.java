
/** 
 * Return the smallest character that is strictly larger than the search character,
 * otherwise return the first character in the string.
 * @param sortedStr : sorted list of letters, sorted in ascending order.
 * @param c : character for which we are searching.
 * Given the following inputs we expect the corresponding output:
   "cfjpv"
   'a', 'A'
 * ['c', 'f', 'j', 'p', 'v'], 'a' => 'c'
 * ['c', 'f', 'j', 'p', 'v'], 'c' => 'f'
 * ['c', 'f', 'j', 'p', 'v'], 'k' => 'p'
 * ['c', 'f', 'j', 'p', 'v'], 'z' => 'c' // The wrap around case
 * ['c', 'f', 'k'], 'f' => 'k'
 * ['c', 'f', 'k'], 'c' => 'f'
 * ['c', 'f', 'k'], 'd' => 'f'
 */
public class FindGreaterChar {
	public static char binarySearch(char[] list, char key) {
		   int low = 0;
		   int high = list.length - 1;

		   while (high >= low) {           //the loop only stops when
		                                   //high gets updated to something
		        if ((key < list[low] && low == 0) || (key > list[high] && high == list.length -1)) {
		        	System.out.print("list[low] is" + list [low]);
		        	System.out.println("list[high] is "+ list[high]);
		        	return list[low];
		        }
		  
		      int mid = (low + high) / 2;  //note what this does
		                                   //if (low + high) is odd
		   
		      if (key < list[mid])         //update index of the 
		         high = mid - 1;           //right-most element considered 
		                                
		      else if (key > list[mid])    //update index of
		         low = mid + 1;            //left-most element considered
		                                
		      else {
		    	  if ( key == list[mid] && mid < list.length - 1) { 
		    		  return list[mid +1]; 
		    	  } else {
		    		  return key;
		    	  }
		      }
		                       

		   }

		   return list[low];  //key was not found, so
		                     //return the first character
		}
	
	public static void main(String[] args) {
		  char[] list1 = {'A','a','e','f'};
		  System.out.println("Character is " + binarySearch(list1,'h'));
		  //prints "char is A"

		  char[] list2 = {'b','c','l','m','n'};
		  System.out.println("Character is " + binarySearch(list2,'k'));
		  //prints "char is l"
		  
		  char[] list3 = {'d','e', 'f','g','z'};
		  System.out.println("Character is " + binarySearch(list3,'z'));
		  //prints "char is z"
		  
		  char[] list4 = {'c', 'f', 'j', 'p', 'v'};
		  System.out.println("Character is " + binarySearch(list4,'c'));
		  //prints "char is f"
		  
		  System.out.println("Character is " + binarySearch(list4,'a'));
		  //prints "char is c"
		  
		  System.out.println("Character is " + binarySearch(list4,'k'));
		  //prints "char is p"
		}

}
