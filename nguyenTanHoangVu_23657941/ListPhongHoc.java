package nguyenTanHoangVu_23657941;

import java.util.ArrayList;
import java.util.List;

public class ListPhongHoc {
  private List<PhongHoc> dsP;
  
  public ListPhongHoc() {
	  dsP = new ArrayList<PhongHoc>();
	}
  public boolean them(PhongHoc p) {
	  if(dsP.contains(p))
		  return false;
	  dsP.add(p);
	  return true;
  }
  public PhongHoc timPhong(String maPhong) {
	  for (PhongHoc p: dsP) {
		  if(p.getMaPhong().equalsIgnoreCase(maPhong));
  }
	  return null;
  }
  public List<PhongHoc> danhSachDC(){
	  List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
	  for (PhongHoc p:dsP) {
		  if(p.getDatChuan())
			  dsDC.add(p);
	  }
	  return dsDC;
  }
  public void sapXepTheoDayNha() {
	  dsP.sort((p1,p2)-> p1.getDayNha().compareToIgnoreCase(p2.getDayNha()));
  }
  public void sapXepTheoDienTich() {
	  dsP.sort((p1,p2)->Double.compare(p2.getDienTich(), p1.getDienTich()));
  }
  public void sapXepTheoSoBongDen() {
	  dsP.sort((p1,p2)-> Integer.compare(p1.getSoBongDen(), p2.getSoBongDen()));
  }
  public void capNhatSoMayTinh(String maPhong,int soMayTinh) {
	  PhongHoc p = timPhong(maPhong);
	  if(p instanceof PhongMT)
		  ((PhongMT) p).setSoMayTinh(soMayTinh);
  }
  public  void xoa(String maPhong) {
	  PhongHoc p= timPhong(maPhong);
	  if(p!=null)
		  dsP.remove(p);
  }
  @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(PhongHoc p : dsP) {
		  sb.append(p.toString()).append("\n");	
		  }
            return sb.toString();
}
}
