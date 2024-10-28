package Module04_Bai3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GiaoHoiHieu {

	public static void main(String[] args) {
		Set<Integer> setA=new HashSet<Integer>();
		Set<Integer> setB=new HashSet<Integer>();
		setA.add(1);
		setA.add(3);
		setA.add(4);
		setA.add(9);
		setA.add(6);
		setB.add(1);
		setB.add(5);
		setB.add(8);
		setB.add(4);
		setB.add(2);
		//Hoi
		Set<Integer> Hoi = new TreeSet<Integer>(setA);
		Hoi.addAll(setB);
		//Giao
		Set<Integer> Giao=new TreeSet<Integer>(setA);
		Giao.retainAll(setB);
		//Hieu
		Set<Integer> Hieu=new TreeSet<Integer>(setA);
		Hieu.removeAll(setB);
		//xuat kq
		System.out.println("Tập A: "+setA);
		System.out.println("Tập B: "+setB);
		System.out.println("Tập A giao Tập B: "+Giao);
		System.out.println("Tập A hội Tập B: "+Hoi);
		System.out.println("Tập A hiệu Tập B: "+Hieu);

		
			

	}

}
