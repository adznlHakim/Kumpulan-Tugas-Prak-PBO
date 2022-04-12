package tugasprak04;

public class Main {

    public static void main(String[] args) {
        String namaMerchant;
        String namaProduk;
        double hargaMakanan;

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        for (int i = 0; i < 1; i++) {

            System.out.print("Nama Merchant: ");
            namaMerchant = DataMerchant.in.nextLine();

            System.out.print("Nama Produk: ");
            namaProduk = DataMerchant.in.nextLine();

            System.out.print("Harga Makanan: ");
            hargaMakanan = DataMerchant.in.nextDouble();

            DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, hargaMakanan));
        }

        DataMerchant.tampilData();
    }
   
}
