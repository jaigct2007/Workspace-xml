package com.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i={0,10,5,2,99};
		System.out.println(i.length);
		Arrays.sort(i);
		for (int j : i) {
			System.out.print(j+",");
		}
	}

}
