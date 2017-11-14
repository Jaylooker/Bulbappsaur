package cnit325project.bulbappsaur;

import android.util.JsonReader;
import android.util.JsonWriter;

import org.json.JSONObject;

/**
 * Created by jackb on 11/13/2017.
 */

//handles all JSON encoding, decoding, and sending
public class JSONHandler {
    //may need more or less types
    private JsonReader jsonReader;
    private JsonWriter jsonWriter;
    private JSONObject object;
}
