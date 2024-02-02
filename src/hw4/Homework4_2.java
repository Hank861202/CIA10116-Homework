package hw4;

public class Homework4_2 {
	public static void main(String[] args) {
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列)

//		String s = "Hello World";
//		char[] arr = new char[s.length()];
//		int j = 0;
//		for (int i = s.length() - 1; i >= 0; i--) {
//			arr[j] = s.charAt(i);
//			j++;
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}

		String s = "Hello World";
		String r = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			r += s.charAt(i);
		}
		System.out.println(r);
	}
}
