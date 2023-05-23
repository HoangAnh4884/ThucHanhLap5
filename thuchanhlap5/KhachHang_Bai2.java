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

public class KhachHang_Bai2 {
    String CMND, tenKH, gaDen;
    double giaTien;

    public KhachHang_Bai2() { }
    public KhachHang_Bai2(String CMND, String tenKH, String gaDen, double giaTien) {
        this.CMND = CMND;
        this.tenKH = tenKH;
        this.gaDen = gaDen;
        this.giaTien = giaTien;
    }

    public String getCMND() { return CMND; }
    public String getTenKH() { return tenKH; }
    public String getGaDen() { return gaDen; }
    public double getGiaTien() { return giaTien; }
    
    Scanner sc = new Scanner(System.in);
    
    void nhap() {
        System.out.print("\nNhập số CMND: "); CMND=sc.nextLine();
        System.out.print("\nNhập tên khách hàng: "); tenKH=sc.nextLine();
        System.out.print("\nNhập ga đến: "); gaDen=sc.nextLine();
        System.out.print("\nNhập giá tiền: "); giaTien=sc.nextDouble();
    }
    
    void xuat() {
        System.out.println(getCMND()+"\t"+getTenKH()+"\t"+getGaDen()+"\t"+getGiaTien());
    }
}
