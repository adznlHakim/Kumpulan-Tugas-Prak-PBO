package TugasPrak08;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Magician magician;
        Healer healer;
        Warrior warrior;
        Titan monster = new Titan(0, 45, 200);

        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        int pilihan = 0;

        System.out.println("Silahkan pilih karakter yang anda inginkan:");
        System.out.println("1. Magician");
        System.out.println("2. Healer");
        System.out.println("3. Warrior");

            do {
                try {
                    System.out.print(" ");
                    pilihan = input.nextInt();
                    if (pilihan < 1 || pilihan > 3) throw new NumberFormatException();
                } catch (Exception e) {
                    if(e instanceof NumberFormatException) {
                        System.out.println("Silahkan masukan angka 1 - 3");
                        input.next();
                    }
                    else{
                        System.err.println("Tolong masukkan angka !!!");
                        input.next();
                    }
                }

            } while (pilihan == 0);
            System.out.println("Selamat datang, " + nama + " !");

            switch (pilihan) {
                case 1:
                    int m = 1;
                    magician = new Magician(10, 60, 100);
                    magician.info();

                    while (magician.getHp() != 0 && monster.getHp() != 0) {
                        System.out.println("==============" + " TURN " + m + " ==============");

                        if (magician.attack()) {
                            monster.receiveDamage(magician.getAttack());
                        }
                        if (monster.attack()) {
                            magician.receiveDamage(monster.getAttack());
                        }
                        System.out.println("Enemy's HP\t: " + monster.getHp());
                        System.out.println(nama + "'s HP\t: " + magician.getHp());
                        m++;
                    }

                    System.out.println("====================================");
                    if (monster.getHp() == 0) {
                        System.out.println(nama + " menang\n");
                    }
                    if (magician.getHp() == 0) {
                        System.out.println("Titan menang\n");
                    }

                    magician.info();
                    System.out.println();
                    monster.info();
                    break;

                case 2:
                    int h = 1;
                    healer = new Healer(10, 10, 70);
                    healer.info();

                    while (healer.getHp() != 0 && monster.getHp() != 0) {
                        System.out.println("==============" + " TURN " + h + " ==============");
                        if (h % 2 == 0) {
                            healer.Heal();
                        }
                        if (healer.attack()) {
                            monster.receiveDamage(healer.getAttack());
                        }
                        if (monster.attack()) {
                            healer.receiveDamage(monster.getAttack());
                        }
                        System.out.println("Enemy's HP\t: " + monster.getHp());
                        System.out.println(nama + "'s HP\t: " + healer.getHp());
                        h++;
                    }

                    System.out.println("====================================");
                    if (monster.getHp() == 0) System.out.println(nama + " menang\n");
                    if (healer.getHp() == 0) System.out.println("Titan menang\n");
                    healer.info();
                    System.out.println();
                    monster.info();
                    break;

                case 3:
                    int w = 1;
                    warrior = new Warrior(30, 25, 80);
                    warrior.info();

                    while (warrior.getHp() != 0 && monster.getHp() != 0) {
                        System.out.println("==============" + " TURN " + w + " ==============");
                        if (warrior.attack()) {
                            monster.receiveDamage(warrior.getAttack());
                        }
                        if (monster.attack()) {
                            warrior.receiveDamage(monster.getAttack());

                        }
                        System.out.println("Enemy's HP\t: " + monster.getHp());
                        System.out.println(nama + "'s HP\t: " + warrior.getHp());
                        w++;
                    }

                    System.out.println("====================================");
                    if (monster.getHp() == 0) System.out.println(nama + " menang\n");
                    if (warrior.getHp() == 0) System.out.println("Titan menang\n");
                    warrior.info();
                    System.out.println();
                    monster.info();
                    break;
            }
    }
}
