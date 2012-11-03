package com.mmpk.drapp;

	public class Diagnosis implements IState{
		Category category;
		//to display
		public String title;
		public String [] paragraphs;
		
		public Diagnosis(Category _category, String _title, String [] _paragraphs)
		{
			title = _title;
			paragraphs = _paragraphs;
			category = _category;
		}
		
		//with default title
		public Diagnosis(Category _category, String [] _paragraphs)
		{
			paragraphs = _paragraphs;
			category = _category;
			title = category.title;
		}
	}