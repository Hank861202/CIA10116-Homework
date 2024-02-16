package hw7;

import java.io.*;

public class Homework7_3 {

//	請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案

	public static void copyFile(String a, String b) throws IOException {
		File inputFile = new File(a);
		File outputFile = new File(b);

		FileReader in = new FileReader(inputFile);
		FileWriter out = new FileWriter(outputFile);
		int c;
		while ((c = in.read()) != -1) {
			out.write(c);
			System.out.flush();
		}

		in.close();
		out.close();

	}

	public static void main(String[] args) throws IOException {
		copyFile("C:\\CIA101_Workspace\\CIA10116-Homework\\src\\hw7\\aaa.txt",
				"C:\\CIA101_Workspace\\CIA10116-Homework\\src\\hw7\\bbb.txt");
	}
}
