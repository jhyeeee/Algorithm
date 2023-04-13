package boj_2839;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N / 5;
		int ans = 0;
		while(N % 5 != 0) {
			N-=3;
			if(N < 0) {
				ans = -1;
				break;
			}else {
				ans++;
			}
		}
		if(N>0) {
			ans += N/5;
		}
		System.out.println(ans);
	}
	
}
