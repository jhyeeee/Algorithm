package swea_1204;

import java.util.*;

public class Solution { //최빈값 구하는 방법 공부필요 - count

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1;tc<=T;tc++) {
			int testNum = sc.nextInt();//몇번째 test인지 입력
			int max = 0;
			int result = 0;
			int[] count = new int[101]; // 0~100점까지 입력 가능
			
			for(int i=0;i<1000;i++) {
				int score = sc.nextInt(); //점수입력
				count[score]++;		
			}
			for(int i=0;i<101;i++) { //최빈값구하기
				if(max <= count[i]) {
					max = count[i];
					result = i;
				}
			}
			System.out.print("#"+testNum+" "+result);
			System.out.println();
		}

	}

}
