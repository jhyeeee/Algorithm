package boj_1152;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			count++;
			if(str[i].equals("")) {
				count--;
			}
		}
		System.out.println(count);
	}
}
