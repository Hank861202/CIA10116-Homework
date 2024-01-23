package hw2;

public class Homework2 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum1 = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum1 += i;
		}
		System.out.println(sum1);
		System.out.println("=================================================");
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum2 = 1;
		for (int i = 2; i <= 10; i++) {
			sum2 *= i;
		}
		System.out.println(sum2);
		System.out.println("=================================================");
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int sum3 = 1;
		int x = 2;
		while (x <= 10) {
			sum3 *= x;
			x++;
		}
		System.out.println(sum3);
		System.out.println("=================================================");
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		for (int i = 1; i <= 10; i++) {
			System.out.print(i * i + " ");
		}
		System.out.println();
		System.out.println("=================================================");
//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (i / 10 == 4 || i % 10 == 4) {
				continue;
			}
			System.out.print(i + " ");
			count++;
		}
		System.out.println("總共有" + count + "個");
		System.out.println("=================================================");
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		for (int i = 10; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("=================================================");
//		• 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		String abc = "";
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				switch (i) {
				case 1:
					abc = "A";
					break;
				case 2:
					abc = "B";
					break;
				case 3:
					abc = "C";
					break;
				case 4:
					abc = "D";
					break;
				case 5:
					abc = "E";
					break;
				case 6:
					abc = "F";
					break;
				}
				System.out.print(abc);
			}
			System.out.println();
		}

	}
}
