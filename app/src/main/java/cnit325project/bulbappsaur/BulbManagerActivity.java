package cnit325project.bulbappsaur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BulbManagerActivity extends AppCompatActivity {

    private BulbGroup allbulbs;
    private JSONClient jsonClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulbmanager);
    }
}
