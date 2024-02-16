package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Homework7_4 {

//	請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//	意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
//	承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//	型簡化本題的程式設計)

	public static void main(String[] args) throws Exception {
		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdir();
		}

		File file = new File("C:\\data\\Object.ser");
		Animal[] animals = new Animal[4];
		animals[0] = new Dog("dog1");
		animals[1] = new Dog("dog2");
		animals[2] = new Cat("cat1");
		animals[3] = new Cat("cat2");

		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < animals.length; i++) {
			oos.writeObject(animals[i]);
		}

		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
				System.out.println("--------------------");
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}

		ois.close();
		fis.close();

	}
}
