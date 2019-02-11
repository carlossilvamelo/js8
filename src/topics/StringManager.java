package topics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.core.IsNull;

class Node {

	int data;
	Node next = null;

	Node(final int data) {
		this.data = data;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public static Node append(Node listA, Node listB) {
		
		if(listA == null || listA == null)
			return null;
		
		Node firstNode = listA;
		Node aux = listA;
		while(aux != null) {
			aux = aux.next;
		}
		aux = listB;
		return firstNode;
	}
}

public class StringManager {
	
	
	
	
	
	
	/**
	 * arrayStringIntoString
	 * @param words
	 * @return
	 */
	public static String arrayStringIntoString(String... words) {
		// TODO Write your code below this comment please
		
		return String.join(" ", words);
	}

	/**
	 * reverseString
	 * @param s
	 * @return
	 */
	public static String reverseString(String s) {

		return new StringBuilder(s).reverse().toString();
	}


	
	
	
	public static void main(String[] args) {
		
		Node n = new Node(1);
		n.append( new Node( 1 ), new Node( 2 ));
		System.out.println(n);
	}

}
