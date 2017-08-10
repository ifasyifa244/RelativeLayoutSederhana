package assalaam.linearlayoutsederhana.id.relativelayoutsederhana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button linear =(Button) findViewById(R.id.linear);
        linear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), LinearLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button relative =(Button) findViewById(R.id.relative);
        relative.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button auto =(Button) findViewById(R.id.auto);
        auto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), AutoComplete.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button table =(Button) findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), LayoutTable.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button image =(Button) findViewById(R.id.image);
        image.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), ImageAndroid.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button dialog =(Button) findViewById(R.id.dialog);
        dialog.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), DialogBox.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button call =(Button) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), CallActivity.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button call2 =(Button) findViewById(R.id.call2);
        call2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), CallActivity2.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button checkbox =(Button) findViewById(R.id.checkbox);
        checkbox.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), checkBox.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button button =(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), radioButton.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button picker =(Button) findViewById(R.id.picker);
        picker.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), Picker.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button list =(Button) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), selectionWidget.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button music =(Button) findViewById(R.id.music);
        music.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PlayingAudio.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button calculator =(Button) findViewById(R.id.calculator);
        calculator.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), CalculatorBeratBadan.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button webView =(Button) findViewById(R.id.webView);
        webView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), Web_View.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
