
package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		Integer[] array = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));

		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {

					System.out.println(list.get(i));
					break;

				}

			}
		}

	

	}

}