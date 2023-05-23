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

public class PhongHoc_Bai1 {
    Scanner sc = new Scanner(System.in);
    
    String maPhong, dayNha;
    double dienTich, soBongDen;

    public PhongHoc_Bai1() {}
    public PhongHoc_Bai1(String maPhong, String dayNha, double dienTich, double soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    public String getMaPhong() { return maPhong; }
    public String getDayNha() { return dayNha; }
    public double getDienTich() { return dienTich; }
    public double getSoBongDen() { return soBongDen; }
    
    void nhap() {}
    void xuat() {}
}