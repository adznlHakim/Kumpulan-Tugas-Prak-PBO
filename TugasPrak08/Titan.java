package TugasPrak08;

public class Titan extends Character{
    private int defense;
    private int attack;
    private int HP;

    Titan(int defense, int attack, int HP){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    public boolean attack(){
        double hit = Math.random();
        if(hit < 0.40) {
            return true;
        }
        return false;
    }
    public void receiveDamage(Character karakter) {
        super.receiveDamage(karakter);
    }
    public void info(){
        System.out.println("=========== MUSUH ===========");
        super.info();
    }
}
