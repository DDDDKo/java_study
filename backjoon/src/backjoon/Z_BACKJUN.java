package backjoon;

import java.util.Scanner;

public class Z_BACKJUN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(M > 45) {
			M = M-45;
			System.out.println(H+" "+M);
		}
		else if(M == 45) {
			M = 0;
			System.out.println(H+" "+M);
		}
		else {
			H--;
			M = (M + 60) - 45;
			if(H < 0) {
				H = 23;
			}
			System.out.println(H+" "+M);
		}
	}
}







