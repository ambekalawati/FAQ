package variable;

public class Student {
	private double marks1,marks2,marks3;
	private double maxMarks = 100;
	public double getAverage () {
		double avg = 0;
		avg = (( marks1+marks2+marks3)/(maxMarks*3)) * 100;
		return avg;
	}


}
