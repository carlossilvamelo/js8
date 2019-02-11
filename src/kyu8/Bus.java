package kyu8;

import java.util.stream.IntStream;

public class Bus {

	public static int enough(int cap, int on, int wait) {
		return (cap-on) >= wait ? 0 : wait -(cap-on);
	}

	public static void main(String[] args) {
		System.out.println(enough(100, 60, 50));
		

	}

}
