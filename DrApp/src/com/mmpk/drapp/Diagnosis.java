package com.mmpk.drapp;

import android.app.Activity;

	public class Diagnosis implements IState{
		Category category;
		//to display
		String title;
		String [] paragraphs;
		
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
		
		
		public Activity GetActivity()
		{
			return new DiagnosisActivity(title, paragraphs); //TODO: generate activity using this object data
		}
	}