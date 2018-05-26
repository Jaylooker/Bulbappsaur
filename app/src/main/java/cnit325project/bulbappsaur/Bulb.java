package cnit325project.bulbappsaur;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jackb on 11/13/2017.
 */

//Store information for bulb that can be changed
public class Bulb /*extends JSONHandler*/{

    //types may need to changed to better fit Hue API
    private int bulbnumber;
    private String status;
    private BulbColor bulbcolor;
    private int brightness;

    //getters and setters
    public int getBulbnumber() {
        return bulbnumber;
    }

    public void setBulbnumber(int bulbnumber) {
        this.bulbnumber = bulbnumber;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public BulbColor getBulbcolor() {
        return bulbcolor;
    }

    public void setBulbColor(BulbColor bulbcolor) {
        this.bulbcolor = bulbcolor;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    //creates string json of class
    //will be replaced by Jackson library
    /*
    public JSONObject toJSON()
    {
        JSONObject jsonObject = new JSONObject();
        String json = "{\n" +
                "Bulb Number: " + this.bulbnumber + "\n" +
                "Status: " + this.status + "\n" +
                "R: " + this.bulbcolor.getRed() + "\n" +
                "G: " + this.bulbcolor.getGreen() + "\n" +
                "B: " + this.bulbcolor.getBlue() + "\n" +
                "Brightness: " + this.brightness + "\n" +
                "}";
        try {
            jsonObject = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
    */

    //constructors
    public Bulb()
    {

    }
    
    public Bulb(int num, String stat, BulbColor color, int bright)
    {
        this.bulbnumber = num;
        this.status = stat;
        this.bulbcolor = color;
        this.brightness = bright;
    }




}
