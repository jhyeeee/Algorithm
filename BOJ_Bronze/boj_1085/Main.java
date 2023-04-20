package boj_1085;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int xMin = (w-x) < x ? (w-x):x;
		int yMin = (h-y) < y ? (h-y):y;
		
		if(xMin > yMin) {
			System.out.println(yMin);
		}else {
			System.out.println(xMin);
		}
		
	}
}
