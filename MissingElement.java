
package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MissingElement {
public static void main(String[] args) {
	/*List<Integer> list = new ArrayList<Integer>();
	// add the numbers using add
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(7);
	list.add(6);
	list.add(8);
	Collections.sort(list);
	System.out.println(list);
	for(int i=0;i<list.size();i++) {
		if(i==list.get(i)) {
			System.out.println("");
		}
		else {
			System.out.println(list.get(i));
		}
		
	}*/
	//using set
	Set<Integer>set=new HashSet<Integer>();
	set.add(1);
	set.add(19);
	set.add(2);
	set.add(7);
	set.add(6);
	set.add(4);
	System.out.println(set);
	
	List<Integer>list1=new ArrayList<Integer>();
	list1.addAll(set);
	Collections.sort(list1);
	System.out.println(list1);
	for(int i=0;i<list1.size();i++) {
		if(i==list1.get(i)) {
			System.out.println("");
		}
		else {
			System.out.println(list1.get(i));
			
		}
		
	}
	
	/* 
	 */

}
}