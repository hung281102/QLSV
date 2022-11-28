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
public class NguoiHoc {

    private String id;
    private String hoTen;
    private int namSinh;
    private float diem1;
    private float diem2;
    private float diem3;

    public NguoiHoc() {
    }

    public NguoiHoc(String id, String hoTen, int namSinh, float diem1, float diem2, float diem3) {
        this.id = id;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public float getDiem1() {
        return diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    public void hocTap() {
        System.out.println("Styding!!!");
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID: ");
        id = sc.nextLine();

        System.out.println("Enter Fullname: ");
        hoTen = sc.nextLine();

        System.out.println("Enter Year of Birth: ");
        namSinh = sc.nextInt();

        System.out.println("Enter score 1: ");
        diem1 = sc.nextFloat();

        System.out.println("Enter score 2: ");
        diem2 = sc.nextFloat();
        System.out.println("Enter score 3: ");
        diem3 = sc.nextFloat();
    }

    public void output() {
        System.out.printf("\n ID: %s, HoTen: %s, NamSinh: %d, Diem1: %f, Diem2: %f, Diem3: %f, ", id,hoTen, namSinh, diem1, diem2, diem3);
    }
}
