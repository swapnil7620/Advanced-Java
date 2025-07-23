package com.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagram {
public static void main(String[] args) {
	List<String> words = new ArrayList<>(Arrays.asList("listen", "silent", "note", "tone", "onet", "apple"));
    groupAnagrams(words);
	
}

private static void groupAnagrams(List<String> words) {
    Map<String, List<String>> anagrams = new HashMap<>();

    for (String word : words) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String key = new String(chars);  

        anagrams.putIfAbsent(key, new ArrayList<>());
        anagrams.get(key).add(word);
    }

   
    for (List<String> group : anagrams.values()) {
        System.out.println(group);
    }
}
}

   

