package tugasprak04;
import java.util.Scanner;

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant temp[] = new Merchant[merc.length + 1];
        for (int i = 0; i < merc.length + 1; i++) {
            if (i == merc.length)
                temp[i] = merchant;
            else
                temp[i] = merc[i];
        }
        return temp;
    }

    public static void tampilData(){
        for (Merchant mch1 : merc) {
            System.out.println("===Tampilan Data Merchant UBFood===");
            System.out.println("Nama Merchant   : " + mch1.getNamaMerchant());
            System.out.println("Nama Produk     : " + mch1.getNamaProduk());
            System.out.println("Harga           : " + (int)mch1.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String nama){
        for (Merchant merchant : merc) {
            if (merchant.getNamaMerchant().equalsIgnoreCase(nama))
                return merchant;
        }
        return null;
    }

    public static void tampilMerchant(Merchant merchant){
        System.out.println("==== Tampilan Data Merchant UB Food =====");
        System.out.println("Nama Merhcant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + merchant.getHargaMakanan());
    }

    public static void updateMerchant(Merchant merchant){

    }
}
