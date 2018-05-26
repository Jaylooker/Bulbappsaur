package cnit325project.bulbappsaur;

import android.graphics.Color;

/**
 * Created by jackb on 12/4/2017.
 */

public class BulbColor {
    private int red;
    private int blue;
    private int green;

    //getters and setters
    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    //to int
    public int toInt()
    {
        int color;
        color = Color.rgb(this.red, this.green, this.blue);
        return color;

    }

    //constructors
    public BulbColor() {

    }

    public BulbColor(int red, int blue, int green) {
        this.red = red;
        this.blue = blue;
        this.green = green;
    }
}
