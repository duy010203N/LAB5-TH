package lab5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class quanlyphonghoc {
	private List<phonghoc>danhsachphonghoc;
	public quanlyphonghoc(){
		danhsachphonghoc = new ArrayList<>();
	}
	public boolean themphonghoc(phonghoc PhongHoc) {
		if(!kiemTraTonTai(PhongHoc.getMaphong())) {
			danhsachphonghoc.add(PhongHoc);
			return true;
		}
		return false;
	}
	private boolean kiemTraTonTai(String maphong) {
		// TODO Auto-generated method stub
		return false;
	}
	public phonghoc timphonghoctheoma(String maphong) {
		for(phonghoc PhongHoc:danhsachphonghoc) {
			if(PhongHoc.getMaphong().equals(maphong)) {
				return PhongHoc;
			}
		}
		return null;
	}
	public void intoanbodanhsachphonghoc() {
		for(phonghoc PhongHoc:danhsachphonghoc) {
			System.out.println("PhongHoc");
		}
	}
	public void indanhsachphongdatchuan() {
		for(phonghoc PhongHoc : danhsachphonghoc) {
			if(PhongHoc instanceof phonglythuyet) {
				phonglythuyet PhongLyThuyet = (phonglythuyet) PhongHoc;
				if(PhongLyThuyet.comaychieu()&& PhongHoc.getSobongden()>=PhongHoc.getDientich()/10) {
					System.out.println("PhongHoc");
				}
			}else if(PhongHoc instanceof phongmaytinh) {
				phongmaytinh PhongMayTinh = (phongmaytinh) PhongHoc;
				if(PhongMayTinh.getSomaytinh()>=PhongHoc.getDientich()/1.5&& PhongHoc.getSobongden()>=PhongHoc.getDientich()/10) {
					System.out.println("PhongHoc");
				}
			}else if(PhongHoc instanceof phongthinghiem) {
				phongthinghiem PhongThiNghiem =(phongthinghiem) PhongHoc;
				if(PhongThiNghiem.isCobonrua()&&PhongHoc.getSobongden()>=PhongHoc.getDientich()/10) {
					System.out.println("PhongHoc");
					}
			}
		}
	}
	public void sapxeptheodaynhatangdan() {
		danhsachphonghoc.sort(Comparator.comparing(phonghoc::getdaynha));
	}
	public void sapxeptheodientichgiamdan() {
		danhsachphonghoc.sort(Comparator.comparing(phonghoc::getdientich).reversed());
	}
	public void sapxeotheosobongdentangdan() {
		danhsachphonghoc.sort(Comparator.comparing(phonghoc::getsobongden));
	}
	public void capnhatsomaytinh(String maphong,int somaytinhmoi) {
		for(phonghoc PhongHoc: danhsachphonghoc) {
			if(PhongHoc instanceof phongmaytinh && PhongHoc.getMaphong().equals(maphong)) {
				phongmaytinh PhongMayTinh = (phongmaytinh) PhongHoc;
				PhongMayTinh.setSomaytinh(somaytinhmoi);
				break;
			}
		}
	}
	public boolean xoaphonghoc(String maphong) {
		for(phonghoc PhongHoc:danhsachphonghoc) {
			if(PhongHoc.getMaphong().equals(maphong)) {
				danhsachphonghoc.remove(PhongHoc);
				return true;
			}
		}
		return false;
	}
	public void intongsophong() {
		System.out.println("tong so phong hoc: "+ dabgsachphonghoc.size());
	}
	public void indanhsachphongmaycosomaytinh(int somaytinh) {
		for(phonghoc PhongHoc: danhsachphonghoc) {
			if(PhongHoc instanceof phongmaytinh) {
				phongmaytinh PhongMayTinh = (phongmaytinh) phonghoc;
				if(PhongMayTinh.getSomaytinh()==somaytinh) {
					System.out.println("PhongHoc");
				}
			}
		}
	}
	private boolean kiemTraTonTai(String maphong) {
		for(phonghoc PhongHoc : danhsachphonghoc) {
			if(PhongHoc.getMaphong().equals(maphong)) {
				return true;
			}
		}
		return false
	}
}

