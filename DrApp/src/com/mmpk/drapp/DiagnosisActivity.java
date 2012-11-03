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
    
	public DiagnosisActivity(String title, String diagnosis) {
		titleTV = (TextView) findViewById(R.id.title);
		diagnosisTV = (TextView) findViewById(R.id.question);
		
		titleTV.setText(title);
		diagnosisTV.setText(diagnosis);
		
	}
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);
        getActionBar().setDisplayHomeAsUpEnabled(true);
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
