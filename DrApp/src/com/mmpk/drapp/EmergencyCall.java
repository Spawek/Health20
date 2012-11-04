package com.mmpk.drapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class EmergencyCall extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_call);
    }

  public void iNeedCall(View v) {
	  
	  {
		    try {
		        Intent callIntent = new Intent(Intent.ACTION_CALL);
		        callIntent.setData(Uri.parse("tel:004915777719000"));
		        startActivity(callIntent);
		    } catch (ActivityNotFoundException e) {
		        Log.e("helloandroid dialing example", "Call failed", e);
		    }
		}
  
	  
//	Log.i("mainActivity", "i need advice clicked");
//	  startActivity(new Intent(this, Emergency1stAid1.class));
}
  
  
  
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.activity_main, menu);
//        return true;
//    }
//    
//    public void iNeedAdviceClicked(View v) {
//    	Log.i("mainActivity", "i need advice clicked");
//    }
//    
//    public void emergencyClicked(View v) {
//    	Log.i("mainActivity", "emergency clicked");
//    }
}
