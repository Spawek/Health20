package com.mmpk.drapp;

public class Question implements IState {
	public IState yesPtr;
	public IState noPtr;
	public IState idkPtr;
	private Category category;

	// to display
	public String title = "";
	public String question;

	public Question(Category cat, String _title, String _question) {
		category = cat;
		title = _title;
		question = _question;
	}

	// with default title
	public Question(Category cat, String _question) {
		category = cat;
		title = cat.title;
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

}