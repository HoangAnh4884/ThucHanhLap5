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
        PhongHoc_Bai1 ph = new PhongHoc_Bai1();
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
            case 1: {                                break; }
            case 2: {                               break; }
            case 3: {                                 break; }
            case 4: {                                 break; }
            case 5: {                                   break; }
            case 6: {                                break; }
            //...
            default: System.out.println("\nKhông có lựa chọn này\n"); break; 
        }
    }
    while(Chon!=0);
        System.out.println("\n\t\tCảm ơn bạn đã dùng chương trình này");
        System.out.println("\n\t\tChúc bạn một ngày tốt lành <(^w^)>");
    }
}