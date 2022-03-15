package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split = text.split(" ");

		
		LinkedHashSet<String> removeDup = new LinkedHashSet<String>(Arrays.asList(split));
		
		for(String noDup : removeDup) {
			System.out.println(noDup);
		}

	
	}

}
