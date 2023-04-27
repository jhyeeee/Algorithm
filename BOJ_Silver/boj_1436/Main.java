package boj_1436;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		while(true) {
			if(n == 0) {
				System.out.println("666");
				break;
			}
			ans = (n-1) * 1000 + 666;
			System.out.println(ans);
			break;
		}
		
	}
}
