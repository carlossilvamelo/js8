package studies;

import java.util.Arrays;

public class SumIntegers {

	public static int sum(int[] arr){
	    return Arrays.stream(arr).filter(x -> x>=0).sum();
	}
	
	public static void main(String[] args) {
		System.out.println(sum(new int[]{-1,2,3,4,-5}));
	}
}
