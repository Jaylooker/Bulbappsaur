package cnit325project.bulbappsaur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

public class BulbManagerActivity extends AppCompatActivity {

    private BulbGroup allbulbs;
    private JSONClient jsonClient;
    private ListView bulbview;
    private Intent login;
    private ListAdapter bulbadapter;
    private JSONClient client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulbmanager);
        bulbview = (ListView) findViewById(R.id.lvbulbs);
        login = new Intent(this, LoginActivity.class);

        Intent fromloginactivity = getIntent();
        client =  fromloginactivity.getParcelableExtra("client"); //get client from loginactivity
        Toast.makeText(getApplicationContext(), client.toString(), Toast.LENGTH_LONG).show(); //show for debug purposes

        //allbulbs.setBulbs(); //get bulbs from client
        bulbadapter = new ArrayAdapter<Bulb>(this, R.layout.bulb_layout, allbulbs.getBulbs()); //make adapter of all bulbs
        bulbview.setAdapter(bulbadapter); //set listview to adapater

        bulbview.setOnItemClickListener(new AdapterView.OnItemClickListener() { //set on item click method
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Bulb selectedbulb = allbulbs.getBulbs().get(position); //get selected bulb
                BulbDialog bulbDialog = new BulbDialog(); //set to select bulb
                //bulbDialog.show(getSupportFragmentManager(), "bulbdialog"); //display dialog
            }
        });

    }

    public void OnExitClick(View view)
    {
        startActivity(login);
        finish();
    }
}
