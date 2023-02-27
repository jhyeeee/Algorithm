package swea_1222;

import java.util.ArrayList;
import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			int len = sc.nextInt(); //연산의 길이 입력
			String arr[] = sc.next().split(""); //연산식 입력 저장
			ArrayList<Object> postfix = new ArrayList<Object>(); //후위표기법으로 전환 후 담을 곳
			Stack<String> operator = new Stack<String>(); //연산자만 저장해둘 스택
			for(int i = 0; i < len; i++) {
				char x = arr[i].charAt(0); //하나씩 쪼개서 보았을떼
				if(Character.isDigit(x)) { // 숫자일떼
					postfix.add(x - '0'); // postfix에 넣고
				}else {
					operator.push(arr[i]); //연산자일 경우 스택에 일단저장
				}
			}
			while(! operator.isEmpty()) {
				postfix.add(operator.pop()); // 숫자를 posfix에 넣은 후 연산자 스택이 비어질때까지 연산자도 옮겨담기
			}
			
			Stack<Integer> calcPostfix = new Stack<Integer>(); //후위표기법으로 전환후 연산해줄 스택
			for(int i = 0; i < postfix.size(); i++) {
				if(postfix.get(i) instanceof Integer) { //postfix에서 가져온 게 숫자일 경우
					int num = (Integer)postfix.get(i); //calcpostfix에 넣어주고
					calcPostfix.push(num);
				}else { // postfix에서 가져온게 연산자일 경우 calcpostfix에서 숫자 두개를 꺼내서 계산 후 다시 저장
					int a = calcPostfix.pop();
					int b = calcPostfix.pop();
					calcPostfix.push(b + a);
				}
			}
			int answer = 0;
			answer = calcPostfix.pop(); // answer에 마지막으로 계산후 저장된 수를 꺼내준다
			System.out.println("#" + tc + " " + answer); //정답!
		}
	}
}
