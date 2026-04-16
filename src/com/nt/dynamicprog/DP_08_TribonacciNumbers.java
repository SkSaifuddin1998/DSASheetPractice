package com.nt.dynamicprog;

public class DP_08_TribonacciNumbers {
	
	public static int tribonacci(int n) {
       int ft=0;
       int st=1;
       int tt=1;
       
       for(int i=1;i<=n;i++) {
    	   int srt=ft+st+tt;
    	   ft=st;
    	   st=tt;
    	   tt=srt;
       }
       return ft;
   }

	public static void main(String[] args) {
		System.out.println("TRIBONACCI NUMBER IS :"+tribonacci(25));

	}

}
