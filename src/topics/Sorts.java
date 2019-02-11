package topics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorts {

	/**
	 * sortArrayOfStringsCaseSensetive
	 * 
	 * @param array
	 */
	public static void sortArrayOfStringsCaseSensetive(String[] array) {
		System.out.println("\n====== sortArrayOfStringsCaseSensetive =====");
		Arrays.sort(array);
		for (String s : array) {
			System.out.print(s + " ");
		}
		System.out.println("\n===========");
	}

	/**
	 * sortArrayOfStringsNotCaseSensetive
	 * 
	 * @param array
	 */
	public static void sortArrayOfStringsNotCaseSensetive(String[] array) {
		System.out.println("\n====== sortArrayOfStringsNotCaseSensetive =====");

		Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);

		for (String s : array) {
			System.out.print(s + " ");
		}

		System.out.println("\n===========");
	}

	/**
	 * 
	 * @param array
	 */
	public static void reverseArrayOfString(String[] array) {
		System.out.println("\n====== reverseArrayOfString =====");

		List<String> list = Arrays.asList(array);
		Collections.reverse(list);

		array = list.toArray(array);

		for (String s : array) {
			System.out.print(s + " ");
		}

		System.out.println("\n===========");
	}

	public static void sortArrayIntLambdaComparator(Integer[] array) {
		System.out.println("\n====== sortArrayIntLambdaComparator =====");
		
		Arrays.sort(array, (a,b)-> b.compareTo(a));

		for (Integer s : array) {
			System.out.print(s + " ");
		}

		System.out.println("\n===========");
	}

	public static void main(String[] args) {
		String[] arrayStrings = new String[] { "Acat", "junk", "Piece", "needle", "acat", "something" };
		List<String> listStrings = Arrays.asList("Acat", "junk", "Piece", "needle", "acat", "something");
		Integer[] arrayIntegers = new Integer[] {2,4,74,2,45,767};
 
		sortArrayOfStringsCaseSensetive(arrayStrings);
		sortArrayOfStringsNotCaseSensetive(arrayStrings);

		reverseArrayOfString(arrayStrings);
		sortArrayIntLambdaComparator(arrayIntegers);
		
	}
}
