package swea_1976;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			
			int H = h1 + h2;
			int M = m1 + m2;
			
			if(H > 12) {
				H = H - 12;
			}
			if(M > 60) {
				M = M - 60;
				H = H + 1;
			}	
			System.out.println("#" + tc + " " + H + " " + M);
		}
	}
}
