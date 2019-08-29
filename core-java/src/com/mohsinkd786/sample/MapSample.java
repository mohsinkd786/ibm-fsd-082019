package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {

	public void run() {
		print("MAP :::");
		createMap();
		hashcodeAndEquals();
	}

	public void createMap() {
		print("create Map :");
		Map<String, String> map = new HashMap<String, String>();

		map.put("one", "One");
		map.put("two", "Two");
		map.put("three", "Three");

		Set<Map.Entry<String, String>> entries = map.entrySet();

		for (Map.Entry<String, String> obj : entries) {
			print("Key : " + obj.getKey() + " , Value : " + obj.getValue());
		}

		print("For Each : ");
		// forEach
		map.forEach((key, val) -> print("Key : " + key + " , Value : " + val));

		// get a value by key
		String val = map.get("three");
		print("VALUE :: " + val);

		// update existing key
		String oldValue = map.put("four", "Four");
		val = map.get("four");

		print("NEW VALUE :: " + val + " OLD VALUE :: " + oldValue);

	}

	public void hashcodeAndEquals() {
		HashKey hashOne = new HashKey(10, "firstKey");
		HashMap<HashKey, String> hmap = new HashMap<HashKey, String>();

		hmap.put(hashOne, "Hello");

		String val = hmap.get(new HashKey(10, "firstKey"));

		print("VALUE FOUND : " + val);
	}
}
