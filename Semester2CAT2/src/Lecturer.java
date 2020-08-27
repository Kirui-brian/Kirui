
public class Lecturer extends SalariedEmployee{
	private String courses;

	public Lecturer(String name, String address, String courses, int number, int daysWorked, double salary) {
		super(name, address, number, daysWorked, daysWorked, salary);
		setCourses(courses);
	}

	private void setCourses(String courses2) {
		courses =  courses2;	
	}

	public String getCourses() {
		return courses;
	}
	public void NetPay(){
		double days = ManageTime();
		String bonus;
		if (days>0){
			bonus = "YES";
		}
		else{
			bonus = "NO";
		}
		System.out.println("Employee Name: "+ getName()+"\nEmployee Type: Part Time Cleaner\n" + "Monthly Wage: ");
		if(days > 0){
			System.out.println(Math.ceil((computePay() + (ManageTime()*getSalary())/20)) +"\n");
		}
		else{
			System.out.println((computePay()) +"\n");
		}
		System.out.println("Bonus: ");
		if(days>0){
			System.out.println(+((ManageTime()*getSalary()))+"\n");
		}
		else{
			System.out.println(0);
		}
		System.out.println("Comments: ");
		if(bonus.equals("YES")){
			System.out.println("You have attained a bonus"+ManageTime()+"daysWorked");
		}
		else if(days<0){
			System.out.println("WARNING! You have no met the minimum working hours" + (days) * -1 + "hour(s)");
		}
		else{
			System.out.println("You have met the number of hours precisely");
		}
	}
}
