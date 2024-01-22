package hw1;

public class Homework1 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println(a + b);
		System.out.println(a * b);
		System.out.println("==================================================");
//		• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs = 200;
		System.out.println(eggs / 12 + "打" + eggs % 12 + "顆");
		System.out.println("==================================================");
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day, hr, min, sec;
		sec = 256559 % 60;
		min = 256559 / 60 % 60;
		hr = 256559 / 60 / 60 % 24;
		day = 256559 / 60 / 60 / 24;
		System.out.println(day + "天" + hr + "小時" + min + "分" + sec + "秒");
		System.out.println("==================================================");
//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		System.out.println("園面積=" + (r * r * PI));
		System.out.println("園周長=" + (r * 2 * PI));
		System.out.println("==================================================");
//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		int money = 1500000;
		double x = 0.02;
		double result = money * (1 + x);
		for (int i = 1; i <= 10; i++) {
			result *= (1 + x);
		}
		System.out.println((int) result + "元");
		System.out.println("==================================================");
//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println(5 + 5); // 這是int的運算結果10
		System.out.println(5 + '5'); // 因為Unicode編碼'5'是數值53，所以相加之後結果為58
		System.out.println(5 + "5"); // 因為"5"為String字串，數值與字串相加為字串相連，所以結果為55
	}
}
