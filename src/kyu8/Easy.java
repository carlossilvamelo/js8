package kyu8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Easy {

	public static String rotate(String s) {
		return s.substring(1) + s.charAt(0);
	}
	
	public static long maxRot(long n) {
		String number = Long.toString(n);
		
		List<Long> list = new ArrayList<Long>();
		list.add(Long.parseLong(number));
		number = rotate(number);
		list.add(Long.parseLong(number));
		number = number.charAt(0) + rotate(number.substring(1));
		list.add(Long.parseLong(number));
		number = number.substring(0, 1) + rotate(number.substring(2));
		list.add(Long.parseLong(number));
		number = number.substring(0, 2) + rotate(number.substring(3));
		list.add(Long.parseLong(number));
		
		Collections.sort(list, (a,b)-> b.compareTo(a));
		
		return list.get(0);
	}

	public static void main(String[] args) {
		System.out.println(maxRot(69418307));

	}

}
