package backjoon;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		sum = N / 4;
		for(int i = 0 ; i < sum ; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}		
}