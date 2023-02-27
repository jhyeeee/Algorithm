package swea_8931;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int K = sc.nextInt();
			int sum = 0;
			Stack<Integer> stack = new Stack<>();
			
			for(int i = 0; i < K; i++) {
				int money = sc.nextInt();
				//0으로 입력될경우 이전 값을 지워야되니까 pop, 0이 아닐경우 합계에 더해줘야하니
				if(money == 0) {
					sum -= stack.pop();
				}else {
					stack.add(money);
					sum += money;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}

	}

}
