package assalaam.linearlayoutsederhana.id.relativelayoutsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class radioButton extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

        RadioGroup orientation;
        RadioGroup gravity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        orientation=(RadioGroup) findViewById(R.id.orientation);
        orientation.setOnCheckedChangeListener(this);
        gravity=(RadioGroup) findViewById(R.id.gravity);
        gravity.setOnCheckedChangeListener(this);
    }
    
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
        switch (checkId){
            case R.id.horizontal:
                orientation.setOrientation(LinearLayout.HORIZONTAL);
                break;
            case R.id.vertical:
                orientation.setOrientation(LinearLayout.VERTICAL);
            case R.id.kiri:
                orientation.setGravity(Gravity.LEFT);
                break;
            case R.id.kanan:
                orientation.setGravity(Gravity.RIGHT);
                break;
            case R.id.tengah:
                orientation.setGravity(Gravity.CENTER);
        }
    }
}
