package composition;

public class PersonBodyMain {
	public static void main(String[] args) {
		int aadharNo = 7676;
		String name = "puri";
		Heart heart = new Heart("good pump", "good motor");
		Brain brain = new Brain("low nuerons", "average middillaAmblangeta");
		Lungs lungs = new Lungs("high", 2);
		
		PersonBody purnaBody = new PersonBody(aadharNo, name, heart, brain, lungs);
		
//		System.out.println(personBody);
		
		int aadharNo2 = purnaBody.getAadharNo();
		System.out.println(aadharNo2);
		
		String name2 = purnaBody.getName();
		System.out.println(name2);
		
		System.out.println("-----------Heart----------");
		Heart heart2 = purnaBody.getHeart();
		System.out.println(heart2.getPump());
		System.out.println(heart2.getMotor());
		
		System.out.println("---------Brain-----------");
		Brain brain2 = purnaBody.getBrain();
		System.out.println(brain2.getNueron());
		System.out.println(brain2.getMiddillaAmblangeta());
		
		System.out.println("-------------Lungs----------");
		Lungs lungs2 = purnaBody.getLungs();
		System.out.println(lungs2.getAirStorage());
		System.out.println(lungs2.getCapacity());
	}
}
