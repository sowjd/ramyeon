import java.io.FileReader;
import java.util.ArrayList;

public class DefaultRamyeon extends Ramyeon {

    public DefaultRamyeon() {
        setWater(500);
        setSoupPowder(100);
        setTimeToBoil(2);
    }

    public void putSoupPowder() {
        System.out.println("Put whole soup powder.");
    }

    public void cook() {
        putWaterAndBoil();
        put("noodle");
        putSoupPowder();
        boilWater();
        finish();
    }
}
