package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class BodyActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_body);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_body, menu);
		return true;
	}

	public void airwaysClicked(View v) {
		Intent i = new Intent(this, CategoryChoiceActivity.class);
		i.putExtra("category", 1);
		startActivity(i);
	}

	public void generalClicked(View v) {
		Intent i = new Intent(this, CategoryChoiceActivity.class);
		i.putExtra("category", 2);
		startActivity(i);
	}

	public void armsClicked(View v) {
		Intent i = new Intent(this, CategoryChoiceActivity.class);
		i.putExtra("category", 3);
		startActivity(i);
	}

	public void abdomenClicked(View v) {
		Intent i = new Intent(this, CategoryChoiceActivity.class);
		i.putExtra("category", 4);
		startActivity(i);
	}

	public void legsClicked(View v) {
		Intent i = new Intent(this, CategoryChoiceActivity.class);
		i.putExtra("category", 5);
		startActivity(i);
	}

	public void headClicked(View v) {
		Intent i = new Intent(this, CategoryChoiceActivity.class);
		i.putExtra("category", 6);
		startActivity(i);
	}

	public void chestClicked(View v) {
		Intent i = new Intent(this, CategoryChoiceActivity.class);
		i.putExtra("category", 7);
		startActivity(i);
	}

}
