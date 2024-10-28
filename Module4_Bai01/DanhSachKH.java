package Module04_Bai1;

import java.util.Map;
import java.util.TreeMap;

public class DanhSachKH {
	private static TreeMap<Double, String> kh=new TreeMap<Double, String>();
	public static void main(String[] args) {
		DanhSachKH kh=new DanhSachKH();
		kh.AddKH(5000.0, "Lê Minh Đạt");
		kh.AddKH(5000.5, "Arifil");
		kh.AddKH(4000.0, "Lăng Hoàng Sơn");
		kh.AddKH(3500.0, "Đinh Tấn Khiêm");
		kh.AddKH(8000.0, "Nguyễn Trung Kiên");
		System.out.println("Danh sách khách hàng tăng dần theo doanh số:");
		kh.HienThi();
		
		
		

	}
	//ham them khach hang vao danh sach
	public void AddKH(Double ds,String ten) {
		kh.put(ds, ten);
		System.out.println("Đã thêm khách hàng: "+ten+" ,Doanh số: "+ds);
	}
	//ham hien thi theo doanh so tang
	public void HienThi() {
		if(kh.isEmpty()) {
			System.out.println("Không có khách hàng nào trong danh sách!");
		}else {
			System.out.println("Danh sách khách hàng theo thứ tự doanh số tăng dần:");
			for(Map.Entry<Double, String> entry: kh.entrySet()) {
				System.out.println("Tên khách hàng: "+entry.getValue()+" ,Doanh Số: "+entry.getKey());
				
			}
		}
	}

}
