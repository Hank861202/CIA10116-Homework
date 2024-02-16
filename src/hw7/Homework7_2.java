package hw7;

import java.io.*;

public class Homework7_2 {

//	請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//	append功能讓每次執行結果都能被保存起來)

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\CIA101_Workspace\\CIA10116-Homework\\src\\hw7\\Data.txt",
				true);

		BufferedOutputStream bos = new BufferedOutputStream(fos);

		PrintStream ps = new PrintStream(bos);

		for (int i = 1; i <= 10; i++) {
			int r = (int) (Math.random() * 1000) + 1;
			ps.println(r);
		}

		ps.close();
		bos.close();
		fos.close();

	}
}
