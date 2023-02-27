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
			//후위표기로 전환후 계산
			ArrayList<Object> postfix = new ArrayList<Object>();
			//연산자 담는 stack
			Stack<String> stack = new Stack<String>();
			
			//후위표기로 전환
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
			
			//후위표기법으로 연산해주기
			Stack<Integer> calcPostfix = new Stack<Integer>();
			for(int i = 0; i < postfix.size(); i++) {
				if(postfix.get(i) instanceof Integer) {
					//숫자일 경우 저장
					int num = (Integer)postfix.get(i);
					calcPostfix.push(num);
				}else {
					//연산자일 경우 숫자 두개꺼내서 계산
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



