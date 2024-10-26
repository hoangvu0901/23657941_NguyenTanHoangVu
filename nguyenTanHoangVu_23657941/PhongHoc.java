package nguyenTanHoangVu_23657941;

public abstract class PhongHoc {
   protected String maPhong,dayNha;
   protected double dienTich;
   protected int soBongDen;
public PhongHoc(String maPhong, String dayNha, double dienTich, int soBongDen) {
	super();
	this.maPhong = maPhong;
	this.dayNha = dayNha;
	this.dienTich = dienTich;
	this.soBongDen = soBongDen;
}
public PhongHoc() {
	this("","",0.0,0);
}
public String getMaPhong() {
	return maPhong;
}
public void setMaPhong(String maPhong) {
	if(maPhong==null)
		throw new IllegalArgumentException("ma phong khong duoc de trong");
	this.maPhong = maPhong;
}
public String getDayNha() {
	return dayNha;
}
public void setDayNha(String dayNha) {
	if(dayNha==null)
		throw new IllegalArgumentException("Dau nha khong duoc de trong");
	this.dayNha = dayNha;
}
public double getDienTich() {
	return dienTich;
}
public void setDienTich(double dienTich) {
	if(dienTich<=0)
		throw new IllegalArgumentException("Dien ticg phai lon hon 0");
	this.dienTich = dienTich;
}
public int getSoBongDen() {
	return soBongDen;
}
public void setSoBongDen(int soBongDen) {
	if(soBongDen<=0)
		throw new IllegalArgumentException("So bong den phai lon hon hoac bang 0");
	this.soBongDen = soBongDen;
}
public boolean duSang() {
	return (getDienTich()/getSoBongDen()<=10);

}
public abstract boolean getDatChuan();

   @Override
	public String toString() {
		String s="";
		s+=String.format("|-%10s|-%10s|-%10s|-%10s|", getMaPhong(),getDayNha(),getDienTich(),getSoBongDen());
		return s;
	}
}
