package com.mmpk.drapp;

public interface IQuestionController {
	enum Answer {Yes, No, Idk};
	
	void postAnswer(Answer a);
}
