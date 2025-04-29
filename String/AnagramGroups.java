package com.Suraj.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroups {

	public static List<String> findAnagrams(String[] words) {

		Map<String, List<String>> map = new HashMap<>();

		for (String word : words) {

			char[] Chars = word.toCharArray();
			Arrays.sort(Chars);
			String sorted = new String(Chars);

			if (!map.containsKey(sorted)) {
				map.put(sorted, new ArrayList<>());
			}
			map.get(sorted).add(word);
		}
		return map.values().iterator().next();
	}
	public static void main(String[] args) {
		String[] input = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<String> result = findAnagrams(input);
		System.out.println(result); // Output: [eat, tea, ate]
	}
}
