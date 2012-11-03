package com.mmpk.drapp;

import android.app.Activity;

public class QuestionController implements IQuestionController {
	Question questionPtr;
	
	public QuestionController(Question question) {
		questionPtr = question;
	}
	
	public IState postAnswer(Answer answer) throws Exception
	{ // TODO idk traktujemy jak No
		return questionPtr.GetNextState(answer == Answer.Yes);
		
	}
	
	
	
}
