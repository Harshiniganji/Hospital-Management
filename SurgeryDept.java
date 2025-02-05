package Hospital;

public class SurgeryDept extends HospitalDept{
	public static void calculateTreatment() {
		int baseFeePerDay =5000;
		int SpecialEquipment = 3000;
		
		System.out.println("Enter the no: of Days Patients Stays : ");
		int numOfDays = sc.nextInt();
		
		System.out.println("Does Surgery Requires any Special Equipment (Yes/No): ");
		String equipmentRequired  = sc.next();
		double TotalCost = baseFeePerDay * numOfDays;
		if (equipmentRequired.equals("Yes") ){
			 TotalCost =  TotalCost+SpecialEquipment;
		}
		double Tax = 560.0;
		System.out.println("Total Surgery Cost is :" + TotalCost);
		System.out.println("Thank You");
}
}