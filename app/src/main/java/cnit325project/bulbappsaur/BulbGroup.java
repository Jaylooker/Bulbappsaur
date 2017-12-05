package cnit325project.bulbappsaur;

import java.util.ArrayList;

/**
 * Created by jackb on 11/13/2017.
 */
//Will allow the ability to change multiple bulbs at once
public class BulbGroup {
    private ArrayList<Bulb> bulbs;
    //getters and setters
    public ArrayList<Bulb> getBulbs() {
        return bulbs;
    }

    public void setBulbs(ArrayList<Bulb> bulbs) {
        this.bulbs = bulbs;
    }

    public void addbulb (Bulb bulb)
    {
        bulbs.add(bulb);
    }


}
