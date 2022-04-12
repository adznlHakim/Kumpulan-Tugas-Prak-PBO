/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumpbo;
import java.util.Scanner;

class Baju {
    String jenis;
    int harga;
    int jumlah;

    public Baju(String a, int b) {
        jenis = a;
        jumlah = b;
    }

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void hargaa() {
        harga = bajua;
        if (jumlah > 100)
            harga -= 5000;
    }

    void hargab() {
        harga = bajub;
        if (jumlah > 100)
            harga -= 5000;
    }

    void hargac() {
        harga = bajuc;
        if (jumlah > 100)
            harga -= 15000;
    }

    void display() {
        if (jenis.equalsIgnoreCase("a"))
            hargaa();
        else if (jenis.equalsIgnoreCase("b"))
            hargab();
        else if (jenis.equalsIgnoreCase("c"))
            hargac();
        System.out.println("Jenis yang anda beli: "+ jenis);
        System.out.println("Harga per buah      : "+ harga);
        System.out.println("Total harga         : "+ harga*jumlah);
    }
}

public class MainBaju {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Baju yang tersedia :");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String x = input.next();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        int y = input.nextInt();
        
        Baju baju = new Baju(x,y);
        baju.display();
    }
}
