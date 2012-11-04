package com.mmpk.drapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainEmergency extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void iNeedCall(View v) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:911"));
        startActivity(callIntent);
        
//    	Log.i("mainActivity", "i need advice clicked");
//    	startActivity(new Intent(this, MainActivity.class));
    }
    
    public void iNeedTips(View v) {
//    	Log.i("mainActivity", "emergency clicked");
    	startActivity(new Intent(this, FirstAidTipps.class));
    }
}
