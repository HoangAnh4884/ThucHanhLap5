/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanhlap5;

/**
 *
 * @author HOME
 */

        //  Nguyễn Hoàng Anh _ 1050080002 _ CNTT1

public class PhongTN_Bai1 extends PhongHoc_Bai1{
    String chuyenNganh;
    int sucChua, soBonRua;

    public PhongTN_Bai1() { }
    public PhongTN_Bai1(String chuyenNganh, int sucChua, int soBonRua, String maPhong, String dayNha, double dienTich, double soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.sucChua = sucChua;
        this.soBonRua = soBonRua;
    }

    public String getChuyenNganh() {
        return chuyenNganh; }
    public int getSucChua() {
        return sucChua; }
    public int getSoBonRua() {
        return soBonRua; }
    String PhongDatChuan() {
        String phongDatChuan;
        if(soBonRua>0) { phongDatChuan="Dat"; }
        else { phongDatChuan= "Khong Dat"; }
        return phongDatChuan;
    }
    
    @Override
    void nhap() {
        System.out.println("Nhập mã phòng: "); maPhong=sc.nextLine();
        System.out.println("Nhập dãy nhà: "); dayNha=sc.nextLine();
        System.out.println("Nhập diện tích: "); dienTich=sc.nextDouble();
        System.out.println("Nhập số bóng đèn: "); soBongDen=sc.nextDouble();
        System.out.println("Nhập chuyên ngành: "); chuyenNganh=sc.nextLine();
        System.out.println("Nhập sức chứa: "); sucChua=sc.nextInt();
        System.out.println("Nhập số bồn rửa: "); soBonRua=sc.nextInt();
    }
    
    @Override
    void xuat() {
        System.out.println(getMaPhong()+"\t"+getDayNha()+"\t"+getDienTich()+"\t"+getSoBongDen()+"\t"+getChuyenNganh()+"\t"+getSucChua()+"\t"+getSoBonRua()+"\t"+PhongDatChuan());
    }
}