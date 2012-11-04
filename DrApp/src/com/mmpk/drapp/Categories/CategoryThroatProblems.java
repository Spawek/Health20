package Categories;
import MainPackage.Category;
import MainPackage.Diagnosis;
import MainPackage.Question;

public class CategoryThroatProblems extends Category {
	public CategoryThroatProblems() throws Exception
	{
		title = "Throat problems";
		q.add(new Question(this, "fake")); //0
		q.add(new Question(this,"Do you have a fever?"));
		q.add(new Question(this,"Do you have body aches, headache, cough or runny nose?"));
		q.add(new Question(this,"Are you vomiting or do you have nausea or diarrhea?"));
		q.add(new Question(this,"When you look at the back of your throat, do you see white patches on your tonsils?"));
		q.add(new Question(this,"Do you have a persistent cough or are you coughing mucus?"));
		q.add(new Question(this,"Is the person a child with a harsh barking cough?"));
		q.add(new Question(this,"Do you have small, open sores on your tongue, inside your lips or on the sides or back of your mouth?"));
		q.add(new Question(this,"Is the skin in your mouth peeling, and are your tongue and gums swollen and red?"));
		q.add(new Question(this,"Do you have white patches and redness on your tongue or on the sides or back of your mouth?"));
		
		d.add(new Diagnosis(this, new String[]{"For more information, please talk to your doctor. If you think your problem is serious, call your doctor right away."}));// 0 
		d.add(new Diagnosis(this, new String[]{"foo"})); // 1
		d.add(new Diagnosis(this, new String[]{"You probably have a COLD or FLU.","Drink plenty of fluids and get plenty of rest. Children should be given nonaspirin medicine for the fever. If the cold lasts longer than two to three days, see your doctor."})); // 2
		d.add(new Diagnosis(this, new String[]{"You may have viral GASTROENTERITIS, also called STOMACH FLU.", "Drink plenty of fluids and get plenty of rest. Use an antinausea and/or antidiarrheal medicine. See your doctor if symptoms get worse, if they last longer than a week, or if you become dehydrated."})); // 3
		d.add(new Diagnosis(this, new String[]{"You may have STREP THROAT or MONONUCLEOSIS.","See your doctor."})); // 4
		d.add(new Diagnosis(this, new String[]{"These symptoms may be from BRONCHITIS, PNEUMONIA or POST-NASAL DRIP.","These illnesses need prescription treatments. See your doctor."})); // 5
		d.add(new Diagnosis(this, new String[]{"A dry barking cough often means CROUP or, less commonly, EPIGLOTTITIS.","Make sure the child is drinking plenty of fluids. Relieve fever and other discomfort with children's acetaminophen. See your doctor right away if there is shortness of breath. Croup and other respiratory infections may need treatment by your doctor."})); // 6
		d.add(new Diagnosis(this, new String[]{"These sores are called CANKER SORES. They usually occur by themselves or with other viral illnesses.","Most of these sores will heal in 7 to 14 days. Use an anesthetic spray or an analgesic medicine. If the sores are severe, last longer than expected, or are accompanied by other symptoms, see your doctor."})); // 7
		d.add(new Diagnosis(this, new String[]{"This may be from TRENCH MOUTH, an infection of the gums, teeth and other tissues. A rare drug reaction, STEVENS-JOHNSON REACTION, may also cause this.","See your dentist or doctor. Poor dental hygiene may lead to this disease. Brush your teeth and floss as recommended by your dentist. Use over-the-counter pain medications to relieve discomfort."})); // 8
		d.add(new Diagnosis(this, new String[]{"You may have ORAL THRUSH, a yeast infection in your mouth.","This may be a simple infection, or it may come from another, more serious illness. You may be able to control the infection by eating unsweetened yogurt (with live cultures) or taking acidophilus. This may help restore normal bacteria in your body. See your doctor if it returns or doesn't go away."})); // 9
		
		q.get(1).DefConn(q.get(2), q.get(7), "yes");
		q.get(2).DefConn(d.get(2), q.get(3), "no");
		q.get(3).DefConn(d.get(3), q.get(4), "no");
		q.get(4).DefConn(d.get(4), q.get(5), "no");
		q.get(5).DefConn(d.get(5), q.get(6), "no");
		q.get(6).DefConn(q.get(6), d.get(0), "no");

		q.get(7).DefConn(d.get(7), q.get(8), "no");
		q.get(8).DefConn(d.get(8), q.get(9), "no");
		q.get(9).DefConn(d.get(9), d.get(0), "no");
			
	}
}
