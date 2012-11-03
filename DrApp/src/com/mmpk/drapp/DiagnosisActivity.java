package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class DiagnosisActivity extends Activity {
	
	TextView titleTV;
	TextView diagnosisTV;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);
        getActionBar().setDisplayHomeAsUpEnabled(true);
        
		titleTV = (TextView) findViewById(R.id.title);
		diagnosisTV = (TextView) findViewById(R.id.question);
		// TODO pierwszy akapit!
		titleTV.setText(savedInstanceState.getString("title"));
		diagnosisTV.setText(savedInstanceState.getStringArray("diagnosis")[0]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_diagnosis, menu);
        return true;
    }

    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}