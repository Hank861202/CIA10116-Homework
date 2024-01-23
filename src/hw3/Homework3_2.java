package hw3;

import java.util.Scanner;

public class Homework3_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜0~100的數字吧!");
		int ans = (int) (Math.random() * 100) + 1;
		while (true) {
			int i = sc.nextInt();
			if (i == ans) {
				System.out.println("答對了!答案就是" + i);
				break;
			}else if(i < ans){
				System.out.println("猜錯囉,小於正確答案");
			}else {
				System.out.println("猜錯囉,大於正確答案");
			}
		}
	}
}
