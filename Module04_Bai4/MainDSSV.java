package Module04_Bai4;

import java.util.Scanner;

public class MainDSSV {

	public static void main(String[] args) {
		DsSinhVien sv=new DsSinhVien();
		//thêm 5 sinh viên tùy ý
		sv.ThemSV(new SinhVien("SV01", "Nguyễn Trung Kiên", 2005));
		sv.ThemSV(new SinhVien("SV04", "Nguyễn Trường Phát", 2005));
		sv.ThemSV(new SinhVien("SV05", "Lăng Hoàng Sơn", 2005));
		sv.ThemSV(new SinhVien("SV02", "Lê Minh Đạt", 2005));
		sv.ThemSV(new SinhVien("SV03", "Trần Huỳnh Minh Kiệt", 2005));
		//in danh sách sinh viên
		System.out.println("Danh sách sinh viên ban đầu:");
		sv.InDS();
		//thêm sinh viên mới
		System.out.println("\nDanh sách sau khi thêm sinh viên:");
		sv.ThemSV(new SinhVien("SV06", "Muhammad Arifil", 2005));
		sv.InDS();
		//xóa sinh viên theo mã
		System.out.println("\nDanh sách sau khi xóa sinh viên:");
		sv.XoaSV("SV06");
		sv.InDS();
		//sửa thông tin không sửa mã
		System.out.println("\nDanh sách sinh viên sau khi sửa thông tin:");
		sv.SuaThongTin("SV03", "Lê Trần Quang Nhân", 2005);
		sv.InDS();
		//tìm kiếm theo mã
		System.out.print("\nNhập mã sinh viên cần tìm:");
		Scanner scanner= new Scanner(System.in);
		String ma= scanner.nextLine();
		System.out.println("\nDanh sách sinh viên tìm kiếm theo mã:"+ma);
		sv.TimKiemTheoMa(ma);
		//tìm kiếm theo tên
		System.out.print("\nNhập tên sinh viên cần tìm:");
		String ten= scanner.nextLine();
		System.out.println("\nDanh sách sinh viên tìm kiếm theo tên: "+ten);
		sv.TimKiemTheoTen(ten);
		//sắp xếp tăng dần theo mã
		System.out.println("\nDanh sách sinh viên sau khi sắp xếp tăng dần theo mã:");
		sv.SapXeptang();
		sv.InDS();
		
		

	}

}
