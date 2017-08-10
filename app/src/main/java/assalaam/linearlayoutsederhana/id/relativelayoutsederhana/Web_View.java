package assalaam.linearlayoutsederhana.id.relativelayoutsederhana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;


public class Web_View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web__view);
    WebView mywebView=(WebView) findViewById(R.id.webView);
        mywebView.loadUrl("http://www.okedroid.com");
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);


    }
}
