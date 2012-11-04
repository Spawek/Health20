package com.mmpk.drapp.Categories;
import java.io.Serializable;

import com.mmpk.drapp.Category;
import com.mmpk.drapp.Diagnosis;
import com.mmpk.drapp.Question;

public class CategoryLegProblems extends Category {
	public CategoryLegProblems() throws Exception
	{
		title = "Leg problems";
		q.add(new Question(title, "fake")); //0
				
		q.add(new Question(title,"Do you have pain in your leg or ankle after a fall or injury?"));
		q.add(new Question(title,"Is there a deformity of your leg, or are you unable to stand or put pressure on your leg?"));
		q.add(new Question(title,"Did you hear a popping or grinding sound at the time of the injury?"));
		q.add(new Question(title,"Is there bruising or swelling of your calf or ankle?"));
		q.add(new Question(title,"Do you have pain or mild swelling in the front or inner part of your lower leg that may have started after physical activity such as running or jumping?"));
		q.add(new Question(title,"Do you have pain, swelling, redness or warmth in your calf?"));
		q.add(new Question(title,"Do you have twisted dark blue or purple veins near the surface of the skin of your calf, and do you have pain or cramping in your calf or leg that is worse after standing or sitting for a long time?"));
		q.add(new Question(title,"Do you have a tender red area or a red streak anywhere on your leg?"));
		q.add(new Question(title,"Do your calves ache after walking, and is the pain relieved with rest?"));
		q.add(new Question(title,"Do you have swelling in both of your feet or lower legs?"));


		d.add(new Diagnosis(title, new String[]{"For more information, please talk to your doctor. If you think your problem is serious, call your doctor right away."})); //0
		
		d.add(new Diagnosis(title, new String[]{"foo"})); // 1
		d.add(new Diagnosis(title, new String[]{"You may have BROKEN BONE such as the TIBIA or FIBULA in the lower leg.","EMERGENCY See your doctor or go to the emergency room right away. Apply ice to the affected area."})); // 2
		d.add(new Diagnosis(title, new String[]{"You may have a SPRAINED ankle, but it's possible to break a bone of the lower leg and still be able to stand on it.","EMERGENCY See your doctor or go to the emergency room right away. Apply ice to the affected area."})); // 3
		d.add(new Diagnosis(title, new String[]{"You may have a partial or complete TEAR of the ACHILLES TENDON that attaches the calf muscle to the heel. title injury will cause pain and difficulty pointing the foot down. A TORN CALF MUSCLE will be painful and might produce bruises.","See your doctor as soon as possible. Apply ice and use an anti-inflammatory medicine such as ibuprofen. Avoid activities that cause pain."})); // 4
		d.add(new Diagnosis(title, new String[]{ "A MUSCLE PULL or STRAIN will cause pain and stiffness in the calf muscle without any bruising or swelling.","Apply ice and use an anti-inflammatory medicine. Avoid activities that cause pain."})); // 5

		d.add(new Diagnosis(title, new String[]{"You may have SHIN SPLINTS, inflammation of the ligaments and other connective tissue along your TIBIA bone, or a STRESS FRACTURE, a tiny crack in the bone. These injuries are often caused by overuse during physical activity.","Get plenty of rest and avoid activities that cause pain. Use an anti-inflammatory medicine such as ibuprofen and apply ice to the area. See your doctor if pain or swelling gets worse or doesn't get better."})); // 7
		d.add(new Diagnosis(title, new String[]{"You may have DEEP VENOUS THROMBOSIS, a clot in the veins of the calf muscles, often caused by prolonged inactivity.","EMERGENCY See your doctor or go to the emergency room right away. A blood clot in the legs could break away and block an artery in the lungs, causing pulmonary embolism."})); // 8
		d.add(new Diagnosis(title, new String[]{"You may have VARICOSE VEINS, swollen veins caused by weak valves and vein walls.","Wear support stockings or hose. Alternate periods of standing with sitting. See your doctor if the varicose veins are very prominent, or if they become painful and red."})); // 9
		d.add(new Diagnosis(title, new String[]{"You may have an infection such as CELLULITIS (infection of the skin), LYMPHANGITIS (infection of the lymph channels leading to lymph nodes) or OSTEOMYELITIS (infection of the bone).","Apply mild heat and an antibiotic ointment. Call your doctor if you have a fever or if the red areas or pain get worse or do not go away."})); // 10
		d.add(new Diagnosis(title, new String[]{"The pain may be caused by CLAUDICATION caused by PERIPHERAL ARTERIAL DISEASE (PAD), narrowing of the arteries that carry blood to your leg muscles.","See your doctor as soon as possible."})); // 11
		d.add(new Diagnosis(title, new String[]{"You may have EDEMA, a build-up of fluids that may be caused from HEART FAILURE, KIDNEY DISEASE or blockage of blood returning to the heart.","See your doctor as soon as possible."})); // 12
		
		q.get(1).DefConn(q.get(2), q.get(5), "yes");
		q.get(2).DefConn(d.get(2), q.get(3), "no");
		q.get(3).DefConn(d.get(3), q.get(4), "no");
		q.get(4).DefConn(d.get(4), d.get(5), "no");
		
		q.get(5).DefConn(d.get(6), q.get(6), "no");
		q.get(6).DefConn(d.get(7), q.get(7), "no");
		q.get(7).DefConn(d.get(8), q.get(8), "no");
		q.get(8).DefConn(d.get(9), q.get(9), "no");
		q.get(9).DefConn(d.get(10), q.get(10), "no");
		q.get(10).DefConn(d.get(11), d.get(0), "no");
	}
}
