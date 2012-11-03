package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class QuestionActivity extends Activity {
	
	IQuestionController answerController;

	TextView titleTV;
	TextView questionTV;
	
	public QuestionActivity(String title, String question, IQuestionController c) {
		answerController = c;
		titleTV = (TextView) findViewById(R.id.title);
		questionTV = (TextView) findViewById(R.id.question);
		
		titleTV.setText(title);
		questionTV.setText(question);
		
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_question, menu);
		return true;
	}

	public void yesClicked(View v) {
		Log.i("activity_question", "yes clicked")
		answerController.postAnswer(IQuestionController.Answer.Yes);
	}

	public void noClicked(View v) {
		Log.i("activity_question", "no clicked")
		answerController.postAnswer(IQuestionController.Answer.No);
	}

	public void idkClicked(View v) {
		Log.i("activity_question", "idk clicked")
		answerController.postAnswer(IQuestionController.Answer.Idk);
	}

}
