/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv;

import java.util.Scanner;

/**
 *
 * @author U.HUZNG11
 */
public class HocSinh extends NguoiHoc{
//    private float diemTB = (this.getDiem1() +  this.getDiem2() + this.getDiem3()) / 3;
    private String tenLop;
    private String tenTruong;

    public HocSinh() {
    }

    public HocSinh(String tenLop, String tenTruong, String id, String hoTen, int namSinh, float diem1, float diem2, float diem3) {
        super(id, hoTen, namSinh, diem1, diem2, diem3);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    

    public String getTenLop() {
        return tenLop;
    }

    public String getTenTruong() {
        return tenTruong;
    }

//    public void setDiemTB(float diemTB) {
//        this.diemTB = diemTB;
//    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public void vuiChoi(){
        System.out.println("Playing!!!");
    }
    
    
    public float diemTB(){
        return (getDiem1() +  getDiem2() + getDiem3()) / 3;
    }
    
    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Classname: ");
        tenLop = sc.nextLine();
        System.out.println("Enter School name: ");
        tenTruong = sc.nextLine();
        
    }
    @Override
    public void output(){
        super.output();
        System.out.printf("TenLop: %s, TenTruong: %s\n", tenLop, tenTruong);
    }
    
}
