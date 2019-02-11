package studies;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GreedIsGood {

	public static Long counter(int[] array, int n) {
		return Arrays.stream(array).boxed().filter(x -> x == n).count();
	}

	public static int greedy(int[] dice) {

		int points = 0;

		for (int i : dice) {

			Long instances = counter(dice, i);
			
			switch (i) {
			case 1:
				points += (instances / 3) * 1000;
				points += (instances % 3) * 100;
				break;
			case 2:
				points += (instances / 3) * 200;
				break;
			case 3:
				points += (instances / 3) * 300;
				break;
			case 4:
				points += (instances / 3) * 400;
				break;
			case 5:
				points += (instances / 3) * 500;
				points += (instances % 3) * 50;

				break;
			case 6:
				points += (instances / 3) * 600;
				break;
			default:
				break;

			}
			
			dice = Arrays.stream(dice).boxed().filter(x -> x != i)
					.collect(Collectors.toList()).stream().mapToInt(v->v).toArray();
			
		
			
		}

		return points;
	}

	public static void main(String[] args) {
		 System.out.println(greedy(new int[]{1,1,1,3,1}));

	}

}
