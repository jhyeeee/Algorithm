package swea_2063;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];
		int mid = N/2;
		for(int i=0;i<N;i++) {
			num[i] = sc.nextInt();
		}
		//Arrays.sort(num);
		
		//버블정렬
//		for(int i=N-1;i>0;i--){
//			for(int j=0;j<=1;j++) {
//				if(num[j]>num[j+1]) {
//					int temp = num[j+1];
//					num[j] = num[j+1];
//					num[j+1] = temp;
//				}
//			}
//		}
		
		//선택정렬
		for(int i=0;i<N-1;i++) {
			int minIdx = i;
			for(int j=i+1;j<N;j++) {
				if(num[minIdx] > num[j]) {
					minIdx = j;
				}
			}
			if(num[i] > num[minIdx]) {
			int temp = num[minIdx];
			num[minIdx] = num[i];
			num[i] = temp;
			}
		}
		System.out.println(Arrays.toString(num));
		System.out.println(num[mid]);
	}

}
