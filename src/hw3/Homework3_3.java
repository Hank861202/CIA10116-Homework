package hw3;

import java.util.Scanner;

public class Homework3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文請輸入討厭的數字(1~9)");
		int x = sc.nextInt();
		int count = 0;
		int[] arr = new int[6];
		
		for (int i = 1; i <= 49; i++) {
			if (i % 10 == x || i / 10 == x) {
				continue;
			}
			System.out.print(i + " ");
			count++;
		}

		System.out.println("總共有" + count + "個");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 49) + 1;
			if (arr[i] % 10 == x || arr[i] / 10 == x) {
				i--;
			}
		}
		System.out.println("印出不要號碼外的隨機6個號碼:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
