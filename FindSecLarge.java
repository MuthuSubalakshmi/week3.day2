package week3.day2;

import java.util.Arrays;

public class FindSecLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		int size = data.length;
		Arrays.sort(data); 
		System.out.println("Sorted Arrays are: "+ Arrays.toString(data));
		int res = data[size-2];	
		System.out.println("Second Largest Number:"+res);
	}

}
