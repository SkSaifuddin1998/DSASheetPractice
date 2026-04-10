package com.nt.dynamicprog;

import java.util.Arrays;

public class DP_01_ClimbingStairs {

	//1. Recursive Approach T(C)=0(N+M) AND S(C)=0(1)
	public static int climbStairs(int n) {

		if(n==1 || n==2 || n==3) return n;
		
		return climbStairs(n-1)+climbStairs(n-2);
		
	}
	
	//1. Dynamic Approach T(C)=0(N+M) AND S(C)=0(1)
	public static int dynamicApproach(int n) {

		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		int res=dynamicApproachBuild(n,dp);	
		return res;
	}
	
	

	private static int dynamicApproachBuild(int n, int[] dp) {
		if(n<=2) return n;
		if(dp[n]!=-1) return n;	
		dp[n]=dynamicApproachBuild(n-1,dp)+dynamicApproachBuild(n-2,dp);
		
		return dp[n];
		
	}

	public static void main(String[] args) {

		int climbStairs = dynamicApproach(4);
		
		System.out.println("How many ways climb the Stairs :"+climbStairs);
	}
}
