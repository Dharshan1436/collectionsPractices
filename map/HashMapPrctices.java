package collections.map;

import java.util.HashMap;

public class HashMapPrctices {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.clear();
		System.out.println(map.isEmpty());
		map.put("FirstName", "Dharshan");
		map.put("LastName", "PL");
		map.put(null, null);
		map.put(null, null);
		map.put("Age", "22");
		map.put("PhoneNumber", "984448769");
		map.put("Location", "Bangolare");
		System.out.println(map);
//		map.clear();
		System.out.println(map.get("FirstName"));
		System.out.println(map.remove("Age"));
		System.out.println(map.isEmpty());
		map.replace("Location", "Karnataka");
		System.out.println(map.size());
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		System.out.println(map);

	}

}
