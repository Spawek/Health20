package com.mmpk.drapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class QuestionActivity extends Activity {
	
	IQuestionController answerController;

	TextView titleTV;
	TextView questionTV;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question);
		
		Intent i = getIntent();
		
		answerController = (Question) i.getSerializableExtra("controller");
		titleTV = (TextView) findViewById(R.id.title);
		questionTV = (TextView) findViewById(R.id.question);
		
		setTitle(i.getStringExtra("title"));
		
		titleTV.setText(i.getStringExtra("title"));
		questionTV.setText(i.getStringExtra("question"));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_question, menu);
		return true;
	}

	public void yesClicked(View v) throws Exception {
		Log.i("activity_question", "yes clicked");
		IState a = answerController.postAnswer(IQuestionController.Answer.Yes);
		
		processNextState(a);
	}

	private void processNextState(IState a) throws Exception {
		Intent i;
		
		if (a instanceof Diagnosis) {
			i = new Intent(this, DiagnosisActivity.class);
			
			i.putExtra("title", ((Diagnosis) a).title);
			i.putExtra("diagnosis", ((Diagnosis) a).paragraphs);
			
			
			
			
		} else if (a instanceof Question) {
			i = new Intent(this, QuestionActivity.class);
			
			i.putExtra("title", ((Question) a).title);
			i.putExtra("question", ((Question) a).question);
			i.putExtra("controller", (Question) a);
			
		} else
			throw new Exception("IState of unknown type");
		
		startActivity(i);
	}

	public void noClicked(View v) throws Exception {
		Log.i("activity_question", "no clicked");
		IState a = answerController.postAnswer(IQuestionController.Answer.No);
		
		processNextState(a);
	}

	public void idkClicked(View v) throws Exception {
		Log.i("activity_question", "idk clicked");
		IState a = answerController.postAnswer(IQuestionController.Answer.Idk);
		
		processNextState(a);
	}

}
