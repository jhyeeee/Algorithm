package swea_2029;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int answer = 0;
		int last = 0;
		for(int tc = 1; tc <= T; tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			answer = a/b;
			last = a%b;
			System.out.print("#" + tc + " ");
			System.out.printf("%d %d", answer , last);
			System.out.println();
		}
	}
}
