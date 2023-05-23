/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap5;

import java.util.Scanner;

/**
 *
 * @author HOME
 */

        //  Nguyễn Hoàng Anh _ 1050080002 _ CNTT1

public class Main_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhongLT_Bai1 plt = new PhongLT_Bai1();
        PhongMT_Bai1 pmt = new PhongMT_Bai1();
        PhongTN_Bai1 ptn = new PhongTN_Bai1();
        QuanLy_Bai1 ql = new QuanLy_Bai1();
        
    int Chon;
    do {
        ql.Menu();
        System.out.print("Chọn chức năng: ");
        Chon=sc.nextInt();
        
    switch(Chon) {
        case 0: { System.out.println("Kết thúc chương trình");       break; }
        case 1: { ql.ThemDS_PhongLT(plt);                            break; }
        case 2: { ql.ThemDS_PhongMT(pmt);                            break; }
        case 3: { ql.ThemDS_PhongTN(ptn);                            break; }
        case 4: { 
            String maPhong;
            System.out.println("Nhập mã phòng muốn tìm: ");
            maPhong=sc.nextLine();
            ql.TimPhong(maPhong);                                      break; }
        case 5: { ql.XuatDS_PhongHoc();                                break; }
        case 6: { ql.XuatDS_PhongDC();                                 break; }
        case 7: { ql.SXTang_dayNha();                                  break; }
        case 8: { ql.SXGiam_dienTich();                                break; }
        case 9: { ql.SXTang_bongDen();                                 break; }
        case 10: { 
            String maPhong;
            System.out.println("Nhập mã phòng máy tính muốn cập nhật: ");
            maPhong=sc.nextLine();
            ql.CapNhatMT_PhongMT_maPhong(maPhong);                     break; }
        case 11: {
            String maPhong;
            System.out.println("Nhập mã phòng máy tính muốn cập nhật: ");
            maPhong=sc.nextLine();
            ql.XoaPhong_maPhong(maPhong);                              break; }
        case 12: { ql.XuatTong_Phong();                                break; }
        case 13: { ql.XuatDS_PhongMT_60();                             break; }
        default: System.out.println("\nKhông có lựa chọn này\n");    break; }
    }
    while(Chon!=0);
        System.out.println("\n\t\tCảm ơn bạn đã dùng chương trình này");
        System.out.println("\n\t\tChúc bạn một ngày tốt lành <(^w^)>");
    }
}