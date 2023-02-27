package swea_1970;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int money = sc.nextInt();
			int n1 = 0;
			int n2 = 0;
			int n3 = 0;
			int n4 = 0;
			int n5 = 0;
			int n6 = 0;
			int n7 = 0;
			int n8 = 0;
			
			n1 = money / 50000;
			money -= n1 * 50000;
			
			n2 = money / 10000;
			money -= n2 * 10000;
			
			n3 = money / 5000;
			money -= n3 * 5000;
			
			n4 = money / 1000;
			money -= n4 * 1000;
			
			n5 = money / 500;
			money -= n5 * 500;
			
			n6 = money / 100;
			money -= n6 * 100;
			
			n7 = money / 50;
			money -= n7 * 50;
			
			n8 = money / 10;
			money -= n8 * 10;
			
			System.out.print("#" + tc + " ");
			System.out.printf("%d %d %d %d %d %d %d %d", n1,n2,n3,n4,n5,n6,n7,n8);
		}
	}
}
