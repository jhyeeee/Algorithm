package boj_17496;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int g = sc.nextInt();
		int c = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(((d - 1)/g) * c * p);
	}
}
