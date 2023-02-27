package swea_1936;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
			if(b == 2) {
				System.out.println("B");
			}else if(a == 2) {
				System.out.println("B");
			}else System.out.println("A");
		}else if(a > b) {
			if(a == 2) {
				System.out.println("A");
			}else if(b == 2) {
				System.out.println("A");
			}else System.out.println("B");
		}
	}
}
