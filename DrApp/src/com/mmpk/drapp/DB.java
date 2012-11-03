package com.mmpk.drapp;
import java.util.HashMap;
import java.util.Map;

public class DB {
	public static Map<String, Category> categories = new HashMap<String, Category>();
	public boolean isCategoryChoosen = false;
	public Category category;
	public IState state;
	
	public static void CreateCategories()
	{
		DB.categories.put("Cold and flu", new CategoryColdAndFlu());
		DB.categories.put("Cough", new CategoryCough());
		DB.categories.put("Throat problems", new CategoryThroatProblems());
	}
	
}
