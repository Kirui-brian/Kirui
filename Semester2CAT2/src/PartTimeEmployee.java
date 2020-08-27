
public class PartTimeEmployee extends PartTime implements ManageWork{
	static final int minimumHours = 40;
	int extraHours;
	public PartTimeEmployee(String name, String address, int number, int hrsWorks, int hourlyRate, String assignedLocation){
          super(name, address, number, hrsWorks, hourlyRate, assignedLocation);
	}
	public double ManageTime(){
		extraHours = getHours() - minimumHours;
		return extraHours;
	}
}
