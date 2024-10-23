package Module4_Bai01;

import java.util.Random;
import java.util.Vector;

public class QuanLyNhanVien {

	public static void main(String[] args) {
		Vector<String> ds=new Vector<String>();
		ds.add("Minh Dat");
		ds.add("Trung Kien");
		ds.add("Hoang Son");
		Random rd=new Random();
		int Ten=rd.nextInt(ds.size());
		System.out.println(ds.get(Ten));
	}

}
