package studies;

public class TrailingZeros {

	public static int zeros(int n) {

		if(n/5 == 0)
	        return 0;
	      return n/5 + zeros(n/5);
	}

	public static void main(String[] args) {
		System.out.println(zeros(12));
	}

}
