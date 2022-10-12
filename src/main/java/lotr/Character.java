package lotr;

import static java.lang.Math.max;

abstract public class Character {
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = max(hp, 0);
    }

    private int power;
    private int hp;
    Character(int power, int hp){
        setHp(hp);
        setPower(power);
    }
    public boolean isAlive(){
        return getHp() > 0;
    }
    public abstract void kick(Character c);
}
