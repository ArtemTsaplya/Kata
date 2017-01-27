package squareRoot;

import java.util.Random;

/**
 * Created by Artem on 27.01.2017.
 */
public class RandomNumberFromOneToTen {
    private static Random random = new Random();

    public int getRandomNumber() {
        int result;
        do {
            result = random.nextInt(7);
        }
        while (result == 0);
        return result;
    }
}
