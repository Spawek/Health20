package com.mmpk.drapp;

import android.app.Activity;

public interface IQuestionController {
	enum Answer {Yes, No, Idk};
	
	Activity postAnswer(Answer a) throws Exception;
}
