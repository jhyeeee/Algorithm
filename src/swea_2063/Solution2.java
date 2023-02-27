package swea_2063;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		int mid = N/2;
		
		for(int i=0;i<N;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println(num[mid]);

	}

}
