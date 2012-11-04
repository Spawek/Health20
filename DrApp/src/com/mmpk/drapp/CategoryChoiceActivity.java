package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class CategoryChoiceActivity extends Activity {
	
	int catId;
	Category c;
	ListView lv;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_choice);
        
        lv = (ListView) findViewById(R.id.listView1);
        
        catId = getIntent().getIntExtra("category", 1);
        
        switch (catId) {
        
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_category_choice, menu);
        return true;
    }
}
