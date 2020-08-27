
public class PartTime extends Employee{
int hrsWorks;
double hourlyRate;
int extraHours;
double monthlyPay;
public PartTime(String name, String address, int number, int hrsWorks, int hourlyRate, String assignedLocation){
	super(name, address,number);
	this.hrsWorks=hrsWorks;
	this.hourlyRate=hourlyRate;
	//this.extraHours=extraHours;
	}
public int getHours(){
	return hrsWorks;
}
public double getRate(){
	return hourlyRate;
}

	public void mailCheck(){
		if(hrsWorks>=40){
			System.out.println("You have been awarded a bonus");
			System.out.println("Mailing a check to" + getName() + "" + "monthly pay for parttime employee" + hrsWorks);
		
		}else
		{
			System.out.println("Warning no bonus for you");
			System.out.println("Mailing a check to" + getName() + "monthly pay for parttime employee" + hrsWorks);
		}
	}
	public double computePay(){
		return monthlyPay=hrsWorks*hourlyRate;
	}
	
}

