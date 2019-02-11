package studies;

public class NextBiggerNumberWithTheSameDigits {

	public static long nextBiggerNumber(long n) {
		String number = Long.toString(n);
		String newNumber;
		Long l=n;
		boolean finish = true;
		while(finish) {
			l++;
			newNumber = Long.toString(n);
			for(int i=0 ; i <newNumber.length() ;i++) {
				if(!newNumber.contains(number)) {
					return -1;
				}
			}
			break;
			
		}
		
		return n;
	}

	public static void main(String[] args) {
		System.out.println(2071 % 2017);
	}
}
