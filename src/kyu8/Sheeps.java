package kyu8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sheeps {
	
	public static String countingSheep(int num) {
		return IntStream.rangeClosed(1, num)
                .mapToObj(i -> i + " sheep...")
                .collect(Collectors.joining());
	  }
	
	public static void main(String[] args) {
		System.out.println(countingSheep(4));
		
		System.out.println(IntStream.rangeClosed(0, 4).mapToObj(x->x+"").collect(Collectors.joining()));
	}

}
