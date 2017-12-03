package cnit325project.bulbappsaur;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class BulbManagerActivity extends AppCompatActivity {

    private BulbGroup allbulbs;
    private JSONClient jsonClient;
    private ScrollView scrollView;
    private Intent login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulbmanager);
        scrollView = (ScrollView) findViewById(R.id.scrollview);
        login = new Intent(this, LoginActivity.class);
    }

    public void OnExitClick(View view)
    {
        startActivity(login);
        finish();
    }
}
