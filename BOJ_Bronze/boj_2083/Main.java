package boj_2083;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		while(true) {
			String name = sc.next();
			int age = sc.nextInt();
			int weight = sc.nextInt();
			
			if(name.equals("#") && age == 0 && weight == 0){
				break;
			}
			
			if(age > 17 || weight >= 80) {
				answer = "Senior";
				System.out.println(name + " " + answer);
			}else {
				answer = "Junior";
				System.out.println(name + " " + answer);
			}
			
		}	
	}
}
