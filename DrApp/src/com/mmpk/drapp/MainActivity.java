package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void iNeedAdviceClicked(View v) {
    	Log.i("mainActivity", "i need advice clicked");
    }
    
    public void emergencyClicked(View v) {
    	Log.i("mainActivity", "emergency clicked");
    }
}
