package topics;

import java.util.Arrays;
import java.util.List;

public class ArraysLists {

	public Object[] listToArray(List<Object> list) {
		Object[] obj = new Object[list.size()];
		return list.toArray(obj);
	}

	public List<Object> arrayToList(Object[] array) {

		return Arrays.asList(array);
	}

}
