package com.mmpk.drapp;

public interface IQuestionController {
	enum Answer {Yes, No, Idk};
	
	IState postAnswer(Answer a) throws Exception;
}
