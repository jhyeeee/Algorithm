package swea_1222;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int tc = 1; tc <= 10; tc++) {
			int len = sc.nextInt();
			String[] arr = sc.next().split("");
			//����ǥ��� ��ȯ�� ���
			ArrayList<Object> postfix = new ArrayList<Object>();
			//������ ��� stack
			Stack<String> stack = new Stack<String>();
			
			//����ǥ��� ��ȯ
			for(int i = 0; i < len; i++) {
				char x = arr[i].charAt(0);
				
				if(Character.isDigit(x)) {
					postfix.add(x-'0');
				}else {
					stack.push(arr[i]);
				}
			}
			while(!stack.isEmpty()) {
				postfix.add(stack.pop());
			}
			
			//����ǥ������� �������ֱ�
			Stack<Integer> calcPostfix = new Stack<Integer>();
			for(int i = 0; i < postfix.size(); i++) {
				if(postfix.get(i) instanceof Integer) {
					//������ ��� ����
					int num = (Integer)postfix.get(i);
					calcPostfix.push(num);
				}else {
					//�������� ��� ���� �ΰ������� ���
					int a = calcPostfix.pop();
                    int b = calcPostfix.pop();
                    calcPostfix.push(a+b);
				}
			}
			int answer = 0;
			answer = calcPostfix.pop();
			System.out.println("#" + tc + " " + answer);
		}
	}
}	



