package com.nt.dynamicprog;

import java.util.Arrays;

public class DP_02_MinimumCostClimbingStairs {

	public static int minCostClimbingStairs(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		Arrays.fill(dp, -1);
		return Math.min(func(nums, 0, dp), func(nums, 1, dp));
	}

	public static int func(int[] a, int i, int[] dp) {
		if (i >= a.length) {
			return 0;

		}
		if (dp[i] != -1) {
			return dp[i];
		}
		int m1 = func(a, i + 1, dp) + a[i];
		int m2 = func(a, i + 2, dp) + a[i];
		return dp[i] = Math.min(m1, m2);
	}

	public static void main(String[] args) {

		int cost[] = { 10, 15, 20 };
		int minCostClimbingStairs = minCostClimbingStairs(cost);

		System.out.println("Minimum Cost climbing stairs is :" + minCostClimbingStairs);
	}
}
