/* File name : VirtualDemo.java */
public class VirtualDemo
{
 public static void main(String [] args)
 {
 /*
 Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
 Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
 System.out.println("Call mailCheck using Salary reference --");
 s.mailCheck();
 System.out.println("\nCall mailCheck using Employee reference--");
 e.mailCheck();
 */
	 Lecturer lecturer1 = new Lecturer("Banz Mashal", "Cheptuech, 30", "Thermofluids", 5, 0, 97000.00);
	 Lecturer lecturer2 = new Lecturer("Nok Pyegi", "Runda, 54", "Dynamics", 7, 4, 76000.00);
	 Lecturer lecturer3 = new Lecturer("Kulal Maish", "London, 6", "Programming", 9, 6, 51000.00);
	 Lecturer lecturer4 = new Lecturer("Jadero Kaingi", "New Yok, 23", "Communication",2, 8, 69000.00);
	 Lecturer lecturer5 = new Lecturer("Dirac Lenol", "Oxford, 45", "Physics", 4, 2, 43000.00);
	     lecturer1.NetPay();
	     System.out.println("");
	     lecturer2.NetPay();
	     System.out.println("");
	     lecturer3.NetPay();
	     System.out.println("");
	     lecturer4.NetPay();
	     System.out.println("");
	     lecturer5.NetPay();
	     System.out.println("");
	     
	 Cleaner cleaner1 = new Cleaner("Job Weby", "RT456", 900, 43, 30, "Hostel");
	 Cleaner cleaner2 = new Cleaner("Doe Jane", "FT987", 1700, 50, 30, "Offices");
	 Cleaner cleaner3 = new Cleaner("John Wick", "UT896", 1200, 36, 30, "Wash rooms");
	 Cleaner cleaner4 = new Cleaner("Mary Magda", "BT123", 500, 23, 30, "Verandah");
	 Cleaner cleaner5 = new Cleaner("July June", "IV234", 1900, 69, 30, "Corridors");
	     cleaner1.NetPay();
	     System.out.println("\n");
	     cleaner2.NetPay();
	     System.out.println("\n");
	     cleaner3.NetPay();
	     System.out.println("\n");
	     cleaner4.NetPay();
	     System.out.println("\n");
	     cleaner5.NetPay();
	     System.out.println("\n");




 }
} 