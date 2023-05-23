package lab5;

public class phongmaytinh extends phonghoc {
	int somaytinh;

	public phongmaytinh(String maphong, String daynha, double dientich, int sobongden, int somaytinh) {
		super(maphong, daynha, dientich, sobongden);
		this.somaytinh = somaytinh;
	}

	public int getSomaytinh() {
		return somaytinh;
	}

	public void setSomaytinh(int somaytinh) {
		this.somaytinh = somaytinh;
	}

	@Override
	public String toString() {
		return "phongmaytinh [somaytinh=" + somaytinh + "]";
	}
	
}
