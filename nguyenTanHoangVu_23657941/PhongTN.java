package nguyenTanHoangVu_23657941;

public class PhongTN extends PhongHoc{
  private String chuyenNganh;
  private int sucChua;
  private boolean coBonRua;
  
	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int sucChua,
		boolean coBonRua) {
	super(maPhong, dayNha, dienTich, soBongDen);
	this.chuyenNganh = chuyenNganh;
	this.sucChua = sucChua;
	this.coBonRua = coBonRua;
}

	public PhongTN() {
		super();
		this.chuyenNganh = "";
		this.sucChua = 0;
		this.coBonRua = false;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public boolean isCoBonRua() {
		return coBonRua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	@Override
	public boolean getDatChuan() {
		return (duSang()&& coBonRua);
	}
	@Override
		public String toString() {
			String bonRua = coBonRua? "Co bon rua":"Khong co bon rua";
			return super.toString() + String.format("Chuyen nganh: %s;Suc chua: %s;%s", getChuyenNganh(),getSucChua(),bonRua);
		}

}
