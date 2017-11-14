package cnit325project.bulbappsaur;

import java.sql.Array;
import java.util.ArrayList;

/**
 * Created by jackb on 11/13/2017.
 */
//Handling storing and playing loops
//Intending to thread looping
public class BulbLoop extends Thread{
    private ArrayList<String> sequence; //not sure which type is best so maybe delimited strings

    //getters and setters
    public ArrayList<String> getSequence() {
        return sequence;
    }

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

    public void loop() //may be replaced by overwritten .run()
    {

    }
}
