package Caracters;

import Attack.Attacks;

public abstract class Character {
    private String name;
    private String Area;
    private int hp = 100;// when created, can be added more.
    private int fightingPower = 100; // when created, can be added more
    private Attacks attacks;
    private int age;

    public Character(String name, String area, int age) {
        this.name = name;
        this.Area = area;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String area) {
        Area = area;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getFightingPower() {
        return fightingPower;
    }

    public void setFightingPower(int fightingPower) {
        this.fightingPower = fightingPower;
    }

    public Attacks getAttacks() {
        return attacks;
    }

    public void setAttacks(Attacks attacks) {
        this.attacks = attacks;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//Base attacs

    Attacks puch = new Attacks("Punch", 5, 0);
    Attacks kick = new Attacks("Kick", 7, 0);



}
