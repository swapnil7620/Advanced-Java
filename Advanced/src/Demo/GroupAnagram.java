package com.Demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args)
	{
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
		groupAnagrms(strs);
	}
	private static void groupAnagrms(String[] strs) {
		Map<String,List<String>> anagrams=new HashMap();
		
		for(String str:strs)		//str ate
		{                                                       //       key  value
			char chars[]=str.toCharArray(); // ['a' , 't', 'e']			 aet  [eat,tea,ate]
			Arrays.sort(chars);             // ['a' , 'e', 't']			 ant  [tan]
			
			String key=new String(chars);   //"aet"
			
			anagrams.putIfAbsent(key, new ArrayList());
			anagrams.get(key).add(str);//
			
		}
		System.out.println(anagrams.values());

	}
}
