package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class EmergencyMoreAid2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_choice3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onRadioButtonClick(View v) {
    	startActivity(new Intent(this, FirstAidTipps.class));
    }
//    
    public void more(View v) {
    	startActivity(new Intent(this, FirstAidTipps.class));
    }
}
