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
		DB.categories.put("XYZ", new CategoryXYZ()); // for every category
		DB.categories.put("Cough", new CategoryCough()); // for every category
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
