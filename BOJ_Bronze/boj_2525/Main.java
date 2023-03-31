package boj_2525;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int time = sc.nextInt();
		
		int a = h * 60 + m + time;
		h = a / 60;
		m = a % 60;
		
		if(h >= 24) {
			h=h-24;
		}
		System.out.println(h + " " + m);
		
	}
}
