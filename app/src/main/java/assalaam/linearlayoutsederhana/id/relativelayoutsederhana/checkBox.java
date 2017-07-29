package assalaam.linearlayoutsederhana.id.relativelayoutsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class checkBox extends AppCompatActivity implements OnCheckedChangeListener{

    CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cb=(CheckBox) findViewById(R.id.check);
        cb.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            if (isChecked){
                cb.setText("CheckBox Ini : Dicentang!");
            }
            else {
                cb.setText("CheckBox Ini : Tidak Dicentang!");
            }
        }
    }

