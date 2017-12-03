package cnit325project.bulbappsaur;

import android.graphics.Color;

/**
 * Created by jackb on 11/13/2017.
 */

//Store information for bulb that can be changed
public class Bulb extends JSONHandler{
    //types may need to changed to better fit Hue API
    private Color hue; //TODO: make color xyz and not rgb
    private int saturation;
    private int brightness;
    private boolean power;

    //getters and setters
    public Color getHue() {
        return hue;
    }

    public void setHue(Color hue) {
        this.hue = hue;
    }

    public int getSaturation() {
        return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
    //creates string json of class
    /*
    public String toJSON()
    {
        String json = ;
        return json;
    }
    */

}
