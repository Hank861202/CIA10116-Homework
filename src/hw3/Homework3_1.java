package hw3;

import java.util.Scanner;

public class Homework3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int x1 = x * x;
		int y1 = y * y;
		int z1 = z * z;

		if (x <= 0 || y <= 0 || z <= 0) {
			System.out.println("不是三角形");
		} else if (x == y && x == z) {
			System.out.println("正三角形");
		} else if (x == y || x == z || y == z) {
			System.out.println("等腰三角形");
		} else if (x1 + y1 == z1 || x1 + z1 == y1 || y1 + z1 == x1) {
			System.out.println("直角三角形");
		}else {
			System.out.println("其他三角形");
		}

	}
}
