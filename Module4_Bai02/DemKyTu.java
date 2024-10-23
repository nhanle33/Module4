package Module4_Bai02;

import java.util.*;

public class DemKyTu {
	private HashMap<String, Integer> hm=new HashMap<String, Integer>();
	//
	private int method(String str) {
		if(hm.containsKey(str)) {
			System.out.println("String Already Exists"+str);
			return hm.get(str);
		}else {
			char[] c=new char[50];
			c=str.toCharArray();
			HashSet<Character> hs=new HashSet<Character>();//hello ={h,e,l,o} what={w,h,a,t}
			for(char x:c) {
				hs.add(x);
			}
			System.out.println();
			System.out.println("Welcom, "+str+" This is a new String");
			Integer value=hs.size();
			hm.put(str, value);
			System.out.println("Hasmap Update: "+hm);
			return value;			
		}
	}
	public int getString(String str) {
		return method(str);
	}

}
