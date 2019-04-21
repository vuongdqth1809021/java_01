package session_03;

import java.util.Scanner;



    public class Main {

        public static void main(String[] args) {
            HinhChuNhat hinhChuNhat = new HinhChuNhat();


            hinhChuNhat.nhap();


            hinhChuNhat.hienThi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);


            double chuVi = hinhChuNhat.tinhChuVi(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);

            double dienTich = hinhChuNhat.tinhDienTich(hinhChuNhat.chieuDai, hinhChuNhat.chieuRong);

            hinhChuNhat.hienThiChuViVaDienTich(chuVi, dienTich);
        }

    }
