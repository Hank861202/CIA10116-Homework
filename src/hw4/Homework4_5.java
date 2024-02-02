package hw4;

import java.util.Scanner;

public class Homework4_5 {
	public static void main(String[] args) {

//		請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		Scanner sc = new Scanner(System.in);
		int y = 0, m = 0, d = 0;
		int the_day = 0;
		int m2d = 28;

		if (sc.hasNextInt()) {
			y = sc.nextInt();
			m = sc.nextInt();
			d = sc.nextInt();
		}

		if ((y % 4 == 0 && y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) {
			m2d = 29;
		}

		if (y <= 0 || m <= 0 || m > 12 || d <= 0) {
			System.out.print("錯誤輸入");
		} else if (m == 1 && d > 31) {
			System.out.print("錯誤輸入");
		} else if (m == 2 && d > m2d) {
			System.out.print("錯誤輸入");
		} else if (m == 3 && d > 31) {
			System.out.print("錯誤輸入");
		} else if (m == 4 && d > 30) {
			System.out.print("錯誤輸入");
		} else if (m == 5 && d > 31) {
			System.out.print("錯誤輸入");
		} else if (m == 6 && d > 30) {
			System.out.print("錯誤輸入");
		} else if (m == 7 && d > 31) {
			System.out.print("錯誤輸入");
		} else if (m == 8 && d > 31) {
			System.out.print("錯誤輸入");
		} else if (m == 9 && d > 30) {
			System.out.print("錯誤輸入");
		} else if (m == 10 && d > 31) {
			System.out.print("錯誤輸入");
		} else if (m == 11 && d > 30) {
			System.out.print("錯誤輸入");
		} else if (m == 12 && d > 31) {
			System.out.print("錯誤輸入");
		} else if (m == 1) {
			the_day = d;
			System.out.print("輸入的日期為該年第" + the_day + "天");
		} else if (m == 2) {
			the_day = 31 + d;
			System.out.print("輸入的日期為該年第" + the_day + "天");
		} else if (m >= 3 && m <= 12) {
			for (int i = 4; i <= m; i++) {
				switch (i) {
				case 4:
					the_day += 31;
					break;
				case 5:
					the_day += 30;
					break;
				case 6:
					the_day += 31;
					break;
				case 7:
					the_day += 30;
					break;
				case 8:
					the_day += 31;
					break;
				case 9:
					the_day += 31;
					break;
				case 10:
					the_day += 30;
					break;
				case 11:
					the_day += 31;
					break;
				case 12:
					the_day += 30;
					break;
				}
			}
			the_day = the_day + 31 + m2d + d;
			System.out.print("輸入的日期為該年第" + the_day + "天");
		}
	}
}
