package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		
	
	String text = "We learn java basics as part of java sessions in java week1";
	String[] split = text.split(" ");
    //using list 
       List<String> list = new ArrayList<String>(Arrays.asList(split));
   
 for(int i=0;i<list.size();i++) {
	 for(int j=i+1;j<list.size();j++) {
		 if(list.get(i).equals(list.get(j))) {
			
			list.remove(i);
		
			 
		 }
	 }
	

 }
 
 System.out.println(list);
 //using set
 Set<String>set=new HashSet<String>(Arrays.asList(split));
 System.out.println(set);
 

	}
}