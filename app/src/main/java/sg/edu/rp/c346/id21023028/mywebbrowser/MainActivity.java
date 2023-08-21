package sg.edu.rp.c346.id21023028.mywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView wvMyPage;
    Button btnLoadURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link variable to UI
        btnLoadURL = findViewById(R.id.buttonLoad);
        wvMyPage = findViewById(R.id.webViewMyPage);

        //create webview client object and bind to variable
        wvMyPage.setWebViewClient(new WebViewClient());

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.rp.edu.sg/soi/home";
                wvMyPage.loadUrl(url);
            }
        });

    }
}