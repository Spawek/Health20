package com.mmpk.drapp;

public class Question implements IState, IQuestionController {
	public IState yesPtr;
	public IState noPtr;
	public IState idkPtr;
	//private Category category;

	// to display
	public String title = "";
	public String question;

	public Question(String _title, String _question) {
		//category = cat;
		title = _title;
		question = _question;
	}

	public void DefConn(IState yes, IState no, String idk) throws Exception {
		yesPtr = yes;
		noPtr = no;

		if (idk == "yes")
			idkPtr = yesPtr;
		else if (idk == "no")
			idkPtr = noPtr;
		else
			throw new Exception("wrong idk string");
	}

	IState GetNextState(boolean answer) {
		if (answer)
			return yesPtr;
		else
			return noPtr;
	}
	
	public IState postAnswer(Answer answer) throws Exception
	{ // TODO idk traktujemy jak No
		return GetNextState(answer == Answer.Yes);
		
	}

}