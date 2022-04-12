package java;

import java.io.*;
import java.util.*;

class persegi{
    persegi(){

    }
    void hitung1(int s){
        int luasPersegi = s*s;
        System.out.println(luasPersegi);
    }
}

class segitiga{
    segitiga(){

    }
    void hitung2(int a, int t){
        int luasSegitiga = a*t/2;
        System.out.println(luasSegitiga);
    }
}

class lingkaran{
    lingkaran (){

    }
    void hitung3(double jariJari){
        if(jariJari%7 ==0){
            double hasil = 22/7 * jariJari * jariJari;
            System.out.println(hasil);
        } else {
            double hasil = 3.14 * jariJari * jariJari;
            int result = (int)hasil;
            System.out.println((double)result);
        }
    }

}

public class TugasPrak02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        persegi bgn1 = new persegi();
        segitiga bgn2 = new segitiga();
        lingkaran bgn3 = new lingkaran();

        int masukan = input.nextInt();
        if (masukan == 1){
            int sisi = input.nextInt();
            bgn1.hitung1(sisi);

        }else if (masukan == 2){
            int alas = input.nextInt();
            int tinggi = input.nextInt();
            bgn2.hitung2(alas,tinggi);

        }else if (masukan == 3){
            int jariJari = input.nextInt();
            bgn3.hitung3(jariJari);

        }else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
        
    }
}