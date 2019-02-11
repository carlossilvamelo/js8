package studies;

public class AbbreviateTwoWordName {

	
	public static String abbrevName(String name) {
		name = name.toUpperCase();
		String[] names = name.split(" ");
		String abv = "";
		for(String n : names) {
			abv += n.charAt(0)+".";
			
		}
		
	    return abv.substring(0, abv.length()-1);
	  }
	
	public static void main(String[] args) {
		System.out.println(abbrevName("Sam Harris"));
	}
}
