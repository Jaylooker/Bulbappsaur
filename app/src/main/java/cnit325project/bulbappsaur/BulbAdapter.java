package cnit325project.bulbappsaur;

import android.content.Context;
import android.graphics.PorterDuff;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by jackb on 12/12/2017.
 */

//used to convert Bulbs into bulb_layout views
public class BulbAdapter extends ArrayAdapter<Bulb> {
    public BulbAdapter(Context context, ArrayList<Bulb> bulbs) {
        super(context, 0, bulbs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Bulb b = getItem(position); // get bulb
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.bulb_layout, parent, false);
        }
        //get references
        ImageView viewbulb =  convertView.findViewById(R.id.imgbulb);
        TextView viewstatus =  convertView.findViewById(R.id.txtrowstatus);
        TextView viewbrightness = convertView.findViewById(R.id.txtrowbrightness);
        //set layout items to bulb values
        viewbulb.getDrawable().setColorFilter(b.getBulbcolor().toInt(), PorterDuff.Mode.SRC_ATOP);
        viewstatus.setText(b.getStatus());
        viewbrightness.setText("Brightness: " + b.getBrightness());
        return convertView;
    }
}
