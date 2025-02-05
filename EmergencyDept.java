package Hospital;

public class EmergencyDept extends  HospitalDept{
	public static void calculateTreatment() {
		int baseFeePerDay = 2000;
		int Surcharge = 10000;
		
		System.out.println("Enter the No; of Days Patient Stays :");
		int numOfDays = sc.nextInt();
		
		
			System.out.println(" Is Patient treated in Emergency Room (Yes/No):");
			String Additionalsurcharge = sc.next();
			double TotalCost = baseFeePerDay * numOfDays;
		
			if (Additionalsurcharge.equals("Yes") ){
				 TotalCost =  TotalCost+Surcharge;
				 System.out.println(" Surcharge Fee :" + Surcharge);
			}
		double Tax = 120.0;
		System.out.println("-----Base Fee Per Day  : ------" + baseFeePerDay);
		System.out.println("------No of days Stayed : ------" + numOfDays);
		System.out.println("------Tax : ------" + Tax);
	System.out.println("Total Cost :" + TotalCost + Tax);
	System.out.println("           Thank You");
}
}