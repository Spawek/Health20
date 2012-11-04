package com.mmpk.drapp;

	public class Diagnosis implements IState{
//		Category category;
		//to display
		public String title;
		public String [] paragraphs;
		
		public Diagnosis(String _title, String [] _paragraphs)
		{
			title = _title;
			paragraphs = _paragraphs;
		}
		
	}