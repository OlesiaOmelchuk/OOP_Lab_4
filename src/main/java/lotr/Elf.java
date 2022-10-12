package lotr;

public class Elf extends Character{
    public Elf(){
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if(c.getPower() < getPower()){
            c.setHp(0);
        }else{
            c.setPower(c.getPower()-1);
        }
    }

    @Override
    public String toString() {
        return "Elf{" +
                "hp=" + getHp() +
                ", power=" + getPower() +
                '}';
    }
}
