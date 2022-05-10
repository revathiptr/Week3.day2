package week3.day2;

import java.util.ArrayList;

public class charOccurence {
	public static void main(String[] args) {
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(1);
		list.add(6);
		for (int i=0; i<list.size();i++)
		{
			if(list.get(i)==1)
				count+=1;
		}
		System.out.println(count);
	}
}