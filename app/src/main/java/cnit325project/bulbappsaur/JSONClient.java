package cnit325project.bulbappsaur;

import android.graphics.Color;
import android.os.Parcel;
import android.support.design.widget.Snackbar;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by jackb on 11/13/2017.
 */

public class JSONClient extends Client {
    private JSONHandler jsonHandler = new JSONHandler();
    private Bulb bulb;
    private BulbGroup bulbGroup;
    private int red;
    private int green;
    private int blue;
    @Override
    public void connect(String url, int portnum) {
        super.connect(url, portnum);
        try
        {
            Socket s = new Socket(url,portnum);
            try
            {
                InputStream inStream = s.getInputStream();
                OutputStream outStream = s.getOutputStream();
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outStream, "UTF-8");
                InputStreamReader inputStreamReader = new InputStreamReader(inStream, "UTF-8");
                jsonHandler.setJsonWriter(new JsonWriter(outputStreamWriter)); //to server
                jsonHandler.setJsonReader(new JsonReader(inputStreamReader)); //from server
                JsonReader jsonReader = jsonHandler.getJsonReader();
                JsonWriter jsonWriter = jsonHandler.getJsonWriter();

                boolean connected = true;
                do //do once
                {

                    jsonReader.beginArray();  //get server array json
                    while (jsonReader.hasNext())
                    {
                        jsonReader.beginObject();
                        while(jsonReader.hasNext())
                        {
                            String name = jsonReader.nextName();
                            switch(name)
                            {
                                case "Bulb Number": bulb.setBulbnumber(jsonReader.nextInt());
                                    break;
                                case "Status": bulb.setStatus(jsonReader.nextString());
                                    break;
                                case "R": red = jsonReader.nextInt();
                                    break;
                                case "G": green = jsonReader.nextInt();
                                    break;
                                case "B": blue = jsonReader.nextInt();
                                    break;
                                case "Brightness": bulb.setBrightness(jsonReader.nextInt());
                                    break;
                            }
                        }
                        BulbColor bulbColor = new BulbColor(red, green, blue);
                        bulb.setHue(bulbColor);
                        jsonReader.endObject();
                        Log.i("Bulb", bulb.toString()); //log
                        bulbGroup.addbulb(bulb);
                    }
                    jsonHandler.getJsonReader().endArray();
                    //get client input
                     //send to server
                    // get input from server
                    //print server input
                    if (bulb.getBulbnumber() == -1) //end json when bulb number sent
                    {
                        connected = false;
                    }
                } while(connected); //receiving input
            }
            finally
            {
                s.close();
            }
        }
        catch(IOException ioexc)
        {
            ioexc.printStackTrace();
        }
    }

}
