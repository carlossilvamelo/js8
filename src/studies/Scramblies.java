package studies;

public class Scramblies {

	public static boolean scramble(String str1, String str2) {
		String aux = str1;
		int length = str2.length();
		int counter = 0;
		while (counter < length) {
			
			if (!aux.contains(str2.charAt(counter) + "")) {
				return false;
			}
			aux = aux.replaceFirst(str2.charAt(counter)+"", "");
			counter++;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(scramble("aabbcamaomsccdd", "commas"));

	}
}
