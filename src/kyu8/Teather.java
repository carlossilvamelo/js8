package kyu8;

public class Teather {
	public static int seatsInTheater(int nCols, int nRows, int col, int row) {

		return (nCols - (col-1))*(nRows-(row));

	}

	public static void main(String[] args) {
		System.out.println(seatsInTheater(16,11,5,3));
	}

}
