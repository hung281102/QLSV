/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv;

/**
 *
 * @author U.HUZNG11
 */
public class SinhVien extends HocSinh{
    private String tenKhoa;

    public SinhVien() {
    }

    public SinhVien(String tenKhoa, String tenLop, String tenTruong, String id, String hoTen, int namSinh, float diem1, float diem2, float diem3) {
        super(tenLop, tenTruong, id, hoTen, namSinh, diem1, diem2, diem3);
        this.tenKhoa = tenKhoa;
    }

    

    public String getTenKhoa() {
        return tenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        this.tenKhoa = tenKhoa;
    }
    
    public void nghienCuu(){
        System.out.println("Research!!!");
    }
    
    @Override
    public float diemTB(){
        return ((getDiem1() +  getDiem2())* 30 + getDiem3() * 70) / 100;
    }
    
}
