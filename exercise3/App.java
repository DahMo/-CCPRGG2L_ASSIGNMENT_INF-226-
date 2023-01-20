package exercise3;

public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();
        knight.attack();

        System.out.println(" ");

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();
        mage.attack();

        System.out.println(" ");

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();
        thief.attack();
        
        System.out.println(" ");

        Character priest = new Character();

        priest.strength = 3;
        priest.agility = 10;
        priest.intelligence = 8;
        priest.name = "Kerval";
        priest.sayMyName();
        priest.attack();

        System.out.println(" ");

        Weapon sword = new Weapon();
        sword.name = "ExCalibur";
        sword.damage = 100;
        sword.rarity = "Legendary 3";

        Weapon power = new Weapon();
        power.name = "Psychic";
        power.damage = 100;
        power.rarity = "legendary";

        sword.addDamage(100);
        sword.addDamage(100);
        sword.addDamage(100);
        System.out.println();


    }
}
