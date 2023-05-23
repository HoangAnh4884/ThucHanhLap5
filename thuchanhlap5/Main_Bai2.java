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

public class Main_Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachHang_Bai2 kh = new KhachHang_Bai2();
        QuanLy_Bai2 ql = new QuanLy_Bai2();
        
    int Chon;
    do {
        ql.Menu();
        System.out.print("Chọn chức năng: ");
        Chon=sc.nextInt();
        
    switch(Chon) {
        case 0: { System.out.println("Kết thúc chương trình");            break; }
        case 1: { ql.ThemKH(CMND, tenKH, gaDen, Chon);                break; }
        case 2: { ql.BanVe();                                               break; }
        case 3: { ql.XuatDSKH();                                            break; }
        case 4: { 
            String CMND;
            System.out.println("Nhập số CMND của khách hàng muốn hủy: ");
            CMND=sc.nextLine();
            ql.XoaKH(CMND);                                                 break; }
        case 5: {                                 break; }
        case 6: {                                 break; }
        case 7: {                                 break; }
        case 8: {                                 break; }
        default: System.out.println("\nKhông có lựa chọn này\n");         break; }
    }
    while(Chon!=0);
        System.out.println("\n\t\tCảm ơn bạn đã dùng chương trình này");
        System.out.println("\n\t\tChúc bạn một ngày tốt lành <(^w^)>");
    }
}
