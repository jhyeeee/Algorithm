package swea_2056;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {0, 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31};
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			String str = sc.next();
			int year = Integer.parseInt(str.substring(0,4));
			int month = Integer.parseInt(str.substring(4,6));
			int date = Integer.parseInt(str.substring(6));
			if(month < 13 && month > 0 && date <= arr[month]) {
				System.out.print("#" + tc + " ");
				System.out.printf("%04d/%02d/%02d", year,month,date);
			}else{
				System.out.print("#" + tc + " " + "-1");
			}
			System.out.println();
		}
	}
}
