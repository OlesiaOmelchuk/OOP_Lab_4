package lotr;

import java.util.Random;

public class Knight extends Character{
    public Knight(){
        super(new Random().nextInt(11) + 5, new Random().nextInt(11) + 5);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(getPower()+1));
    }
}
