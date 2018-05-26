package cnit325project.bulbappsaur;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by jackb on 11/13/2017.
 */
//Handling storing and playing loops
//Intending to thread looping
public class BulbLoop extends Thread{
    private ArrayList<String> sequence; //not sure which type is best so maybe delimited strings
    private boolean repeat;
    private File data;

    //constructors
    public BulbLoop(ArrayList<String> sequence, boolean repeat, File data) {
        this.sequence = sequence;
        this.repeat = repeat;
        this.data = data;
    }

    //getters and setters
    public ArrayList<String> getSequence() {
        return sequence;
    }

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }

    //other methods
    @Override
    public void run() {
        if(data == null) {
            return;
        }
        loop(data, repeat);
    }

    /*
    Stream reads file values into data structures for use in color loop
     */
    private void loop(File file, boolean repeat)
    {
        // TODO: 5/26/2018 Figure out how the data will be structured. CSV?
    }
}
