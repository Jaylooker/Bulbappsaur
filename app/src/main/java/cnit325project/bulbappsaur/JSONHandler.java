package cnit325project.bulbappsaur;

import android.util.JsonReader;
import android.util.JsonWriter;
import org.json.*;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by jackb on 11/13/2017.
 */

//handles all JSON encoding, decoding, and sending
public class JSONHandler {
    //may need more or less types
    private JSONTokener jsonTokener; //encodes
    private JsonReader jsonReader;
    private JsonWriter jsonWriter;
    private JSONObject object; //decode through methods
    private JSONArray jsonArray;

    //getter and setters
    public JSONTokener getJsonTokener() {
        return jsonTokener;
    }

    public void setJsonTokener(JSONTokener jsonTokener) {
        this.jsonTokener = jsonTokener;
    }

    public JsonReader getJsonReader() {
        return jsonReader;
    }

    public void setJsonReader(JsonReader jsonReader) {
        this.jsonReader = jsonReader;
    }

    public JsonWriter getJsonWriter() {
        return jsonWriter;
    }

    public void setJsonWriter(JsonWriter jsonWriter) {
        this.jsonWriter = jsonWriter;
    }

    public JSONObject getObject() {
        return object;
    }

    public void setObject(JSONObject object) {
        this.object = object;
    }

    public JSONArray getJsonArray() {
        return jsonArray;
    }

    public void setJsonArray(JSONArray jsonArray) {
        this.jsonArray = jsonArray;
    }

    //other methods
    public Bulb parsebulb(JSONObject bulb)
    {
        Bulb objbulb = new Bulb();

        return objbulb;
    }

    public JSONObject encodebulb (Bulb bulb) //requires bean getters and setters: 'is' and 'get'
    {
        JSONObject jsonObject = null;
        try {
            jsonObject = new JSONObject(bulb.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }


}

/*



 */
