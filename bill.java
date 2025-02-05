package Hospital;

import java.util.Scanner;

public class bill {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Select the Option \n 1.HospitalDept \n 2.EmergencyDept \n 3.SurgeryDept \n 4.GeneralConsultationDep ");
	switch(HospitalDept.sc.nextInt()) {
	case 1:
		
	HospitalDept h= new HospitalDept();
	h.calculateTreatment();
	break;
	
	case 2:
		
	EmergencyDept e = new EmergencyDept();
	e.calculateTreatment();
	break;
	 
	case 3:
		
	SurgeryDept s = new SurgeryDept();
	s.calculateTreatment();
	break;
	
	case 4:
		
	GeneralConsultationDept g= new GeneralConsultationDept();
	g.calculateTreatment();
	break;
	
	default:
		System.out.println("Invalid Input");
}
}
}