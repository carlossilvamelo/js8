package studies;

public class ProductConsecutiveFibNumbers {

	public static int fib(int n) {
		return n > 1 ? fib(n-1) +fib(n-2) : n;
	}
	
	
	public static String calc(int prod) {
		int x = 5;
		
		int f1 = fib(x);
		int f2 = fib(x+1);
		return "("+f1+","+f2+","+f1*f2+")";
	}
	
	public static void main(String[] args) {
		System.out.println(fib(10));
		System.out.println(calc(2));
	}
}
