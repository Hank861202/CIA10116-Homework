package hw5;

public class Homework5_2 {

//	請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	
	public static void randAvg() {
		int[] arr = new int[10];
		int sum = 0;
		System.out.println("本次亂數結果:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n平均值:" + sum / arr.length);
	}

	public static void main(String[] args) {
		randAvg();
	}
}
