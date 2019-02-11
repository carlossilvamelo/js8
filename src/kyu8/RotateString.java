package kyu8;

import java.util.Arrays;
import java.util.List;

public class RotateString {
	
	
	public static String rotate(String name) {
		return name.substring(1) + name.charAt(0);
	}
	public static boolean containAllRots(String strng, List<String> arr) {
        
		for(int i=0; i<strng.length() ;i++) {
			if(!arr.contains(strng))
				return false;
			strng = rotate(strng);
			System.out.println(strng);
			
		}
		
		return true;
		
    }
	
	
	public static void main(String[] args) {
		String nome = "carlos";
		List<String>   a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
		System.out.println(containAllRots("XjYABhR", a));
	}

}
