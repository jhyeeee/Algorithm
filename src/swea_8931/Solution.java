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
				//0���� �Էµɰ�� ���� ���� �����ߵǴϱ� pop, 0�� �ƴҰ�� �հ迡 ��������ϴ�
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
