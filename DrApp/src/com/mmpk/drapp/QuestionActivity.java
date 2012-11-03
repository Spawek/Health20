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
		
		answerController = (IQuestionController) savedInstanceState.get("c");
		titleTV = (TextView) findViewById(R.id.title);
		questionTV = (TextView) findViewById(R.id.question);
		
		titleTV.setText(savedInstanceState.getString("title"));
		questionTV.setText(savedInstanceState.getString("question"));
		
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
		Bundle data = new Bundle();
		Intent i;
		
		if (a instanceof Diagnosis) {
			data.putString("title", ((Diagnosis) a).title);
			data.putStringArray("diagnosis", ((Diagnosis) a).paragraphs);
			
			i = new Intent("diagnosis_intent");
			
		} else if (a instanceof Question) {
			data.putString("title", ((Question) a).title);
			data.putString("question", ((Question) a).question);
			
			i = new Intent("question_intent");
		} else
			throw new Exception("IState of unknown type");
		
		i.putExtras(data);
		
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
