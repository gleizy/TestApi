package TestApi;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionUtils {
	public static void main(String[] args) {
		
		// List is a ...
		int[] intArray = {1, 2, 3, 4, 5};
		intArray[4] = 10;
		//intArray[5] = 20;
		
		List<String> list = new ArrayList<>();
		System.out.println("list's size is " + list.size());
		list.add("I");
		list.add("You");
		System.out.println("list's size is " + list.size());
		System.out.println("The first element in list is " + list.get(0));
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println("");
		
		list.add(1, "Love");
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println("");
		
		list.remove(2);
		for (String str : list) {
			System.out.print(str + " ");
		}
		System.out.println("");
		
		System.out.println("befor clear, list's size is " + list.size());
		list.clear();
		System.out.println("after clare, list's size is " + list.size());
		
		
		Map<String, Object> map = new HashMap<>();
		//Key, Value
		map.put("name", "高雷");
		map.put("age", 30);
		map.put("birthday", new Date());		
		System.out.println("My name is " + map.get("name"));
		
		map.put("name", "Gao Lei");
		System.out.println("My name is " + map.get("name"));
		
		map.remove("birthday");
		
		if (map.get("address") == null) {
			System.out.println("address does not exist in map.");
		}
		
	}
}
