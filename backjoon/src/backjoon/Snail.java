package backjoon;

import java.util.Scanner;

public class Snail {

	public static void main(String[] args) {
		int col, row, size, count = 1;  // col: x, row: y
        
        Scanner scanner = new Scanner(System.in);
		size = scanner.nextInt();
		scanner.close();

        int[][] box = new int[size][size];	// 2차원 배열 생성
		for(int i = 0; i < box.length ; i++) {	//2차원 배열 초기화
			for(int j = 0 ; j < box.length ; j++) {
				box[i][j] = 0;
			}
		}
		
		col = (size - 1) / 2;	// 출발점
		row = (size - 1) / 2;
		
		int direction = 0;   // 0: 아래, 1: 오른쪽,  2: 위, 3: 왼쪽
		int move = 1;	// 움직일 거리
		int movecount = 0;	// 움직인 거리
		
		while( count <= size * size) {
			box[row][col] = count++;
			movecount++;
			
			if(direction==0) row++;
			if(direction==1) col++;
			if(direction==2) row--;
			if(direction==3) col--;
			
			if(move == movecount) {
				movecount = 0;
				direction = direction == 3 ? 0 : ++direction ;
				if(direction ==  2 || direction == 0) move++;
			}
		}
		
		for (int[] array: box) {
            for (int number: array) System.out.print(number + " ");
            System.out.println();
        }
	}
}
