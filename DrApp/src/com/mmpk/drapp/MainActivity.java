package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        setTitle("DrApp");
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void iNeedAdviceClicked(View v) {
    	Log.i("mainActivity", "i need advice clicked");
    	
    	Intent i = new Intent(this, BodyActivity.class);
		
    	startActivity(i);
    }
    
    public void emergencyClicked(View v) {
    	Log.i("mainActivity", "emergency clicked");
    }
}
