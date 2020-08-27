
public class Cleaner extends PartTimeEmployee{
	private String assignedLocation;
	public Cleaner(String name, String address, int number, int hrsWorks, int hourlyRate, String assignedLocation){
	      super(name, address, number, hrsWorks, hourlyRate, assignedLocation);
	      setLocation(getLocation());
	      
	}
	public void setLocation(String Locate){
		assignedLocation = Locate;
	}
	public String getLocation(){
		return assignedLocation;
	}
	public void CleanerInformation(){
		System.out.println();
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
			System.out.println((computePay() + (ManageTime()*getRate())));
		}
		else{
			System.out.println((computePay()) +"\n");
		}
		System.out.println("Bonus: ");
		if(days>0){
			System.out.println(+((ManageTime()*getRate()))+"\n");
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
