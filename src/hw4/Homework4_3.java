package hw4;

public class Homework4_3 {
	public static void main(String[] args) {
//		 有個字串陣列如下 (八大行星)：
//		 {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		 (提示：字元比對，String方法)	

		String[] arr = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		char[] arr2 = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				for (int x = 0; x < arr2.length; x++) {
					if (arr[i].charAt(j) == arr2[x]) {
						count++;
						break;
					}
				}
			}
		}

		System.out.print(count);
	}
}
