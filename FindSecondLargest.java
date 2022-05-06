package week3.day2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public void  sort(Integer[] array) {
		List<Integer> list = Arrays.asList(array);
	/*	// add the numbers using add
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);*/
		// sort in ascending
		Collections.sort(list);
		System.out.println(list);
	//	int size = list.size()-2;
		System.out.println("The second largest number is  "+ list.get(list.size()-2));

	/*	for (int i = 0; i < size; i++) {
			// print the 2nd last element
			if (i == size - 2) {
				System.out.println(list.get(i));

			}
		}*/

	
		
		
	}
	public static void main(String[] args) {
		Integer [] array= {3,2,11,4,6,7};
		FindSecondLargest large=new FindSecondLargest();
		large.sort(array);
		
	
	}
}