package importantJava;

import java.util.Random;

public class diceRoller {
    Random random;
    int number;
    diceRoller(){
        random = new Random();
        roll();
    }
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}

