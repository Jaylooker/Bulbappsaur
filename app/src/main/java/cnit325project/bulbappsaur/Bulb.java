package cnit325project.bulbappsaur;

import android.graphics.Color;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by jackb on 11/13/2017.
 */

//Store information for bulb that can be changed
public class Bulb extends JSONHandler{

    //types may need to changed to better fit Hue API
    private int bulbnumber;
    private String status;
    private BulbColor hue;
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
    public BulbColor getHue() {
        return hue;
    }

    public void setHue(BulbColor hue) {
        this.hue = hue;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    //creates string json of class

    public JSONObject toJSON()
    {
        JSONObject jsonObject = new JSONObject();
        String json = "{\n" +
                "Bulb Number: " + this.bulbnumber + "\n" +
                "Status: " + this.status + "\n" +
                "R: " + this.hue.getRed() + "\n" +
                "G: " + this.hue.getGreen() + "\n" +
                "B: " + this.hue.getBlue() + "\n" +
                "Brightness: " + this.brightness + "\n" +
                "}";
        try {
            jsonObject = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }


}
