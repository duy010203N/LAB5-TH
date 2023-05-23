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
                   System.out.print("Nhap ma phong can tim: ");
                   String maPhongTimKiem = System.console().readLine();
                   PhongHoc phongHocTimKiem = quanLyPhongHoc.timPhongHocTheoMa(maPhongTimKiem);
                   if (phongHocTimKiem != null) {
                       System.out.println(phongHocTimKiem);
                   } else {
                       System.out.println("Khong tim thay phong hoc!");
                   }
                   break;
               case 3:
                   quanLyPhongHoc.inToanBoDanhSachPhongHoc();
                   break;
               case 4:
                   quanLyPhongHoc.inDanhSachPhongHocDatChuan();
                   break;
               case 5:
                   quanLyPhongHoc.sapXepTheoDayNhaTangDan();
                   System.out.println("Da sap xep danh sach tang dan theo day nha!");
                   break;
               case 6:
                   quanLyPhongHoc.sapXepTheoDienTichGiamDan();
                   System.out.println("Da sap xep danh sach giam dan theo dien tich!");
                   break;
               case 7:
                   quanLyPhongHoc.sapXepTheoSoBongDenTangDan();
                   System.out.println("Da sap xep danh sach tang dan theo so bong den!");
                   break;
               case 8:
                   System.out.print("Nhap ma phong may tinh can cap nhat: ");
                   String maPhongCapNhat = System.console().readLine();
                   System.out.print("Nhap so may tinh moi: ");
                   int soMayTinhMoi = Integer.parseInt(System.console().readLine());
                   quanLyPhongHoc.capNhatSoMayTinh(maPhongCapNhat, soMayTinhMoi);
                   System.out.println("Da cap nhat so may tinh cho phong hoc!");
                   break;
               case 9:
                   System.out.print("Nhap ma phong can xoa: ");
                   String maPhongXoa = System.console().readLine();
                   if (quanLyPhongHoc.xoaPhongHoc(maPhongXoa)) {
                       System.out.println("Xoa phong hoc thanh cong!");
                   } else {
                       System.out.println("Khong tim thay phong hoc can xoa!");
                   }
                   break;
               case 10:
                   quanLyPhongHoc.inTongSoPhongHoc();
                   break;
               case 11:
                   System.out.print("Nhap so may tinh: ");
                   int soMayTinhIn = Integer.parseInt(System.console().readLine());
                   quanLyPhongHoc.inDanhSachPhongMayCoSoMayTinh(soMayTinhIn);
                   break;
               case 0:
                   System.out.println("Ket thuc chuong trinh!");
                   break;
               default:
                   System.out.println("Lua chon khong hop le!");
                   break;
           }
       } while (luaChon != 0);
   }
}
