package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		List<Integer> Compare = new ArrayList<Integer>();
		Compare.add(1);
		Compare.add(2);
		Compare.add(8);
		Compare.add(4);
		Compare.add(9);
		Compare.add(7);
/*		for (int i = 0; i < list.size(); i++) {

			for (int j = 0; j < Compare.size(); j++) {
				if (list.get(i) == Compare.get(j)) {
					System.out.println(list.get(i));
				}
			}
		}
*/
		list.retainAll(Compare);
		System.out.println(list);
	}
}