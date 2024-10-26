package nguyenTanHoangVu_23657941;
import java.util.List;
public class Test {
 public static void main(String[] args) {
	ListPhongHoc ph = new ListPhongHoc();
	
	ph.them(new PhongLT("A01","Day Nha A",100,30,true));
	ph.them(new PhongMT("H03","Day Nha H",90,20,60));
	ph.them(new PhongMT("H05","Day Nha H",120,30,90));
	ph.them(new PhongTN("B02","Day Nha B",80,35,"Hoa Hoc",30,true));
	
	
	
	System.out.println("Danh Sach cac Phong Hoc");
	System.out.println(ph);
    
	String mp ="A01";
	System.out.println("Phong HOc voi ma:");
	System.out.println(ph.timPhong(mp));
	
	List<PhongHoc> pDC = ph.danhSachDC(); 
	System.out.println("Danh sach phong dat chuan:");
	for(PhongHoc p: pDC) {
		System.out.println(p);
	}
	ph.sapXepTheoDayNha();
	System.out.println("danh sach phong hoc sap xep theo day nha:");
	System.out.println(ph);
	System.out.println("danh sach phong hoc sap xep theo dien tich:");
	System.out.println(ph);
	ph.sapXepTheoSoBongDen();
	System.out.println("danh sach phong hoc sap xep theo so bong den:");
	System.out.println(ph);
	ph.capNhatSoMayTinh("H05", 90);
	System.out.println("Danh sach phong sau khi cap nhat so may tinh:");
	System.out.println(ph);
	ph.xoa("A01");
	System.out.println("danh sach sau khi xoa phong la:");
	System.out.println(ph);
}
}
