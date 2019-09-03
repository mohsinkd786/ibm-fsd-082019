package com.mohsinkd786.sample;

import static com.mohsinkd786.sample.StaticSop.print;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MapSample {

	public void run() {
		print("MAP :::");
		createMap();
		hashcodeAndEquals();
		listToMap();
		concurrentMap();
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
		print("Hashcode & Equals :");
		HashKey hashOne = new HashKey(10, "firstKey");
		HashMap<HashKey, String> hmap = new HashMap<HashKey, String>();

		hmap.put(hashOne, "Hello");

		String val = hmap.get(new HashKey(10, "firstKey"));

		print("VALUE FOUND : " + val);
	}

	public void listToMap() {
		print("Create Map from List :");
		// list of users
		List<User> usrs = Arrays.asList(new User[] { new User(101, "Tim"), new User(8, "Sulk"), new User(6, "Pentair"),
				new User(102, "Bumpy"), new User(110, "Humpty"), });

		Map<String, User> uMap = usrs.stream().collect(Collectors.toMap(uKey -> {
			return uKey.getName();
		}, uValue -> {
			return uValue;
		}));

		uMap.forEach((k, v) -> print("Key " + k + "--- Value " + v));
	}

	public void concurrentMap() {
		print("Concurrent HashMap : ");
		float loadFactor = Float.valueOf("0.80");
		int capacityAndSegs = 16; // no of allowed segments

		Map<String, String> conMap = new ConcurrentHashMap<String, String>(capacityAndSegs, loadFactor,
				capacityAndSegs);

		conMap.put("one", "Hello");
		conMap.put("two", "Hey");
		conMap.put("three", "Hi");

		for (Map.Entry<String, String> entry : conMap.entrySet()) {
			print(entry.getKey() + "--" + entry.getValue());
		}
	}
}
