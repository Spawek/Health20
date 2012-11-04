package com.mmpk.drapp.Categories;
import java.io.Serializable;

import com.mmpk.drapp.Category;
import com.mmpk.drapp.Diagnosis;
import com.mmpk.drapp.Question;

public class CategoryCough extends Category {
	public CategoryCough() throws Exception
	{
		title = "Cough";
		q.add(new Question(title, "fake")); //0
		q.add(new Question(title, "Has your cough begun recently?")); //1
		q.add(new Question(title, "Are you very short of breath, and are you coughing up pink, frothy mucus?"));	//2
		q.add(new Question(title, "Does your cough produce clear or pale yellow mucus?")); //3
		q.add(new Question(title, "Does your cough produce yellow, tan or green mucus?")); //4
		q.add(new Question(title, "Does the cough come with shortness of breath and wheezing?")); //5
		q.add(new Question(title, "Do you have swelling in your legs and/or shortness of breath when you are active or after you have been lying down?")); //6
		q.add(new Question(title, "Do you have heart problems?")); //7
		q.add(new Question(title, "Have you recently started coughing up blood or bloody sputum?")); //8
		q.add(new Question(title, "Have you recently started having sharp chest pain, rapid heartbeat, swelling of the legs and sudden shortness of breath?")); //9
		q.add(new Question(title, "Do you have a fever, chills and night sweats along with chest pain when you cough or take a deep breath?")); //10
		q.add(new Question(title, "Have you unintentionally lost weight?")); //11
		q.add(new Question(title, "Did you inhale dust, particles or an object?")); //12
		
		d.add(new Diagnosis(title, new String[]{"For more information, please talk to your doctor.", "If you think your problem is serious, call your doctor right away."}));
		
		d.add(new Diagnosis(title, new String[]{"foo"})); // 1
		d.add(new Diagnosis(title, new String[]{"Your symptoms may be from a serious condition called PULMONARY EDEMA (fluid in the lungs).","EMERGENCY! GO TO THE NEAREST EMERGENCY ROOM RIGHT AWAY."})); // 2
		d.add(new Diagnosis(title, new String[]{"You may have a viral illness such as a COLD or the FLU.","Get plenty of rest, and drink lots of fluids. Try over-the-counter medicines to treat your symptoms."})); // 3
		d.add(new Diagnosis(title, new String[]{"You may have an infection of the airways such as CHRONIC BRONCHITIS. If you have a fever with shaking chills and are very ill, you may have a more serious infection such as PNEUMONIA.", "See your doctor. He or she can prescribe medicine to relieve your symptoms. Get plenty of rest, and drink lots of fluids. If you smoke, stop smoking."})); // 4
		d.add(new Diagnosis(title, new String[]{"These symptoms may be a sign of ASTHMA, a constriction of the airways.","Asthma can be dangerous and should be diagnosed and treated by your doctor."})); // 5
		d.add(new Diagnosis(title, new String[]{"foo"})); // 6
		d.add(new Diagnosis(title, new String[]{"Persistent coughing can be caused by CONGESTIVE HEART FAILURE, especially when there is a buildup of fluid in the lungs.","See your doctor."})); // 7
		d.add(new Diagnosis(title, new String[]{"foo"})); // 8
		d.add(new Diagnosis(title, new String[]{"Bloody mucus with these symptoms may mean that a blood clot has moved from your leg to your lungs. This is called PULMONARY EMBOLISM."})); // 9
		d.add(new Diagnosis(title, new String[]{"These symptoms may be caused by TUBERCULOSIS or another type of infection.","See your doctor."})); // 10
		d.add(new Diagnosis(title, new String[]{"This may be a sign of a serious illness, such as LUNG CANCER. Other signs of lung cancer may include a cough that produces bloody sputum, shortness of breath and wheezing.","See your doctor right away."})); // 11
		d.add(new Diagnosis(title, new String[]{"IRRITATION OF THE AIRWAYS will cause coughing to attempt to clear the object or irritation out of the airway.","If the coughing is severe or if you don't believe the irritant has been cleared from your airway, see your doctor or go to the emergency room right away."})); // 12

		q.get(1).DefConn(q.get(12), q.get(2), "no");
		q.get(2).DefConn(d.get(2), q.get(3), "no");
		q.get(3).DefConn(d.get(3), q.get(4), "no");
		q.get(4).DefConn(d.get(4), q.get(5), "no");
		q.get(5).DefConn(d.get(5), q.get(6), "no");
		q.get(6).DefConn(q.get(7), q.get(10), "yes");
		q.get(7).DefConn(d.get(7), q.get(8), "no");
		q.get(8).DefConn(q.get(9), q.get(12), "yes");
		q.get(9).DefConn(d.get(9), q.get(10), "no");
		q.get(10).DefConn(d.get(10), q.get(11), "no");
		q.get(11).DefConn(d.get(11), q.get(12), "no");
		q.get(12).DefConn(d.get(12), d.get(0), "no");	
	}
}
