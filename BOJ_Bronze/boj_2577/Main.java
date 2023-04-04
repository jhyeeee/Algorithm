package boj_2577;

// 답확인하겠다고 print로 해두고 안바꿔서 틀리는 나란 바보 멍총이
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a*b*c;
		String ans[] = Integer.toString(sum).split("");
		for(int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j < ans.length; j++) {
				if(Integer.toString(i).equals(ans[j])) {
					count++;
				}
				
			}
			System.out.println(count);
		}
	}
}
