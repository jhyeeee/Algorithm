package swea_1222;

import java.util.ArrayList;
import java.util.*;

public class Solution2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc <= 10; tc++) {
			int len = sc.nextInt(); //������ ���� �Է�
			String arr[] = sc.next().split(""); //����� �Է� ����
			ArrayList<Object> postfix = new ArrayList<Object>(); //����ǥ������� ��ȯ �� ���� ��
			Stack<String> operator = new Stack<String>(); //�����ڸ� �����ص� ����
			for(int i = 0; i < len; i++) {
				char x = arr[i].charAt(0); //�ϳ��� �ɰ��� ��������
				if(Character.isDigit(x)) { // �����϶�
					postfix.add(x - '0'); // postfix�� �ְ�
				}else {
					operator.push(arr[i]); //�������� ��� ���ÿ� �ϴ�����
				}
			}
			while(! operator.isEmpty()) {
				postfix.add(operator.pop()); // ���ڸ� posfix�� ���� �� ������ ������ ����������� �����ڵ� �Űܴ��
			}
			
			Stack<Integer> calcPostfix = new Stack<Integer>(); //����ǥ������� ��ȯ�� �������� ����
			for(int i = 0; i < postfix.size(); i++) {
				if(postfix.get(i) instanceof Integer) { //postfix���� ������ �� ������ ���
					int num = (Integer)postfix.get(i); //calcpostfix�� �־��ְ�
					calcPostfix.push(num);
				}else { // postfix���� �����°� �������� ��� calcpostfix���� ���� �ΰ��� ������ ��� �� �ٽ� ����
					int a = calcPostfix.pop();
					int b = calcPostfix.pop();
					calcPostfix.push(b + a);
				}
			}
			int answer = 0;
			answer = calcPostfix.pop(); // answer�� ���������� ����� ����� ���� �����ش�
			System.out.println("#" + tc + " " + answer); //����!
		}
	}
}
