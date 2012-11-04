package com.mmpk.drapp;

import java.util.HashMap;
import com.mmpk.drapp.Categories.*;

import java.util.Map;

public class DB {
	public static Map<String, Category> categories = new HashMap<String, Category>();
	public boolean isCategoryChoosen = false;
	public Category category;
	public IState state;

	public static void CreateCategories() throws Exception {
		DB.categories.put("Cough", new CategoryCough()); // for every category
		DB.categories.put("Sore throat", new CategoryThroatProblems());
		DB.categories.put("Cold and flu", new CategoryColdAndFlu());
		DB.categories.put("Leg problems", new CategoryLegProblems());
		DB.categories.put("Neck pain", new CategoryNeckPain());
	}

	static {
		try {
			DB.CreateCategories();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
