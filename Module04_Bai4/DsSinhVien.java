package Module04_Bai4;

import java.util.ArrayList;
import java.util.Comparator;

public class DsSinhVien {
	private ArrayList<SinhVien> sv;
	public DsSinhVien() {
		sv=new ArrayList<SinhVien>();
	}
	//ham them sinh vien
	public void ThemSV(SinhVien sinhvien) {
		for(SinhVien s : sv) {
			if(s.getMaSV().equals(sinhvien.getMaSV())) {
				throw new IllegalArgumentException("Mã sinh viên đã tồn tại!!");
			}
			
		}
		sv.add(sinhvien);
	}
	//in danh sach sinh vien dang bang
	public void InDS() {
		System.out.println(String.format("%-20s %-35s %-10s","Mã Sinh viên:","Họ tên:","Năm sinh:"));
		System.out.println("------------------------------------------------------------------");
		for(SinhVien s : sv) {
			System.out.println(s);
		}
	}
	//xoa sinh vien khi biet ma
	public void XoaSV(String ma) {
		sv.removeIf(sv->sv.getMaSV().equals(ma));
	}
	//sua thong tin sinh vien (khong sua ma)
	public void SuaThongTin(String MaSV, String newHoTen, int newNamSinh) {
		for(SinhVien s : sv) {
			if(s.getMaSV().equals(MaSV)) {
				s.setHoTen(newHoTen);
				s.setNamSinh(newNamSinh);
				return;
			}
		}
		System.out.println("Không tìm thấy sinh viên có mã: "+MaSV);
	}
	//tim kiem sinh vien theo ma
	public void TimKiemTheoMa(String Ma) {
		for(SinhVien s : sv) {
			if(s.getMaSV().equalsIgnoreCase(Ma)) {
				System.out.println(s);
				return;
			}
		}
		throw new IllegalArgumentException("Không tìm thấy sinh viên có mã: "+Ma);
	}
	//tim kiem sinh vien theo ten
	public void TimKiemTheoTen(String Ten) {
		//boolean tim=false;
		for(SinhVien s : sv) {
			if(s.getHoTen().contains(Ten)) {
				System.out.println(s);
				//tim=true;
				return;
			}
		}
		//if(!tim)
			throw new IllegalArgumentException("Không tìm thấy sinh viên có tên: "+Ten);
	}
	//sap xep danh sach theo ma tang dan
	public void SapXeptang() {
		sv.sort(Comparator.comparing(SinhVien::getMaSV));
	}
	
	

}
