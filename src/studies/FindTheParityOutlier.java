package studies;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheParityOutlier {

	static int find(int[] integers) {

		List<Integer> list = Arrays.stream(integers).boxed().collect(Collectors.toList());
		List<Integer> test = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		return test.size() == 1 ? test.get(0):
			list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()).get(0);

	}

	public static void main(String[] args) {
		int[] exampleTest1 = { 2, 6, 8, -10, 3 };
		int[] exampleTest2 = { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781 };
		System.out.println(find(exampleTest1));
	}

}
