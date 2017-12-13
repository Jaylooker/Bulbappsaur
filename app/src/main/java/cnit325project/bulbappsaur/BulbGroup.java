package cnit325project.bulbappsaur;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by jackb on 11/13/2017.
 */
//Will allow the ability to change multiple bulbs at once
public class BulbGroup { //could possibly make inheritance
    private ArrayList<Bulb> bulbs;
    //getters and setters
    public ArrayList<Bulb> getBulbs() {
        return bulbs;
    }

    public void setBulbs(ArrayList<Bulb> bulbs) {
        this.bulbs = bulbs;
    }

    //other methods
    public void addbulb (Bulb bulb)
    {
        if (bulb != null)
        {
            this.bulbs.add(bulb);
        }
    }

    //constructors
    public BulbGroup ()
    {
        bulbs = new ArrayList<Bulb>();
    }


}
