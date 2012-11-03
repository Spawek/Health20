package com.mmpk.drapp;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DB.CreateCategories();
		
		
		System.out.println(DB.categories.get("XYZ").q.get(1).title.toString());

	}

}
