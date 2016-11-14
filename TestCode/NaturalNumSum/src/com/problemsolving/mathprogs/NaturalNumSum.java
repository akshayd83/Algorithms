package com.problemsolving.mathprogs;

public class NaturalNumSum {
	private static int getNaturalSum(int[] naturalNumbers) {
		int sum = 0;
		  for (int i = 0; i < naturalNumbers.length - 1; i++){
				System.out.println("The  natural no is : " + naturalNumbers[i]);
			  if (naturalNumbers[i] % 3 == 0 || naturalNumbers[i] % 5 == 0){
				  sum += naturalNumbers[i];
			  }
		  }
		  return sum;
	}
	
	public static void main(String[] args){
		int[]naturalNumbers = new int[1000];
		for (int i = 0; i < 1000; i++) {
			naturalNumbers[i] = i+1;
		}
		
		int naturalSum = getNaturalSum(naturalNumbers);
		System.out.println("The sum of 1000 Natural Numbers divisible by 3 and 5 is : " + naturalSum);
				
		
	}

}
