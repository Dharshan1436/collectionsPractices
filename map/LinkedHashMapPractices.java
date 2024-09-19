package collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapPractices {

	public static void main(String[] args) {
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

		map.put("FirstName", "Dharshan");
		map.put("LastName", "PL");
		map.put("Age", "22");
		map.put(null, null);
		map.put(null, null);
		map.put("PhoneNumber", "984448769");
		map.put("PhoneNumber", "7760719313");
		map.put("Location", "Bangolare");
		System.out.println(map);

	}

}
