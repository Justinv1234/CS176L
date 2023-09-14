public class StudentTester {

	public static void main(String[] args) {
	
		Student justinVeltri = new Student("Justin Veltri", 70);
		justinVeltri.addQuiz(80);
		justinVeltri.addQuiz(100);
		justinVeltri.addQuiz(90);
		justinVeltri.addQuiz(100);
		
		System.out.println("Total Score: " + justinVeltri.getTotalScore());
		System.out.println("Your Name: " + justinVeltri.getName());
		System.out.println("Average Score: " + justinVeltri.getAverageScore());
		
		
	}

}
