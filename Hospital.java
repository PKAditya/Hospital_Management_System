package Project.src;

import java.util.*;

public class Hospital {
    public static void main() 
    {
        System.out.println("Which category do you want to choose?\n1. Doctor\n2. Patient\n3. Nurse\n4. Equipment\n5. Medicine\n6. Patient Records\n7. Parking Lot");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println(" Class For Doctor");
                Doctor.run();
                break;
            case 2: 
                System.out.println("Class For Patient");
                Patient.run();
                break;
            case 3:
                 System.out.println("Class For Nurses");
                 Nurses.run();
                break;
            case 4:
                System.out.println("Class For Equipment");
                Equipment.run();
                break;
            case 5:
                System.out.println("Class for Medicines");
                Medicines.run();
                break;
                
            case 6:
                System.out.println("Class by Patient_Record");
                PatientRecord.run();
                break;
                
            case 7:
                System.out.println("Class by Parking_Lot");
                try {
                    ParkingLot.run();
                } catch (Exception e) {
                }
                break;
            default: 
                System.out.println("Invalid Choice");
        }
    }
}
