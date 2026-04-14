package com.nt.dynamicprog;

public class DP_06_SubSequenceProgram {

	public static boolean isSubsequence(String s, String t) {

		int i = 0, j = 0;
		int n = t.length();
		int m = s.length();
		char ss[] = s.toCharArray();
		char tt[] = t.toCharArray();

		if (m < 1)
			return true;

		while (i < n) {
			if (tt[i] == ss[j]) {
				j++;
			}
			i++;

			if (j == m)
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahbgdc";

		System.out.println("sUBSequence Check :" + isSubsequence(s, t));
	}
}
