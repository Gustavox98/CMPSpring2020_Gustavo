package week4;

public class week4 {
	public static void mian(String []args) {
		Scanner scanner = new Scanner( System.in);
		double userWeight;
		double userHeight;
		double bmi;
		
		System.out.println("Please enter your weight");
		userWeight = scanner.nextdouble();
		System.out.println("Please enter your height");
		userHeight = scanner.nextdouble();
		bmi = (userWeight * 703) /(userHeight * userHeight);
		if (bmi < 18.5) {
			System.out.println( "You are uderweight");
		} else if (bmi<26) {
			System.out.println("You have optimal weight");
		} else {
			
		}
	}

}
