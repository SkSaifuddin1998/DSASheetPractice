package com.nt.dynamicprog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DP_04_PascalTriangle {

	// 1. Approach Recursion
	public static List<List<Integer>> generate(int numRows) {

		// BASE CASE CONDITION
		if (numRows == 0) {
			List<List<Integer>> list = new ArrayList<List<Integer>>();

			return list;
		}
		if (numRows == 1) {
			List<List<Integer>> list = new ArrayList<List<Integer>>();
			list.add(List.of(1));
			return list;
		}

		List<List<Integer>> prevRows = generate(numRows - 1);
		List<Integer> newRow = new ArrayList<Integer>();

		for (int i = 0; i < numRows; i++) {
			newRow.add(1);
		}

		for (int i = 1; i < numRows - 1; i++) {
			newRow.set(i, prevRows.get(numRows - 2).get(i) + prevRows.get(numRows - 2).get(i - 1));
		}

		prevRows.add(newRow);

		return prevRows;
	}

	// 2.cOMBINATION aPPROACH
	public static List<List<Integer>> combinationApproach(int numRows) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		if (numRows == 0) {

			return list;
		}
		List<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1);
		list.add(firstRow);
		for (int i = 1; i < numRows; i++) {

			List<Integer> prevRows = list.get(i - 1);
			List<Integer> currentRows = new ArrayList<Integer>();
			currentRows.add(1);
			for (int j = 1; j < i; j++) {
				currentRows.add(prevRows.get(j - 1) + prevRows.get(j));
			}
			currentRows.add(1);
			list.add(currentRows);
		}
		return list;
	}

	// 3.Dynamic Approach
	public static List<List<Integer>> dynamicApproach(int numRows) {

		List<List<Integer>> result = new ArrayList<>();
		if (numRows == 0) {
			return result;
		}

		if (numRows == 1) {
			List<Integer> firstRow = new ArrayList<>();
			firstRow.add(1);
			result.add(firstRow);
			return result;
		}

		result = generate(numRows - 1);
		List<Integer> prevRow = result.get(numRows - 2);
		List<Integer> currentRow = new ArrayList<>();
		currentRow.add(1);

		for (int i = 1; i < numRows - 1; i++) {
			currentRow.add(prevRow.get(i - 1) + prevRow.get(i));
		}

		currentRow.add(1);
		result.add(currentRow);

		return result;
	}
	
	public static List<Integer> getRow(int k) {

		 Integer[] arr = new Integer[k + 1];
	        Arrays.fill(arr, 0);
	        arr[0] = 1;
	        
	        for (int i = 1; i <= k; i++) 
	            for (int j = i; j > 0; j--) 
	                arr[j] = arr[j] + arr[j - 1];
	        
	        return Arrays.asList(arr);
	}

	public static void main(String[] args) {

		List<List<Integer>> list = dynamicApproach(5);
		
		List<Integer> row = getRow(5);


		System.out.println("Pascals Triange code is :" + list);
		System.out.println("Pascals Triange code is :" + row);
	}

}
