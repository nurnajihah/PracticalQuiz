package sg.edu.rp.c346.practicalquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Spinner spnWeb;
    WebView wvWeb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnWeb = findViewById(R.id.spinnerWeb);
        wvWeb = findViewById(R.id.webView);

        wvWeb.getSettings().setAllowContentAccess(false);
        wvWeb.getSettings().setBuiltInZoomControls(true);
        wvWeb.setWebViewClient(new WebViewClient());

//        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.website_name));
//        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spnWeb.setAdapter(spinnerArrayAdapter);


        spnWeb.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        final String[] str1 = getResources().getStringArray(R.array.website_url);
                        wvWeb.loadUrl(str1[0]);
                        break;
                    case 1:
                        final String[] str2 = getResources().getStringArray(R.array.website_url);
                        wvWeb.loadUrl(str2[1]);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}