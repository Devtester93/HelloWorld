package Java_Examples.Basics;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = S.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j == 0 || j == 2 * i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				if (j == 0 || j == 2 * i - 2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		S.close();
	}
}