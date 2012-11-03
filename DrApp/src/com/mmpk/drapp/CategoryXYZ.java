package com.mmpk.drapp;

public class CategoryXYZ extends Category {
	public CategoryXYZ()
	{
		q.add(new Question(this, "fakeTitle", "fakeMsg")); //0
		q.add(new Question(this, "testTitle", "testMsg")); // 1
		q.add(new Question(this, "test2Title", "test2Msg")); //2
		q.add(new Question(this, "test3Title", "test3Msg")); //3
		
		q.get(0).yesPtr = q.get(1);
		q.get(0).noPtr = q.get(2);
		
	}
}
