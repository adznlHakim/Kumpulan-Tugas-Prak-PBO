package TugasPrak05;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        int age = input.nextInt();
        String phone = input.next();

        CarRider seto = new CarRider("Seto Aji", 44, "08934511117");
        CarRider wibowo = new CarRider("Catur Wibowo", 32, "08125574834");
        CarRider andre = new CarRider("Andre Subekti", 27, "086881110000");
        CarRider random = new CarRider(name, age, phone);

    CarData data = new CarData();
    data.addCar("KIJANG LGX", "AE 1414 KU", "TOYOTA");
    data.addCar("XPANDER", "AG 4715 KCE", "MITSUBISHI");
    data.addCar("JAZZ", "N 9573 ER", "HONDA");
    data.addCar("ERTIGA", "B 7445 CK", "SUZUKI");

    data.listOfCar();

    RentArchive simpan = new RentArchive();
    simpan.Rent(seto, data.carList.get(1), 9);
    simpan.Rent(wibowo, data.carList.get(3), 3);
    simpan.Rent(andre, data.carList.get(1), 2);
    simpan.Rent(random,data.carList.get(2),5);

        System.out.println("");
        simpan.info();
    }
}
