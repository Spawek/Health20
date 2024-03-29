package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
        
        setTitle("Diagnosis");
        
        Intent i = getIntent();
        
		titleTV = (TextView) findViewById(R.id.title);
		diagnosisTV = (TextView) findViewById(R.id.content);
		// TODO pierwszy akapit!
		titleTV.setText(i.getStringExtra("title"));
		String s = "";
		for (String is : i.getStringArrayExtra("diagnosis"))
			s += is + "\n\n";
		diagnosisTV.setText(s);
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

    public void startAgainClicked(View v) {
    	Log.i("diagnosis_activity", "start again clicked");
    	Intent i = new Intent(this, MainActivity.class);
    	i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    	startActivity(i);
    }
}
