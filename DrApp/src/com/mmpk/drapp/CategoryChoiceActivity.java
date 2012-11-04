package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class CategoryChoiceActivity extends Activity {

	int catId;
	Category c;
	ListView lv;

	final static String[][] names_db = new String[][] {
			new String[] { "Empty category!" },
			new String[] { "Cough", "Sore throat" },
			new String[] { "Cold and flu" },
			new String[] { "Empty category" },
			new String[] { "Empty category" },
			new String[] { "Leg problems" },
			new String[] { "Neck pain" },
			new String[] { "Empty category" },

	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_category_choice);
		setTitle("What is the problem?");
		lv = (ListView) findViewById(R.id.listView1);

		catId = getIntent().getIntExtra("category", 0);

		String[] names = names_db[catId];

		lv.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, android.R.id.text1, names));

		@SuppressWarnings("unused")
		final CategoryChoiceActivity obj = this;

		lv.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> ad, View v, int pos, long id) {
				Log.i("listview", "Item click " + pos);

				try {
					Question q = DB.categories.get(names_db[catId][pos]).q.get(1);
					
					Intent i = new Intent(obj, QuestionActivity.class);
					
			    	i.putExtra("title", q.title);
					i.putExtra("question", q.question);
					i.putExtra("controller", q);
					
					startActivity(i);
				} catch (Exception e) {

					AlertDialog ad1 = new AlertDialog.Builder(obj).create();
					ad1.setCancelable(false); // This blocks the 'BACK' button
					ad1.setMessage("Sorry, this category needs to be completed");
					ad1.setButton("OK", new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							dialog.dismiss();
						}
					});
					ad1.show();
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_category_choice, menu);
		return true;
	}
}
