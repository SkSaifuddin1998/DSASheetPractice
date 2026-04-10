package com.nt.dynamicprog;

public class DP_03_FibonacciNumbers {
	
	public static int fib(int n) {

		int prev1=0;
		int prev2=1;
		for(int i=2;i<=n;i++) {
			int curr=prev1+prev2;
			prev1=prev2;
			prev2=curr;
		}
		return prev2;
	}

	public static void main(String[] args) {
		int fib = fib(4);
		
 System.out.println("Current fibonacc number is :"+fib);
	}

}
