/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsv;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author U.HUZNG11
 */
public class Entry {

    static Scanner sc = new Scanner(System.in);

    static void showMenu() {
        System.out.println("===========Menu===========");
        System.out.println("1. Nhap thong tin sinh vien");
        System.out.println("2. Nhap thong tin hoc sinh");
        System.out.println("3. In danh sach sinh vien");
        System.out.println("4. In danh sach hoc sinh");
        System.out.println("5. In sinh vien theo id");
        System.out.println("6. In hoc sinh theo id");
        System.out.println("7. Sua thong tin sinh vien theo id");
        System.out.println("8. Sua thong tin hoc sinh theo id");
        System.out.println("9. -> Thoat");
    }

    public static void main(String[] args) {
//        ArrayList<HocSinh> dsHocSinh = new ArrayList<>();
//        ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
//
//        int choose;
//        do {
//            showMenu();
//            System.out.println("Nhap lua chon: ");
//            choose = sc.nextInt();
//            switch (choose) {
//                case 1:
//                    inputSv(dsSinhVien);
//                    break;
//                case 2:
//                    inputHs(dsHocSinh);
//                    break;
//                case 3:
//                    if(dsSinhVien.isEmpty()){
//                        System.out.println("Danh sach sinh vien rong!!!");
//                    }
//                    outputSv(dsSinhVien);
//                    break;
//                case 4:
//                    if(dsHocSinh.isEmpty()){
//                        System.out.println("Danh sach hoc sinh rong!!!");
//                    }
//                    outputHs(dsHocSinh);
//                    break;
//                case 5:
//                    searchSv(dsSinhVien);
//                    break;
//                case 6: 
//                    searchHs(dsHocSinh);
//                    break;
//                case 7: 
//                    
//                case 9: 
//                    break;
//                default:
//                    System.out.println("Nhap lai: ");
//                    break;
//            }
//        } while (choose < 9);

        HocSinh hs1 = new HocSinh("AT1B", "KMA", "1", "Nguyen Van A", 2002, 9, 9, 9);
        System.out.println(hs1.diemTB());
        
        SinhVien sv1 = new SinhVien("IT", "AT17", "KMA", "1", "Tran Van A", 2002, 8, 7, 7);
//        System.out.println(sv1.diemTB());
    }

    static void inputSv(ArrayList<SinhVien> dsSinhVien) {
        System.out.println("Nhap so sinh vien can them: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.input();
            dsSinhVien.add(sv);
        }
    }

    static void inputHs(ArrayList<HocSinh> dsHocSinh) {
        System.out.println("Nhap so hoc sinh can them: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            HocSinh hs = new HocSinh();
            hs.input();
            dsHocSinh.add(hs);
        }
    }

    static void outputSv(ArrayList<SinhVien> dsSinhVien) {
        System.out.println("Danh sach sinh vien: ");
        for (SinhVien sv : dsSinhVien) {
            sv.output();
        }
    }

    static void outputHs(ArrayList<HocSinh> dsHocSinh) {
        System.out.println("Danh sach hoc sinh: ");
        for (HocSinh hs : dsHocSinh) {
            hs.output();
        }
    }
    
    static void searchSv(ArrayList<SinhVien> dsSinhVien){
        System.out.println("Nhap ID sinh vien can tim: ");
        String msv = sc.nextLine();
        boolean isFind = false;
        
        for(SinhVien sv : dsSinhVien){
            if(sv.getId().equals(msv)){
                sv.output();
                isFind = true;
                break;
            }
        }
        
        if(isFind == false){
            System.out.println("Khong tim thay sinh vien");
        }
    }
    
    static void searchHs(ArrayList<HocSinh> dsHocSinh){
        System.out.println("Nhap ID hoc sinh can tim: ");
        String mhs = sc.nextLine();
        
        boolean isFind = false;
        
        for(HocSinh hs: dsHocSinh){
            if(hs.getId().equals(mhs)){
                hs.output();
                isFind = true;
                break;
            }
        }
        
        if(isFind == false){
            System.out.println("Khong tim thay hoc sinh");
        }
    }
}
