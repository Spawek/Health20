package Categories;
import MainPackage.Category;
import MainPackage.Diagnosis;
import MainPackage.Question;

public class CategoryColdFlu extends Category {
	public CategoryColdFlu() throws Exception
	{
		title = "Cold and flu";

		q.add(new Question(this, "fake")); //0

		q.add(new Question(this,"Do you have a fever?"));
		q.add(new Question(this,"Do you have a sore throat and headache without nasal drainage?"));
		q.add(new Question(this,"Did your symptoms start suddenly, and do you have a combination of symptoms including muscle aches, chills, a sore throat, runny nose or cough?"));
		q.add(new Question(this,"Do you have a persistent cough that brings up yellowish or greenish mucus, wheezing and shortness of breath?"));
		q.add(new Question(this,"Do you have a headache or muscle aches, nausea or vomiting, and watery diarrhea?"));
		q.add(new Question(this,"Do you have a runny and/or itchy nose, sneezing, and itchy eyes?"));
		q.add(new Question(this,"Do you have sneezing, a sore throat, headache, congestion and a runny nose?"));
		q.add(new Question(this,"Do you have swelling or pain around your eyes, cheeks, nose or forehead, a headache, a dry cough, and/or discharge from the nose?"));


		d.add(new Diagnosis(this, new String[]{"For more information, please talk to your doctor. If you think your problem is serious, call your doctor right away."}));
		
		d.add(new Diagnosis(this, new String[]{"For more information, please talk to your doctor. If you think your problem is serious, call your doctor right away."}));\ 0 
		d.add(new Diagnosis(this, new String[]{"foo"})); // 1
		d.add(new Diagnosis(this, new String[]{"You may have STREP THROAT, a bacterial infection.","See your doctor if the sore throat or fever lasts longer than 48 hours. He or she can do a test to find out if you have strep throat. If you do, your doctor may give you an antibiotic to treat it. You should also get plenty of rest, and drink lots of water. Gargling with warm salt water may help relieve a sore throat."})); // 2
		d.add(new Diagnosis(this, new String[]{"You may have the FLU.","Get plenty of rest, and drink lots of fluids. Over-the-counter medicines may relieve some of your symptoms. Your doctor may suggest a prescription medicine that may shorten the course of the flu. Prevent the flu by getting a flu shot each fall."})); // 3
		d.add(new Diagnosis(this, new String[]{"You may be developing ACUTE BRONCHITIS, an infection of the airways.","Get plenty of rest, and drink lots of fluids. If you smoke, cut down on the number of cigarettes you smoke, or stop smoking. Use an over-the-counter medicine for pain and fever, and an expectorant to ease the coughing. A humidifier may also relieve some symptoms. If symptoms persist or worsen, contact your doctor."})); // 4
		d.add(new Diagnosis(this, new String[]{"You may have GASTROENTERITIS (also called the stomach flu).","Get plenty of rest. Children who have gastroenteritis should be given an oral rehydration solution to avoid dehydration. Ease back into eating with bland foods and clear liquids."})); // 5
		d.add(new Diagnosis(this, new String[]{"You may have ALLERGIES.","Try an over-the-counter antihistamine medicine. If symptoms persist or worsen, contact your doctor."})); // 6
		d.add(new Diagnosis(this, new String[]{"You probably have a COLD.","Try an over-the-counter cold medicine to treat the specific symptoms you are having. Get plenty of rest, and drink lots of fluid."})); // 7
		d.add(new Diagnosis(this, new String[]{"You may be developing SINUSITIS.", "See your doctor. Acetaminophen, ibuprofen and/or warm compresses may help reduce facial pain. A cool mist vaporizer may help your sinuses drain more easily. Drink plenty of fluids."})); // 8

		q.get(1).DefConn(q.get(2), q.get(6), "yes");
		q.get(2).DefConn(d.get(2), q.get(3), "no");
		q.get(3).DefConn(d.get(3), q.get(4), "no");
		q.get(4).DefConn(d.get(4), q.get(5), "no");
		q.get(5).DefConn(d.get(5), d.get(0), "no");
		//........
		q.get(6).DefConn(d.get(6), q.get(7), "no");
		q.get(7).DefConn(d.get(7), q.get(8), "no");
		q.get(8).DefConn(d.get(8), q.get(0), "no");
			
	}
}
