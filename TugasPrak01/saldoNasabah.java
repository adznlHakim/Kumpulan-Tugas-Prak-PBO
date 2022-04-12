import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int saldo = input.nextInt();
        int setoran = input.nextInt();
        
        int jumlah = saldo + setoran;
        double sisa = biaya(jumlah);
        
        System.out.println(sisa);
    
    }
     static double biaya(double total){
        double b = total - 7000;
        double bonus = b * 0.0005;
        double hasil = b + bonus;
        return hasil;
    }
}