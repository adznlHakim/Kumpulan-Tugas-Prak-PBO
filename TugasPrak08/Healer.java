package TugasPrak08;

public class Healer extends Character{
    private int defense;
    private int attack;
    private int HP;

    Healer(int defense, int attack, int HP){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }

    public boolean attack(){
        double hit = Math.random();
        if(hit < 0.85) {
            return true;
        }
        return false;
    }

    public void Heal(){
        this.setHp(this.getHp()+25);
        System.out.println("Menggunakan skill heal");
    }

    public int getHp(){
        return this.HP;
    }
    public void setHp(int HP){
        System.out.println(this.HP);
    }

    public void receiveDamage(Character karakter) {
        super.receiveDamage(karakter);
    }

    public void info(){
        System.out.println("=========== PLAYER ===========");
        super.info();
    }

}
