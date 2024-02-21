package hw7;

import java.io.*;

public class Homework7_1 {

//	請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//	Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料

	public static void main(String[] args) throws IOException {
		int c;
		int count1 = 0;
		String str;
		int count2 = 0;
		int x;

		File myFile = new File("C:\\CIA101_Workspace\\CIA10116-Homework\\src\\hw7\\Sample.txt");
		FileReader fr = new FileReader(myFile);
		
		while ((c = fr.read()) != -1) {
			count1++;
		}

		fr.close();

		FileReader fr2 = new FileReader(myFile);
		BufferedReader br = new BufferedReader(fr2);

		while ((str = br.readLine()) != null) {
			count2++;
		}
		
		System.out.println("Sample.txt檔案共有" + myFile.length() + "個位元組," + count1 + "個字元," + count2 + "列資料");

		br.close();
		fr2.close();
	}
}
