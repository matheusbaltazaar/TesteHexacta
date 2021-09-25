package com.hexacta.test;

public class Solution3 {
	
	public double calcPM(int m, double p) { 
        double result = p;
		
        for (int i = 1; i < m; i++)
        	result = result * p;
		
		return result;
    }
	
	public static void main(String[] args) {
		Solution3 s = new Solution3();

		int m = 1000;
		double p = 0.999999999999;
		System.out.println("m = " + m + " | p = " + p);
		System.out.println("Solução: " + s.calcPM(m, p));
		
		System.out.println("--------------------------");
		
		m = 1000000;
		p = 0.999999999999;
		System.out.println("m = " + m + " | p = " + p);
		System.out.println("Solução: " + s.calcPM(m, p));
		
		System.out.println("--------------------------");
		
		m = 1000000000;
		p = 0.999999999999;
		System.out.println("m = " + m + " | p = " + p);
		System.out.println("Solução: " + s.calcPM(m, p));
		
		System.out.println("--------------------------");
		
		m = 3;
		p = 16;
		System.out.println("m = " + m + " | p = " + p);
		System.out.println("Solução: " + s.calcPM(m, p));
		
		System.out.println("--------------------------");
	}
	
}
