package fathi.tuto;

abstract class Enemy {
    int health;
    int attack;
    int defense;

    protected Enemy(int hp, int att, int def) {
        health = hp;
        attack = att;
        defense = def;

    }

}
