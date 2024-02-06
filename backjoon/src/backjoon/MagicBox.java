package backjoon;
import java.util.Scanner;

public class MagicBox {

	public static void main(String[] args) throws Exception {
		
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

        row = 0;
        col = size/2;
        int currentRow = row;
        int currentCol = col;
             
        while(count <= size * size){
            box[row][col] = count++;
            currentRow = row;
            currentCol = col;
            row--;
            col++;

            if(row < 0) row = size -1;
            if(col == size) col = 0;

            if(box[row][col] != 0){
                row = currentRow + 1 == size ? 0 :currentRow + 1;
                col = currentCol;
            }

        }
        for (int[] array: box) {
            for (int number: array) System.out.print(number + " ");
            System.out.println();
        }


    }
}
