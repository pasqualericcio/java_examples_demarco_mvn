package org.protor.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class Test01 {

	public static void main(String[] args) {
		
		int[] ia1 = new int[] {1, 2, 3, 555};
		int[] ia2 = new int[] {-1, -2, -3};
		int[] ia3 = ArrayUtils.addAll(ia1, ia2);
		
		System.out.println( Arrays.toString(ia3) );
		
		
		
		System.out.println("-----------------------");

		
		
		List<Double> list = new ArrayList<Double>();
		
		List l0 = new ArrayList();
		
		l0.add(Double.valueOf(-1.7));
		l0.add(Integer.valueOf("-4"));
		
		list.addAll(l0);
		list.addAll(l0);
		
		System.out.println(Arrays.toString(l0.toArray()));
		System.out.println(Arrays.toString(list.toArray()));
		
	}

}
