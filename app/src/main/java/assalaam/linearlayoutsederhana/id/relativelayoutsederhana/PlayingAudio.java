package assalaam.linearlayoutsederhana.id.relativelayoutsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.io.IOException;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Button;

public class PlayingAudio extends AppCompatActivity {


    ImageButton play;
    Button btnPause;
    Button btnStop;
    TextView keterangan;
    MediaPlayer mp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing_audio);

        keterangan=(TextView) findViewById(R.id.ket);
        keterangan.setText("Silahkan Klik Tombol Play");
        btnPause = (Button) findViewById(R.id.btnPAUSE);
        btnStop = (Button) findViewById(R.id.btnSTOP);
        play=(ImageButton) findViewById(R.id.playmusic);
            stateAwal();
        play.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                play.setEnabled(false);
                btnPause.setEnabled(true);
                btnStop.setEnabled(true);
                keterangan.setText("Tombol Play Tidak Akitf");

                go();
            }


        });

        btnPause.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
               pause();
            }
        });

        btnStop.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stop();
            }
        });
    }

    public void stateAwal(){
        play.setEnabled(true);
        btnPause.setEnabled(false);
        btnStop.setEnabled(false);
    }

    public void go() {
        mp=MediaPlayer.create(PlayingAudio.this, R.raw.music1);
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mp.start();
        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer arg0) {
                play.setEnabled(true);
                keterangan.setText("Silahkan Klik Tombol Play");
            }
        });
    }

    public void pause(){
        if (mp.isPlaying()){
            if (mp!=null){
                mp.pause();
            }
        }else {
            if (mp!=null){
                mp.start();
            }
        }
    }

    public void stop(){
        mp.stop();
        try {
            mp.prepare();
            mp.seekTo(0);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        stateAwal();
    }
}
