package cnit325project.bulbappsaur;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BulbManagerActivity extends AppCompatActivity {

    private BulbGroup allbulbs;
    private ListView bulbview;
    private Intent login;
    private ListAdapter bulbadapter;
    private JSONClient jsonClient;
    private LinearLayout llbulb; //for demo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulbmanager);
        //bulbview = (ListView) findViewById(R.id.lvbulbs);
        llbulb = (LinearLayout) findViewById(R.id.llbulb); //for demo
        login = new Intent(this, LoginActivity.class);

        /*
        Intent fromloginactivity = getIntent();
        Client client =  fromloginactivity.getParcelableExtra("client"); //get client from loginactivity
        client = new JSONClient();
        jsonClient = (JSONClient) client; //type cast
        Toast.makeText(getApplicationContext(), jsonClient.toString(), Toast.LENGTH_LONG).show(); //show for debug purposes
        */


        //for testing

        //Bulb b1 = new Bulb (1,"On",new BulbColor(23,45,76), 100);
        //Bulb b2 = new Bulb (2,"Off",new BulbColor(27,98,111), 100);

        //TODO: fix weird bug of null pointer refernece
        //allbulbs.addbulb(b1); //null pointer? //pass by value NOT pass by reference
        //allbulbs.addbulb(b2);

        //allbulbs.setBulbs(client.getBulbGroup().getBulbs()); //get bulbs from client
        //bulbadapter = new ArrayAdapter<Bulb>(this, R.layout.bulb_layout, allbulbs.getBulbs()); //make adapter of all bulbs
        //bulbview.setAdapter(bulbadapter); //set listview to adapater



        /*bulbview.setOnItemClickListener(new AdapterView.OnItemClickListener() { //set on item click method
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Bulb selectedbulb = allbulbs.getBulbs().get(position); //get selected bulb
                BulbDialog bulbDialog = new BulbDialog(); //create dialog
                bulbDialog.show(getSupportFragmentManager(), "BulbDialog"); //display dialog
                if (bulbDialog.isDismissed() && bulbDialog.isOkclicked()) //if dialog gone and ok button clicked, update bulb
                {
                    //get input from user
                    View bulbview = bulbDialog.getBulbview();
                    EditText etred =  bulbview.findViewById(R.id.etred);
                    EditText etgreen = bulbview.findViewById(R.id.etgreen);
                    EditText etblue = bulbview.findViewById(R.id.etblue);
                    EditText etstatus = bulbview.findViewById(R.id.etstatus);
                    EditText etbrightness = bulbview.findViewById(R.id.etbrightness);

                    int red = Integer.parseInt(etred.getText().toString());
                    int green = Integer.parseInt(etgreen.getText().toString());
                    int blue = Integer.parseInt(etblue.getText().toString());
                    String status = etstatus.getText().toString();
                    int brightness = Integer.parseInt(etbrightness.getText().toString());
                    BulbColor bulbColor = new BulbColor(red, green, blue);

                    //set to select bulb from fragment
                    selectedbulb.setBulbColor(bulbColor);
                    selectedbulb.setStatus(status);
                    selectedbulb.setBrightness(brightness);

                     //update view
                    ImageView viewbulb = view.findViewById(R.id.imgbulb);
                    TextView viewstatus = view.findViewById(R.id.txtrowstatus);
                    TextView viewbrightness = view.findViewById(R.id.txtrowbrightness);

                    viewbulb.setColorFilter(bulbColor.toInt(), PorterDuff.Mode.MULTIPLY);
                    viewstatus.setText(status);
                    viewbrightness.setText("Brightness: " + brightness);
                }

            }
        });
        */

        //for demo
        llbulb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Bulb selectedbulb = allbulbs.getBulbs().get(position); //get selected bulb
                BulbDialog bulbDialog = new BulbDialog(); //create dialog
                bulbDialog.show(getSupportFragmentManager(), "BulbDialog"); //display dialog
                //get dialog input from user
                //View bulbview = bulbDialog.getBulbview();
                EditText etred =  (EditText) findViewById(R.id.etred);
                EditText etgreen = (EditText) findViewById(R.id.etgreen);
                EditText etblue = (EditText) findViewById(R.id.etblue);
                EditText etstatus = (EditText) findViewById(R.id.etstatus);
                EditText etbrightness = (EditText) findViewById(R.id.etbrightness);

                /*
                int red = Integer.parseInt(etred.getText().toString());
                int green = Integer.parseInt(etgreen.getText().toString());
                int blue = Integer.parseInt(etblue.getText().toString());
                String status = etstatus.getText().toString();
                int brightness = Integer.parseInt(etbrightness.getText().toString());
                BulbColor bulbColor = new BulbColor(red, green, blue);
                */

                //set to select bulb from fragment
                    /*
                    selectedbulb.setBulbColor(bulbColor);
                    selectedbulb.setStatus(status);
                    selectedbulb.setBrightness(brightness);
                    */

                //update view
                    /*
                    ImageView viewbulb = view.findViewById(R.id.imgbulb);
                    TextView viewstatus = view.findViewById(R.id.txtrowstatus);
                    TextView viewbrightness = view.findViewById(R.id.txtrowbrightness);

                    viewbulb.setColorFilter(bulbColor.toInt(), PorterDuff.Mode.MULTIPLY);
                    viewstatus.setText(status);
                    viewbrightness.setText("Brightness: " + brightness);
                    */

                /*
                ImageView viewbulb =  (ImageView) findViewById(R.id.imgbulbdummy);
                TextView viewstatus =   (TextView) findViewById(R.id.txtrowstatusdummy);
                TextView viewbrightness =  (TextView) findViewById(R.id.txtrowbrightnessdummy);

                viewbulb.setColorFilter(bulbColor.toInt(), PorterDuff.Mode.MULTIPLY);
                viewstatus.setText(status);
                viewbrightness.setText("Brightness: " + brightness);
                */
            }
        });
        //for demo

    }

    public void OnExitClick(View view)
    {
        startActivity(login);
        finish();
    }
}
