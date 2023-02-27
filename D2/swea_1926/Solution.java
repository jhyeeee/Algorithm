package swea_1926;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			if(i < 10) {
				if(i%3 == 0) {
					System.out.print("-");
				}else {
					System.out.print(i + " ");
				}
			}else {
				String a =  Integer.toString(i);
				String[] num = a.split("");
				
				for(int j = 0; j < num.length; j++) {
					if(num[j].contains("3") || num[j].contains("6") || num[j].contains("9")) {
						System.out.print("-");
					}else {
						System.out.print(i + " ");
					}
				}
			}
			
		}
	}
}
