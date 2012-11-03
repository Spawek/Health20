package com.mmpk.drapp;
import java.util.List;
import java.util.Vector;

public class Category
{
	public List<Question> q = new Vector<Question>(); //questions
	public List<Diagnosis> d = new Vector<Diagnosis>(); //diagnosis
	
	public String title;
}