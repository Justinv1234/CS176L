public class Student {
	String Name;
	int totalQuizScore;
	int numOfQuizzes = 1;
	
	public Student(String initName, int initTotalQuizScore) {
		Name = initName;
		totalQuizScore = initTotalQuizScore;
	}
	
	public String getName() {
		return Name;
	}
	
	public void addQuiz(int score) {
		totalQuizScore += score;
		numOfQuizzes++;
	}
	
	public int getTotalScore() {
		return totalQuizScore;
	}
	
	public double getAverageScore() {
		return (totalQuizScore/numOfQuizzes);
	}
	
}
