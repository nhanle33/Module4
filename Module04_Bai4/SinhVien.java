package Module04_Bai4;

public class SinhVien {
	private String MaSV,HoTen;
	private int NamSinh;
	public SinhVien(String msv,String ht,int ns) {
		setMaSV(msv);
		setHoTen(ht);
		setNamSinh(ns);
	}
	public String getMaSV() {
		return MaSV;
	}
	public void setMaSV(String maSV) {
		MaSV = maSV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public int getNamSinh() {
		return NamSinh;
	}
	public void setNamSinh(int namSinh) {
		NamSinh = namSinh;
	}
	@Override
	public String toString() {
		return String.format("%-20s %-35s %-10d",MaSV,HoTen,NamSinh);
	}
	
	

}
