package Categories;
import MainPackage.Category;
import MainPackage.Diagnosis;
import MainPackage.Question;

public class CategoryNeckPain extends Category {
	public CategoryNeckPain() throws Exception
	{
		title = "Neck pain";
		q.add(new Question(this, "fake")); //0
				
		q.add(new Question(this,"Have you been involved in an accident that involved your neck?"));
		q.add(new Question(this,"Are you having pain or numbness down your shoulder, arms or legs?"));
		q.add(new Question(this,"Has pain come on slowly over a few hours after the accident?"));
		q.add(new Question(this,"Do you have a fever, stiff neck, vomiting, and does light hurt your eyes?"));
		q.add(new Question(this,"Do you have throbbing pain or numbness down your shoulder or into your arm?"));
		q.add(new Question(this,"Do you have a stiff neck or are you having trouble moving your neck without pain?"));
		q.add(new Question(this,"Did you have a whiplash-type injury in the past, or do you have pain and/or stiffness every day in your neck, hands, knees, hips or other joints?"));
		
		d.add(new Diagnosis(this, new String[]{"For more information, please talk to your doctor. If you think your problem is serious, call your doctor right away."}));\ 0 
		
		d.add(new Diagnosis(this, new String[]{"foo"})); // 1
		d.add(new Diagnosis(this, new String[]{"This may be MUSCLE SPASM or a BURNER, but it also may be an injury to the SPINAL CORD.","URGENT"})); // 2
		d.add(new Diagnosis(this, new String[]{"See your doctor or go to the emergency room right away. If your doctor diagnoses your problem as muscle spasm or a burner, use over-the counter medicine, such as acetaminophen or ibuprofen, to relieve pain, and apply heat to the sore area, as recommended by the doctor."})); // 3
		d.add(new Diagnosis(this, new String[]{"MUSCLE ACHES and SPASMS usually develop minutes to hours after an injury.","Use anti-inflammatory medicines, such as ibuprofen and aspirin, to relieve pain and discomfort, and apply heat to the sore area. See your doctor if your pain gets worse or lasts for several days without getting better."})); // 4
		d.add(new Diagnosis(this, new String[]{"Your symptoms may be from a simple viral illness or from MENINGITIS, a more serious infection around the brain.","EMERGENCYSee your doctor or go to the emergency room right away."})); // 5
		d.add(new Diagnosis(this, new String[]{"You may have a HERNIATED CERVICAL DISK, when part of the center portion of the spine presses against a nerve. It may also be from MUSCLE SPASM","See your doctor. Use over-the-counter medicine, such as acetaminophen or ibuprofen, to relieve pain, and apply heat to the sore area. If your symptoms came on suddenly, see your doctor right away."})); // 6
		d.add(new Diagnosis(this, new String[]{"Your pain is probably from MUSCLE SPASM, but also may be from RHEUMATOID ARTHRITIS, an inflammatory joint disease, or FIBROMYALGIA, a chronic condition affecting muscles and tendons.","Use anti-inflammatory medicines, such as ibuprofen or aspirin, and apply heat to the sore area. See your doctor if the pain or stiffness gets worse or doesn't get better."})); // 7
		d.add(new Diagnosis(this, new String[]{"Your pain may be from DEGENERATIVE CERVICAL ARTHRITIS, a disorder that affects the bones and cartilage in the neck.","Use anti-inflammatory medicines, such as ibuprofen or aspirin. See your doctor if the pain or stiffness gets worse or doesn't get better."})); // 8
		
		q.get(1).DefConn(q.get(2), q.get(4), "yes");
		q.get(2).DefConn(d.get(2), q.get(3), "no");
		q.get(3).DefConn(d.get(3), q.get(4), "no");
		q.get(4).DefConn(d.get(4), q.get(5), "no");
		q.get(5).DefConn(d.get(5), q.get(6), "no");
		q.get(6).DefConn(d.get(6), q.get(7), "no");
		q.get(7).DefConn(d.get(7), d.get(0), "no");

	}
}
