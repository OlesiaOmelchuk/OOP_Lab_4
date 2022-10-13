package lotr;
import java.util.Random;

public class Noble extends Character{
    public Noble(int min, int max){
        super(new Random().nextInt(max-min) + min, new Random().nextInt(max-min) + min);
    }
    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(getPower()+1));
    }
}
