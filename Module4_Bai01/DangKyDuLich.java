package Module04_Bai1;

import java.util.LinkedList;

public class DangKyDuLich {
	private static LinkedList<String> rg= new LinkedList<String>();

	public static void main(String[] args) {
		AddNV("Lê Minh Đạt");
		AddNV("Nguyễn Trung Kiên");
		AddNV("Lăng Hoàng Sơn");
		AddNV("Đinh Tấn Khiêm");
		HienThi();
		System.out.println("Xử lý theo thứ tự:");
		while(!rg.isEmpty()) {
			XuLy();
		}
	}
	//ham them nhan vien vao danh sach dang ky
	public static void AddNV(String nv) {		
		rg.add(nv);
		System.out.println("Đăng ký thành công cho: "+nv);
			 
	}
	//ham xu ly uu tien
	public static void XuLy() {
		if(rg.isEmpty()){
			System.out.println("Không có nhân viên nào đăng ký!!");
		}else {
			String nv=rg.poll();//lay nhan vien dau tien va xoa khoi danh sach
			System.out.println("Xử lý đăng ký cho nhân viên: "+nv);
		}
	}
	//ham hien thi danh sach
	public static void HienThi() {
		if(rg.isEmpty()) {
			System.out.println("Không có nhân viên nào đăng ký!!");
		}else {
			System.out.println("Danh sách nhân viên đăng ký:");
			for(String nv: rg) {
				System.out.println(nv);
			}
		}
	}
	

}
