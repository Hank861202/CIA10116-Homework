package hw5;

public class Homework5_4 {

//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//	genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//	與數字的亂數組合,如圖: 

	public static void genAuthCode() {

		System.out.println("本次隨機產生驗證碼為:");
		for (int i = 0; i < 8; i++) {
			int r = (int) (Math.random() * 75) + 48;
			if ((r > 57 && r < 65) || (r > 90 && r < 97)) {
				i--;
				continue;
			} else
				System.out.print((char) r);
		}

	}

	public static void main(String[] args) {
		genAuthCode();
	}
}
