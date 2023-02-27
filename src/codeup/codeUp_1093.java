package codeup;

import java.util.Scanner;

public class codeUp_1093 {//제출할떄는 Main으로!

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[24];
		
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			arr[num-1] += 1;
		}
		for(int i=0;i<23;i++) {
			System.out.print(arr[i]+" ");
		}	
	}
}
