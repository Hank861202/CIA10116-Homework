package hw8;

import java.util.*;

public class Homework8_2 {

//		請設計一個Train類別,並包含以下屬性:
//		- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//		- 目的地 dest,型別為String - 票價 price,型別為double
//		• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//		需使用的集合裡
//		- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		- (118, “自強”, “高雄”, “台北”, 500)
//		- (1288, “區間”, “新竹”, “基隆”, 400)
//		- (122, “自強”, “台中”, “花蓮”, 600)
//		- (1222, “區間”, “樹林”, 七堵, 300)
//		- (1254, “區間”, “屏東”, “基隆”, 700)
//		• 請寫一隻程式,能印出不重複的Train物件
//	
//		• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//	
//		• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
//	
//		• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)

	public static void main(String[] args) {

		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

//		• 請寫一隻程式,能印出不重複的Train物件
		Set<Train> set = new HashSet<Train>();

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);

		Iterator<Train> it = set.iterator();
		while (it.hasNext()) {
			Train t = (Train) it.next();
			t.display();
		}

		System.out.println("==================================");

		for (Iterator<Train> it4 = set.iterator(); it4.hasNext();) {
			Train t = (Train) it4.next();
			t.display();
		}

		System.out.println("==================================");

		for (Train t : set) {
			t.display();
		}

		System.out.println("==================================");

//		• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出		
		List<Train> list = new ArrayList<Train>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);

		Collections.sort(list);

		Iterator<Train> it2 = list.iterator();
		while (it2.hasNext()) {
			Train t = (Train) it2.next();
			t.display();
		}

		System.out.println("==================================");

		for (int i = 0; i < list.size(); i++) {
			Train t = (Train) list.get(i);
			t.display();
		}

		System.out.println("==================================");

		for (Train t : list) {
			t.display();
		}

		System.out.println("==================================");

//		• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
		Set<Train> setT = new TreeSet<Train>();

		setT.add(t1);
		setT.add(t2);
		setT.add(t3);
		setT.add(t4);
		setT.add(t5);
		setT.add(t6);
		setT.add(t7);

		Iterator<Train> it3 = setT.iterator();
		while (it3.hasNext()) {
			Train t = (Train) it3.next();
			t.display();
		}

		System.out.println("==================================");

		for (Iterator<Train> it4 = setT.iterator(); it4.hasNext();) {
			Train t = (Train) it4.next();
			t.display();
		}

		System.out.println("==================================");

		for (Train t : setT) {
			t.display();
		}

	}
}
