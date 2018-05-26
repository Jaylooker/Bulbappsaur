package cnit325project.bulbappsaur;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BulbDialog extends DialogFragment {

    private boolean dismissed;
    private boolean okclicked;
    private View bulbview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        bulbview = inflater.inflate(R.layout.bulb_dialog, container, false);
        okclicked = false;
        dismissed = false;
        getDialog().setTitle("Edit Bulb");
        Button ok = bulbview.findViewById(R.id.btnok);
        Button cancel = bulbview.findViewById(R.id.btncancel);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Add validation
                okclicked = true;
                dismiss(); //close
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                okclicked = false;
                dismiss(); //close
            }
        });
        return bulbview;

    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
        dismissed = true;
    }


    //getters and setters
    public boolean isDismissed() {
        return dismissed;
    }

    public void setDismissed(boolean dismissed) {
        this.dismissed = dismissed;
    }

    public boolean isOkclicked() {
        return okclicked;
    }

    public void setOkclicked(boolean okclicked) {
        this.okclicked = okclicked;
    }

    public View getBulbview() {
        return bulbview;
    }

    public void setBulbview(View bulbview) {
        this.bulbview = bulbview;
    }

    /*
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }
*/
}
