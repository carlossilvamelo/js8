package studies;

import java.util.regex.Pattern;

import javax.script.ScriptException;

public class MergedStringChecker {

	public static boolean checkMatch(String word, String label) {
		String match = "";
		for (int i = 0; i < word.length(); i++) {
			for (int k = 0; k < label.length(); k++) {
				if (word.charAt(i) == label.charAt(k)) {
					match += word.charAt(i);
					label = label.substring(k + 1);
					break;
				}
			}
			if (word.length() == match.length())
				break;

		}
		System.out.println(match.length());
		return word.equals(match);
	}

	public static boolean isMerge(String s, String part1, String part2) {
		if(s.length() != part1.length() + part2.length())
			return false;
		
		if(part1.equals(part2))
			return false;
		if(s.isEmpty())
			return false;
		
		return checkMatch(part1, s) & checkMatch(part2, s);
	}

	public static void main(String[] args) throws ScriptException {

		// System.out.println(s.chars().filter(x ->
		// label.contains(s)).boxed().collect(Collectors.toList()));
//		System.out.println(checkMatch("codewars", "cod"));
//		System.out.println(checkMatch("codewars", "wars"));
		//System.out.println(isMerge("codewars", "cod", "wars"));
		
		System.out.println("as".isEmpty() | "asd".isEmpty()|"asd".isEmpty());
	}

}
