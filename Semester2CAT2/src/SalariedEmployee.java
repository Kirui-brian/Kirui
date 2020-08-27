
public class SalariedEmployee extends Salary implements ManageWork{
	private final int minimumDays = 200;
	private int daysWorked;
	private int extraDays;
	
	public SalariedEmployee(String name, String address, int number, int extraDays, int daysWorked, double salary) {
		super(name, address, number, salary);
		setdaysWorked(daysWorked);
	}

	private void setdaysWorked(int daysWorked2) {
		daysWorked = daysWorked2;
	}
	public int getdaysWorked(){
		return daysWorked;
	}
	public double ManageTime(){
		extraDays = getdaysWorked()-minimumDays;
		return extraDays;
	}
}