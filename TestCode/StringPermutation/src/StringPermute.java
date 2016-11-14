import java.util.ArrayList;


public class StringPermute {
	public static void main(String[] args) {

        String ourword = "aabbaa";
        /*String[] ourArray = ourword.split("");
        permute(ourArray, ourArray.length);*/
        System.out.println("Outword combination" + permutation(ourword));

    }

	
	/**
	 * List permutation of a string
	 * 
	 * @param s the input string
	 * @return  the list of permutation
	 */
	public static ArrayList<String> permutation(String s) {
		if (s == null || "".equals(s))
	        return null;
	    // The result
	    ArrayList<String> res = new ArrayList<>();
	    // If input string's length is 1, return {s}
	    if (s.length() == 1) {
	        res.add(s);
	    } else if (s.length() > 1) {
	        int lastIndex = s.length() - 1;
	        // Find out the last character
	        String last = s.substring(lastIndex);
	        // Rest of the string
	        String rest = s.substring(0, lastIndex);
	        // Perform permutation on the rest string and
	        // merge with the last character
	        res = merge(permutation(rest), last);
	    }
	    return res;
	}

	/**
	 * @param list a result of permutation, e.g. {"ab", "ba"}
	 * @param c    the last character
	 * @return     a merged new list, e.g. {"cab", "acb" ... }
	 */
	public static ArrayList<String> merge(ArrayList<String> list, String c) {
	    ArrayList<String> res = new ArrayList<>();
	   
	    // Loop through all the string in the list
	    for (String s : list) {
	        // For each string, insert the last character to all possible positions
	        // and add them to the new list
	        for (int i = 0; i <= s.length(); ++i) {	        	
		            String ps = new StringBuffer(s).insert(i, c).toString();
		            if(!stringClean(ps)) {
			            res.add(ps);
		            }
	        }
	    }
	    return res;
	}
	
	public static boolean stringClean(String str) {
		boolean areNearByCharactersSame = false;
	    if (str == null || "".equals(str))
	        return false;
	    char[] chars = str.toCharArray();
	    for (int i = 1; i < chars.length; i++) {
	        if (chars[i] == chars[i-1])
	            areNearByCharactersSame = true;
	    }
	    return areNearByCharactersSame;
	}
	
	/*public static String stringClean(String str) {
	    if (str == null || "".equals(str))
	        return "";
	    char[] chars = str.toCharArray();
	    StringBuffer buffer = new StringBuffer();
	    for (int i = 1; i < chars.length; i++) {
	        if (chars[i] != chars[i-1])
	            buffer.append(chars[i]);
	    }
	    return buffer.toString();
	}*/

}
