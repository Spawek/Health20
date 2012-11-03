package com.mmpk.drapp;

import android.app.Activity;

public class QuestionController implements IQuestionController {
	Question questionPtr;
	
	public QuestionController(Question question) {
		questionPtr = question;
	}
	
	public Activity postAnswer(Answer answer) throws Exception
	{ // TODO idk traktujemy jak No
		IState returnState = questionPtr.GetNextQuestion(answer == Answer.Yes);
		
		//if(returnState.getClass() == Question.class)
		if(returnState instanceof Question)
		{
			Question tempQuestion = Question.class.cast(returnState);
			return new QuestionActivity(tempQuestion.title, tempQuestion.question, new QuestionController(tempQuestion));
		}
		else if(returnState instanceof Diagnosis)
		{
			Diagnosis tempDiagnosis = Diagnosis.class.cast(returnState);
			return new DiagnosisActivity(tempDiagnosis.title, tempDiagnosis.paragraphs);
		}
		else
		{
			throw new Exception("type not known");
		}
		
	}
	
	
	
}
