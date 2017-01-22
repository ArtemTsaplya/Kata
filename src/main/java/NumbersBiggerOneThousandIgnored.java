/**
 * Created by Artem on 22.01.2017.
 */
public class NumbersBiggerOneThousandIgnored {

    public static int getIgnoredNumber(int  intNumber){
        if (intNumber >= 1000){
            intNumber = 0;
        }
        return intNumber;
    }
}
