package hw4;

import java.util.Scanner;

public class Homework4_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;
		int[][] arr = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		for (int i = 0; i < arr[1].length; i++) {
			if (arr[1][i] >= x) {
				System.out.print(arr[0][i] + " ");
				count++;
			}
		}
		System.out.print("共" + count + "人");
	}
}
