package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class BodyPartActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_part);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_body_part, menu);
        return true;
    }
    
    public void airwaysClicked(View v) {
    	Intent i = new Intent(this, CategoryChoiceActivity.class);
    	
    	i.putExtra("category", 1);
    	
    	startActivity(i);
    }
}
