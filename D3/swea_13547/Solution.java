package swea_13547;

import java.util.Scanner;

//���� �� �Ӹ���ٰ� Ʋ��
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			String str[] = sc.next().split("");
			String ans = "";
			int counto = 0;
			int countx = 0;
			for(int i = 0; i <str.length; i++) {
				if(str[i].equals("o")) {	
					counto++;
				}else {					
					countx++;
				}
			}
			if(countx > 7) {
				ans = "NO";
			}else{
				ans = "YES";
			}
			System.out.println("#" + tc + " " + ans);
		}
	}
}
