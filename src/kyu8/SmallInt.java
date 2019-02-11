package kyu8;



public class SmallInt {
	public static boolean isNegativeZero(float n) {
		return n != 0? false: Float.toString(n).contains("-0");
	}

	public static void main(String[] args) {
		// System.out.println(findSmallestInt(new int[]{78,56,232,12,11,43}));
		// System.out.println(Arrays.stream(new
		// int[]{78,56,232,12,11,43}).summaryStatistics());
		System.out.println(isNegativeZero(0f));


	}

}
