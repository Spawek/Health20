package com.mmpk.drapp;
import java.io.Serializable;
import java.util.List;
import java.util.Vector;

public class Category implements Serializable
{
	public List<Question> q = new Vector<Question>(); //questions
	public List<Diagnosis> d = new Vector<Diagnosis>(); //diagnosis
	
	public String title;
}