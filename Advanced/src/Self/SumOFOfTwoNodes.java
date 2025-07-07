package Self;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SumOFOfTwoNodes {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		Set<String> s = new TreeSet<String>();
		
//		List<String> s1 = new ArrayList<String>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		

		for (int i = 0; i < list.size(); i++) {

			for (int j = i; j < list.size(); j++) {

				if (list.get(i) + list.get(j) == 6) {

					String n = list.get(i)+","+list.get(j);
					s.add(n);
//					s1.add(n);
				}

			}
		}
		
		System.out.println(s);
	}
	

//		System.out.println(s);

}
