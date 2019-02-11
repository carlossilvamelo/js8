package studies;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CommonDenominators {
	private static int mdc(int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
	private static int mmc(int a, int b){
        return a * (b / mdc(a, b));
    }
	
	public static String convertFrac(long[][] lst) {
		List<Integer> den = new ArrayList<Integer>();	
		for(int i=0; i<lst.length  ;i++) {
			den.add((int) lst[i][1]);
		}
		den.sort(Comparator.reverseOrder());
		int mmc = mmc(den.get(0),den.get(1));

		String result = "";
		for(int i=0;i<lst.length;i++) {
			result += String.format("(%d,%d)", 
					(mmc/lst[i][1])*lst[i][0] %10 == 0 ? ((mmc/lst[i][1])*lst[i][0])/10: (mmc/lst[i][1])*lst[i][0],
					mmc%10 ==0 ? mmc/10 : mmc);
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		//System.out.println(convertFrac(new long[][] {{34, 102}, {14, 70}, {78, 156}, {47, 235}, {39, 195}}));
		System.out.println(12/436254);
	}

}
