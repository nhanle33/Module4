package Module4_Bai01;

import java.util.Map;
import java.util.TreeMap;

public class CungCapTenSPTheoNV {

	public static void main(String[] args) {
		TreeMap<String, Integer> t=new TreeMap<String, Integer>();
		AddName(t, "Le Minh Dat");
		AddName(t, "Le Minh Dat");
		AddName(t, "Le Minh Dat");
		AddName(t, "Nguyen Trung Kien");
		AddName(t, "Nguyen Trung Kien");
		AddName(t, "Tran Huynh Minh Kiet");
		AddName(t, "Lang Hoang Son");
		AddName(t, "Dinh Tan Khiem");
		String tenPhoBien=MostName(t);
		System.out.println("Ten cua san pham la: "+tenPhoBien);
		

	}
	private static void AddName(TreeMap<String, Integer>map,String name) {
		map.put(name, map.getOrDefault(name, 0)+1);
	}
	private static String MostName(TreeMap<String, Integer>map) {
		String mostName=null;
		int maxCount=0;
		for(Map.Entry<String, Integer>entry : map.entrySet()) {
			if(entry.getValue()>maxCount) {
				maxCount=entry.getValue();
				mostName=entry.getKey();
			}
		}
		return mostName;
	}

}
