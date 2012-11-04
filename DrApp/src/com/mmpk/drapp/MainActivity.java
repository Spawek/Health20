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
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void iNeedAdviceClicked(View v) {
    	Log.i("mainActivity", "i need advice clicked");
    	
    	Question init_q = DB.categories.get("Cough").q.get(1);
    	
    	Intent i = new Intent(this, QuestionActivity.class);
		
    	i.putExtra("title", init_q.title);
		i.putExtra("question", init_q.question);
		i.putExtra("controller", init_q);
		
		startActivity(i);
    }
    
    public void emergencyClicked(View v) {
    	Log.i("mainActivity", "emergency clicked");
    }
}
