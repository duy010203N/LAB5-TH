package lab5;

public class phongthinghiem extends phonghoc {
	String chuyennghanh;
	int succhua;
	boolean cobonrua;
	public phongthinghiem(String maphong, String daynha, double dientich, int sobongden, String chuyennghanh,
			int succhua, boolean cobonrua) {
		super(maphong, daynha, dientich, sobongden);
		this.chuyennghanh = chuyennghanh;
		this.succhua = succhua;
		this.cobonrua = cobonrua;
	}
	public String getChuyennghanh() {
		return chuyennghanh;
	}
	public void setChuyennghanh(String chuyennghanh) {
		this.chuyennghanh = chuyennghanh;
	}
	public int getSucchua() {
		return succhua;
	}
	public void setSucchua(int succhua) {
		this.succhua = succhua;
	}
	public boolean isCobonrua() {
		return cobonrua;
	}
	public void setCobonrua(boolean cobonrua) {
		this.cobonrua = cobonrua;
	}
	@Override
	public String toString() {
		return "phongthinghiem [chuyennghanh=" + chuyennghanh + ", succhua=" + succhua + ", cobonrua=" + cobonrua + "]";
	}
	
}
