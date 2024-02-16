package hw5;

import java.util.Scanner;

public class Homework5_1 {
	
//	請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
	
	public static void starSquare(int width, int height) {
		String[][] arr = new String[height][width];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入寬與高:");
		int w = sc.nextInt();
		int h = sc.nextInt();
		starSquare(w, h);
	}
}
