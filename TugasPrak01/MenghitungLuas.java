import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pilih = input.nextInt();
        
        if (pilih == 1){
            int sisi = input.nextInt();
            System.out.println(persegi(sisi));
            
        }else if (pilih == 2){
            int alas = input.nextInt();
            int tinggi = input.nextInt();
            System.out.println(segitiga(alas, tinggi));
            
        }else if (pilih== 3){
            int jariJari = input.nextInt();
            
            if (jariJari%7 == 0){
                System.out.println(Lingkaran1(jariJari));
            }
            else 
             System.out.println(Lingkaran2(jariJari));
            
        }else 
            System.out.println("Input yang anda masukan tidak sesuai");
        
    }
    
    public static int persegi(int sisi){
        int hasil = sisi*sisi;
        return hasil;
    }
    
    public static int segitiga(int a, int t){
        int hasil = a * t/2;
        return hasil;
    }
    
    public static double Lingkaran1(int r){
        double hasil = 22/7 * r * r;
        return hasil;
    }
    
    public static double Lingkaran2(double r){
        double hasil = 3.14 * r* r;
        int result = (int)hasil; 
        return result;
    }
}