package com.jse.app;

import java.util.Scanner;

public class Study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		for (i = 1; i <= 3; i++) {
			System.out.println("i:"+i);
			for(j=1; j<=i; j++) {
				System.out.println("j :"+j);
			}

		}
	}
}