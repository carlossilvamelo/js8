package basic;

public class Test {

	public static int rowSumOddNumbers(int n) {
		int firstElement = firstOfLine(n);
		int rowSum = firstElement;

		for(int i=1; i < n;i++) {
			rowSum += (firstElement+(2*i));
			
		}
		return rowSum;
	}

	public static int firstOfLine(int line) {
		return line > 1 ? (firstOfLine(line - 1) + (2 * (line - 1))) : 1;
	}

	public static void main(String[] args) {

		
		System.out.println(rowSumOddNumbers(5));
		//rowSumOddNumbers(6);

	}
}