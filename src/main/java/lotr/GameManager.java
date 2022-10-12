package lotr;

public class GameManager {
    void fight(Character c1, Character c2){
        int turn = 1;
        while(true){
            if(turn == 1){
                if(c1.getHp() <= 0){
                    System.out.println("First character is dead");
                    return;
                }
                c1.kick(c2);
                System.out.println("Second character has " + c2.getHp() + " hp left");
                turn = 2;
            }else{
                if(c2.getHp() <= 0) {
                    System.out.println("Second character is dead");
                    return;
                }
                c2.kick(c1);
                System.out.println("First character has " + c1.getHp() + " hp left");
                turn = 1;
            }
        }
    }
}
