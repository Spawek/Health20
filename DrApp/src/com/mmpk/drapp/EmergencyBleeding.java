package com.mmpk.drapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class EmergencyBleeding extends Activity {
	
	private WebView mWebView;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency_bleeding);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//    
    public void bandages(View v) {
    	Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amazon.com/s/ref=sr_st?keywords=bandages&qid=1352025029&rh=k%3Abandages%2Cn%3A3760901&sort=reviewrank_authority"));
    	startActivity(browserIntent);
    }
    public void moreInfo(View v) {
    	Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://en.wikipedia.org/wiki/Bleeding"));
    	startActivity(browserIntent);
    }
//    
//    public void emergencyClicked(View v) {
//    	Log.i("mainActivity", "emergency clicked");
//    }
}
