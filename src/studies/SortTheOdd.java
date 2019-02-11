package studies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheOdd {
	
	public static int[] sortArray(int[] array) {
		
		List<Integer> oddList = Arrays.stream(array)
				.filter(n -> n % 2 != 0).boxed().sorted().collect(Collectors.toList());
		int countOdds = 0;
		for(int i=0; i < array.length ;i++) {
			if(array[i] % 2 != 0)
				array[i] = oddList.get(countOdds++);				
		}

	    return array;
	  }
	
	public static void main(String[] args) {
		
		// { 1, 3, 2, 8, 5, 4 }
		System.out.println(Math.abs(-3));
	} 
	

}
