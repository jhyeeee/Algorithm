package boj_2884;

import java.util.Scanner;

//num1, num2�� �س��� �߸����Ÿ� ���ʿ� �ٸ��� ������ �س��� Ǯ�� �ٺ��ߤѤ�
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num2 < 45) {
			num1--;
			num2 = 60 - (45 - num2);
			
			if(num1 < 0) {
				num1 = 23;
			}
			System.out.println(num1 + " " + num2);
		}else {
			System.out.println(num1 + " " + (num2 - 45));
		}
	}
}
