/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author HOME
 */

        //  Nguyễn Hoàng Anh _ 1050080002 _ CNTT1

public class QuanLy_Bai2 {
    Scanner sc = new Scanner(System.in);
    ArrayList<KhachHang_Bai2> kh;
    Queue<KhachHang_Bai2> hd;
    List<KhachHang_Bai2> ds;
    
    public QuanLy_Bai2() { 
        kh = new ArrayList<>(); hd = new LinkedList<>(); ds = new ArrayList<>(); }
    
    void Menu() {
        System.out.println("\n________________Menu Chức Năng________________");
            System.out.println("0: Kết thúc chương trình");
            System.out.println("1: Thêm 1 khách hàng");
            System.out.println("2: Bán 1 vé cho khách hàng");
            System.out.println("3: Hiển thị danh sách khách hàng");
            System.out.println("4: Hủy 1 khách hàng ra khỏi danh sách");
            System.out.println("5: Thống kê tình hình bán vé");
            System.out.println("6: Lưu danh sách vào file");
            System.out.println("7: Hiển thị danh sách các ga đang chờ mua vé");
            System.out.println("8: Hiển thị danh sách các ga đang chờ mua vé và số vé tương ứng");
            System.out.println("______________________________________________\n");
    }
    
    public boolean KT_CMND(String CMND) {
        for (KhachHang_Bai2 kh : hd) {
            if (kh.CMND.equals(CMND)) { return true; } }
        return false;
    }
    
    public void ThemKH(String CMND, String tenKH, String gaDen, double giaTien) {
        if (!KT_CMND(CMND)) {
            KhachHang_Bai2 kh = new KhachHang_Bai2(CMND, tenKH, gaDen, giaTien);
            hd.add(kh);
            System.out.println("Thêm khách hàng thành công"); }
        else { System.out.println("Trùng CMND, xin hãy kiểm tra lại"); }
    }

    public void BanVe() {
        if (!hd.isEmpty()) {
            KhachHang_Bai2 dauDS = hd.poll();
            ds.add(dauDS);
            System.out.printf("Bán vé thành công cho khách hàng: ", dauDS.tenKH); } 
            else { System.out.println("Không có khách hàng trong hàng đợi."); }
        }

    public void XuatDSKH() {
        if (!hd.isEmpty()) {
            System.out.println("Danh sách khách hàng đang đợi mua vé: ");
            for (KhachHang_Bai2 kh : hd) { System.out.println(kh.toString()); } }
        else { System.out.println("Khong co khhach hang trong hang doi."); }
    }

    public void XoaKH(String CMND) {
        Iterator<KhachHang_Bai2> iterator = hd.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            KhachHang_Bai2 kh = iterator.next();
            if (kh.CMND.equals(CMND)) {
                iterator.remove(); found = true; break; } }
        if (found) { System.out.println("Huy khach hang thanh cong."); } 
        else { System.out.println("Khong tim thay khach hang trong hang doi."); }
    } 
}