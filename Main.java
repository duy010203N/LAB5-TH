package lab5;

public class Main {
	public static void main(String[]args) {
		quanlyphonghoc QuanLyPhongHoc = new quanlyphonghoc();
		int luachon = 0;
		do {
			System.out.println("********MENU********");
			System.out.println("1.Them phong hoc");
			System.out.println("2.Tim kiem phong hoc");
			System.out.println("3.In toan bo danh sach phong hoc");
			System.out.println("4.In danh sach phong hoc dat chuan");
			System.out.println("5.Sap xep danh sach tang dan theo day nha");
			System.out.println("6.Sap xep danh sach giam dan theo dien tich");
			System.out.println("7.Sap xep danh sach tang dan theo so bong den");
			System.out.println("8.Cap nhat so may tinh cho mot phong may tinh");
			System.out.println("9.Xoa mot phong hoc");
			System.out.println("10.In tong so phong hoc ");
			System.out.println("11.In danh sach phong may co so may tinh");
			System.out.println("0.Thoat");
			System.out.println("Nhap lua chon cua ban");
			luachon = Integer.parseInt(System.console().readLine());
			
			switch(luachon) {
			case 1:
				System.out.print("Nhap ma phong:");
				String maphong = System.console().readLine();
				System.out.print("Nhap day nha:");
				String daynha  =System.console().readLine();
				System.out.print("Nhap dien tich:");
				double dientich = Double.parseDouble(System.console().readLine());
				System.out.print("Nhap so bong den:");
				int sobongden = Integer.parseInt(System.console().readLine());
				
				System.out.println("Loai phong hoc");
				System.out.println("1.Phong ly thuyet");
				System.out.println("2.Phong may tinh");
				System.out.println("3.Phong thi nghiem");
				
				switch(loaiphong) {
				case 1:
					System.out.print("Co may chieu?(true/false):");
					boolean comaychieu=Boolean.parseBoolean(System.console().readLine();
					phonglythuyet PhongLyThuyet = new phonglythuyet(maphong,daynha,dientich,sobongden,comaychieu);
					if(quanlyphonghoc.themphonghoc(	PhongLyThuyet)) {
						System.out.println(" Them phong hoc thanh cong ");
					}else {
						System.out.println("Ma phong da ton tai!");
					}
					break;
					case 2:
						Sytem.out.print("Nhap so may tinh:");
				}


			}
		}
	}
}
