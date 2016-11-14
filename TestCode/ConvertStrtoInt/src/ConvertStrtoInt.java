
public class ConvertStrtoInt {
	
	static public int strtoInt(String givenString){
		/*int convertedInt = -1;
		
		if(givenString == null || givenString.length() == 0) {
			return -1;
		}
		convertedInt = Integer.parseInt(givenString);
		try {
			convertedInt = Integer.parseInt(givenString);
		} catch (Exception e){
			return -1;
		}
		return convertedInt;*/
		
        boolean isNegative = givenString.charAt(0) == '-';
        if (givenString.charAt(0) == '-' || (givenString.charAt(0) == '+')){
        	givenString = givenString.substring(1);
        }
        if (givenString.charAt(0) < 48 || (givenString.charAt(0) > 57)){
        	givenString = givenString.substring(1);
        }
		
		 int answer = 0, factor = 1;
		    for (int i = givenString.length()-1; i >= 0; i--) {
		        answer += (givenString.charAt(i) - '0') * factor;
		    	   factor *= 10;
		       
		    }
		    return isNegative ? -1 * (int)answer : (int)answer;
	}
	
	public static void main(String[] args) {	
		String numString = "-$1725";
		int result = strtoInt(numString);
        if (result != 0) {
        	System.out.println("Yay " + result);
        }
	}

}
