package dota;

public class Weapon {
    String name ;
    int damage;
    String rarity;

    void addDamage(int additionalDamage){
        int plusdamage = this.damage + additionalDamage;
        
        System.out.println("Damage went from " +this.damage + " to " + +plusdamage);

        this.damage = plusdamage;
    }

    String showName(){
        return name;
    }

    String showRarity(){
        return rarity;
    }
}
 