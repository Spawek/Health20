package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class EmergencyMoreAid extends Activity {

	protected Button helpMe;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_choice2);
        
        helpMe = (Button) findViewById(R.id.bt_confirm);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onRadioButtonClick(View v) {
    	startActivity(new Intent(this, EmergencyBleeding.class));
    	helpMe.setVisibility(0);

    }
//    
    public void more(View v) {
    	startActivity(new Intent(this, EmergencyMoreAid2.class));
    }
}
