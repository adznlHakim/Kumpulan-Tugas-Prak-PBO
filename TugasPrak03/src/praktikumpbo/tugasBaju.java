/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo;
import java.util.Scanner;

class BAJU {

    private final int baju_a;
    private final int baju_b;
    private final int baju_c;
    private int harga;
    static String jenisBaju;
    static int jumlahBaju;

    BAJU(){
        if (jumlahBaju <= 100){
            this.baju_a = 100000;
        } else {
            this.baju_a = 95000;
        }

        if (jumlahBaju <= 100){
            this.baju_b = 125000;
        } else {
            this.baju_b = 120000;
        }

        if (jumlahBaju <= 100){
            this.baju_c = 175000;
        } else {
            this.baju_c = 160000;
        }
    }

    void harga_a(){
        this.harga = this.baju_a;
    }

    void harga_b(){
        this.harga = this.baju_b;
    }

    void harga_c(){
        this.harga = this.baju_c;
    }

    void dsiplay(){
        if (jenisBaju.equalsIgnoreCase("A")){
            this.harga_a();
        } else if (jenisBaju.equalsIgnoreCase("B")){
            this.harga_b();
        } else if (jenisBaju.equalsIgnoreCase("C")){
            this.harga_c();
        }
        System.out.println("Jenis yang anda beli : " + BAJU.jenisBaju);
        System.out.println("Harga per buah       : " + this.harga);
        System.out.println("Total harga          : " + this.harga * BAJU.jumlahBaju);
    }
}

public class tugasBaju {
    public static void main(String[] args) {
        String jenis;
        int jumlah;

        Scanner shoot = new Scanner(System.in);

        displayBaju();

        System.out.print("Baju yang akan anda beli bertipe : ");
        jenis = shoot.next();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        jumlah = shoot.nextInt();

        BAJU.jenisBaju = jenis;
        BAJU.jumlahBaju = jumlah;

        BAJU bajuErigo = new BAJU();
        bajuErigo.dsiplay();
    }

    private static void displayBaju(){
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
    }
}
