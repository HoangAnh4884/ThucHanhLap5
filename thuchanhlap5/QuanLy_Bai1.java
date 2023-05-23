/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HOME
 */

        //  Nguyễn Hoàng Anh _ 1050080002 _ CNTT1

public class QuanLy_Bai1 {
    Scanner sc = new Scanner(System.in);
    ArrayList<PhongHoc_Bai1> ph;
    ArrayList<PhongLT_Bai1> plt;
    ArrayList<PhongMT_Bai1> pmt;
    ArrayList<PhongTN_Bai1> ptn;
    
    public QuanLy_Bai1() {
        ph = new ArrayList<>(); plt = new ArrayList<>(); pmt = new ArrayList<>(); ptn = new ArrayList<>(); }
    
    public void ThemDS_PhongLT(PhongLT_Bai1 p) {
        System.out.print("\nNhập số lượng phòng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("\nNhập phòng " +(i+1)+ ": ");
            if(p instanceof PhongLT_Bai1) {
                p=new PhongLT_Bai1();
                p.nhap(); }
            plt.add(p); } }
    public void ThemDS_PhongMT(PhongMT_Bai1 p) {
        System.out.print("\nNhập số lượng phòng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("\nNhập phòng " +(i+1)+ ": ");
            if(p instanceof PhongMT_Bai1) {
                p=new PhongMT_Bai1();
                p.nhap(); }
            pmt.add(p); } }
    public void ThemDS_PhongTN(PhongTN_Bai1 p) {
        System.out.print("\nNhập số lượng phòng cần thêm: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print("\nNhập phòng " +(i+1)+ ": ");
            if(p instanceof PhongTN_Bai1) {
                p=new PhongTN_Bai1();
                p.nhap(); }
            ptn.add(p); } }
        
    void TimPhong(String maPhong) {
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("Mã Phòng\tDãy Nhà\tDiện Tích\tSố Bóng Đèn\tSố Máy Chiếu\tPhòng Đạt Chuẩn");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for(PhongHoc_Bai1 x: ph) {
            if(x instanceof PhongLT_Bai1) {
                if(((PhongLT_Bai1)x).getMaPhong().compareTo(maPhong)==0) {
                    x.xuat();} } }
        
        System.out.println("Mã Phòng\tDãy Nhà\tDiện Tích\tSố Bóng Đèn\tSố Máy Tính\tPhòng Đạt Chuẩn");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for(PhongHoc_Bai1 x: ph) {
            if(x instanceof PhongMT_Bai1) {
                if(((PhongMT_Bai1)x).getMaPhong().compareTo(maPhong)==0) {
                    x.xuat(); } } }
        
        System.out.println("Mã Phòng\tDãy Nhà\tDiện Tích\tSố Bóng Đèn\tChuyên Ngành\tSức Chứa\tSố Bồn Rửa\tPhòng Đạt Chuẩn");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for(PhongHoc_Bai1 x: ph) {
            if(x instanceof PhongTN_Bai1) {
                if(((PhongTN_Bai1)x).getMaPhong().compareTo(maPhong)==0) {
                    x.xuat(); } } }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
    }
    
    public void XuatDS_PhongHoc() {
        System.out.println("\n\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        System.out.println("Mã Phòng\tDãy Nhà\tDiện Tích\tSố Bóng Đèn\tSố Máy Chiếu\tPhòng Đạt Chuẩn");
        System.out.println("---------------------------------------------------------------------------------------------------------");
            for(PhongLT_Bai1 x: plt) { x.xuat(); }
        System.out.println("Mã Phòng\tDãy Nhà\tDiện Tích\tSố Bóng Đèn\tSố Máy Tính\tPhòng Đạt Chuẩn");
        System.out.println("---------------------------------------------------------------------------------------------------------");
            for(PhongMT_Bai1 x: pmt) { x.xuat(); }
        System.out.println("Mã Phòng\tDãy Nhà\tDiện Tích\tSố Bóng Đèn\tChuyên Ngành\tSức Chứa\tSố Bồn Rửa\tPhòng Đạt Chuẩn");
        System.out.println("---------------------------------------------------------------------------------------------------------");
            for(PhongTN_Bai1 x: ptn) { x.xuat(); }
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
        }
    
    void XuatDS_PhongDC() {
        for(PhongHoc_Bai1 x: ph) {
            if(x instanceof PhongLT_Bai1) {
                if(((PhongLT_Bai1) x).PhongDatChuan()=="Dat") {
                    x.xuat(); } }
            if(x instanceof PhongMT_Bai1) {
                if(((PhongMT_Bai1) x).PhongDatChuan()=="Dat") {
                    x.xuat(); } }
            if(x instanceof PhongTN_Bai1) {
                if(((PhongTN_Bai1) x).PhongDatChuan()=="Dat") {
                    x.xuat(); } }
        }
    }
    
    void SXTang_dayNha() {
        
    }
    
    void SXGiam_dienTich() {
        
    }
    
    void SXTang_bongDen() {
        
    }
    
    void CapNhatMT_PhongMT_maPhong(String maPhong) {
        for(PhongMT_Bai1 x: pmt) {
            if(x instanceof PhongMT_Bai1) {
                if(((PhongMT_Bai1)x).getMaPhong().compareTo(maPhong)==0) {
                    x.nhap(); } } }         //Cho nhập lại hết lunn!!!
    }
    
    void XoaPhong_maPhong(String maPhong) {
        for(PhongHoc_Bai1 x: ph) {
            if(x instanceof PhongLT_Bai1) {
                if(((PhongLT_Bai1)x).getMaPhong().compareTo(maPhong)==0) {
                    plt.remove(x); } }
            if(x instanceof PhongMT_Bai1) {
                if(((PhongMT_Bai1)x).getMaPhong().compareTo(maPhong)==0) {
                    pmt.remove(x); } }
            if(x instanceof PhongTN_Bai1) {
                if(((PhongTN_Bai1)x).getMaPhong().compareTo(maPhong)==0) {
                    ptn.remove(x); } }
        }
    }
    
    void XuatTong_Phong() {
        int TongPhong;
        TongPhong = plt.size() + pmt.size() + ptn.size();
        System.out.printf("\n\tHiện có tổng cộng %s phòng học\n", TongPhong);
    }
    
    void XuatDS_PhongMT_60() {
        System.out.println("Mã Phòng\tDãy Nhà\tDiện Tích\tSố Bóng Đèn\tSố Máy Tính\tPhòng Đạt Chuẩn");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for(PhongMT_Bai1 x: pmt) {
            if (x.getSoMayTinh()==60) { x.xuat(); } }
    }
    
    void Menu() {
            System.out.println("\n________________Menu Chức Năng________________");
            System.out.println("0: Kết thúc chương trình");
            System.out.println("1: Thêm DS phòng lý thuyết");
            System.out.println("2: Thêm DS phòng máy tính");
            System.out.println("3: Thêm DS phòng thí nghiệm");
            System.out.println("4: Tìm phòng học bằng mã phòng");
            System.out.println("5: Xuất toàn bộ DS phòng học");
            System.out.println("6: Xuất các phòng học đạt chuẩn");
            System.out.println("7: Sắp xếp tăng dần theo cột dãy nhà");
            System.out.println("8: Sắp xếp giảm dần theo cột diện tích");
            System.out.println("9: Sắp xếp tăng dần theo cột số bóng đèn");
            System.out.println("10: Cập nhật số máy tính của phòng máy tính bằng mã phòng");
            System.out.println("11: Xóa phòng học bằng mã phòng");
            System.out.println("12: Xuất tổng số phòng học");
            System.out.println("13: Xuất DS phòng máy tính có 60 máy tính");
            System.out.println("______________________________________________\n");
        }  
}