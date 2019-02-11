package kyu8;

import java.util.Arrays;

public class Animals {
	public static int[] countPositivesSumNegatives(int[] input)
    {
        return (input.length == 0 || input == null)? new int[] {}:
        	new int[] 
            		{(int)Arrays.stream(input).filter(p-> p>=0).count(),
            			Arrays.stream(input).filter(n-> n<0).sum()}; //return an array with count of positives and sum of negatives
    }
	public static void main(String[] args) {
		
		int[] array = countPositivesSumNegatives(new int[] {0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14});
				for(int i : array)
					System.out.println(i);
	}

}
