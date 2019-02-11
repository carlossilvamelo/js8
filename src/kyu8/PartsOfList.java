package kyu8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PartsOfList {
	
	
	 public static List<String[]> partlist(String[] arr) {
		 List<String[]> list = new ArrayList<String[]>();
		 
		 for(int i=1; i<arr.length-2;i++) {
			 list.add(Arrays.stream(Arrays.copyOfRange(new String[] {"vJQ", "anj", "mQDq", "sOZ"}, 0, 3))
						.collect(Collectors.toList()).toArray(arr));
		
		 }
		 return list;
	    }
	
	
	public static void main(String[] args) {
		
		System.out.println(partlist(new String[] {"vJQ", "anj", "mQDq", "sOZ"}));
//		System.out.println(Arrays.stream(new String[] {"vJQ", "anj", "mQDq", "sOZ"}).
//				forEach(x->x).));

		System.out.println(partlist(new String[] {"vJQ", "anj", "mQDq", "sOZ"}));
	}

}
