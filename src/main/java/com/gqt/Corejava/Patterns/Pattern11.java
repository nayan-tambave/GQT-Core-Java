package com.gqt.Corejava.Patterns;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size: ");
		int n = sc.nextInt();
		int a=1;
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				
				System.out.print(a+"	");
				a++;
			}
			
			System.out.println();
			
		}

	}

}
