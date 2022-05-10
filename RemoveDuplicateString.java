package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {
	public static void main(String[] args) {
	
		String text = "we learn java basics as part of java sessions in java week1";
		String[] array1 = text.split(" ");
		Set <String> set1 = new LinkedHashSet<String>();
		for (int i=0; i<array1.length;i++)
		{
			set1.add(array1[i]);
		}
		for (String S1: set1)
			System.out.print(S1+" ");
		
}
}