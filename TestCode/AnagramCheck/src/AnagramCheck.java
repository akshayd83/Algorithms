import java.util.*;

public class AnagramCheck {
	private static List<List<String>> groupAnagrams(ArrayList<String> words){
		 Map<String, List<String>> groupedAnagramsMap = new HashMap<String, List<String>>();
		    for (String word : words) { 
		        char[] wordToSort = word.toCharArray();
		        Arrays.sort(wordToSort); //sorts word in ascending order e.g acr
		        String key = new String(wordToSort);//make the sorted string as key
		        
		      //get List of all the String values for the key  in groupedAnagramsMap
		        List<String> anagrams = groupedAnagramsMap.get(key);
		        
		        //if none exists create a new List and put it in the map along with the key
		        if (anagrams == null) {
		            anagrams = new ArrayList<String>();
		            groupedAnagramsMap.put(key, anagrams);
		        }
		        //finally add the word to the value List of Strings
		        if (!anagrams.contains(word)) {
			        anagrams.add(word);   
		        }
		    }
		    //return all the values as a List of List
		    return new ArrayList<List<String>>(groupedAnagramsMap.values());
    }
	    
		public static void main (String[] args) {
			//code
			ArrayList<String> stringForAnagrams = new ArrayList<>();
			stringForAnagrams.add("arc");
			stringForAnagrams.add("rac");
			stringForAnagrams.add("rac");
			stringForAnagrams.add("tar");
			stringForAnagrams.add("hello");
			stringForAnagrams.add("rat");
			
			List<List<String>> anagramSet = groupAnagrams (stringForAnagrams);
			
			System.out.println(anagramSet);
		}

}
