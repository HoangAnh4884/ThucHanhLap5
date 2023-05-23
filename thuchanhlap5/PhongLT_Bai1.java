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

public class PhongLT_Bai1 extends PhongHoc_Bai1{
    double soMayChieu;

    public PhongLT_Bai1() { }

    public PhongLT_Bai1(double soMayChieu, String maPhong, String dayNha, double dienTich, double soBongDen) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.soMayChieu = soMayChieu;
    }

    public double getSoMayChieu() {
        return soMayChieu; }
    String PhongDatChuan() {
        String phongDatChuan;
        if(soMayChieu>0) { phongDatChuan="Dat"; }
        else { phongDatChuan= "Khong Dat"; }
        return phongDatChuan;
    }
    
    @Override
    void nhap() {
        System.out.println("Nhập mã phòng: "); maPhong=sc.nextLine();
        System.out.println("Nhập dãy nhà: "); dayNha=sc.nextLine();
        System.out.println("Nhập diện tích: "); dienTich=sc.nextDouble();
        System.out.println("Nhập số bóng đèn: "); soBongDen=sc.nextDouble();
        System.out.println("Nhập số máy chiếu: "); soMayChieu=sc.nextDouble();
    }
    
    @Override
    void xuat() {
        System.out.println(getMaPhong()+"\t"+getDayNha()+"\t"+getDienTich()+"\t"+getSoBongDen()+"\t"+getSoMayChieu()+"\t"+PhongDatChuan());
    }
}