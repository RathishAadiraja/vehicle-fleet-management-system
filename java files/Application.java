import java.util.*;

public class Application {

	public static final Scanner scan = new Scanner(System.in);
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private UserList userList;

	/** 
	* @return the userList
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public UserList getUserList() {
		// begin-user-code
		return userList;
		// end-user-code
	}

	/** 
	* @param userList the userList to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setUserList(UserList userList) {
		// begin-user-code
		this.userList = userList;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private VehicleList vehicleList;

	/** 
	* @return the vehicleList
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public VehicleList getVehicleList() {
		// begin-user-code
		return vehicleList;
		// end-user-code
	}

	/** 
	* @param vehicleList the vehicleList to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setVehicleList(VehicleList vehicleList) {
		// begin-user-code
		this.vehicleList = vehicleList;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void create_VehicleList() {
		// begin-user-code
		// TODO Auto-generated method stub
		VehicleList MyVehicleList = new VehicleList();
		MyVehicleList.specify_vehicle_list();
		setVehicleList(MyVehicleList);
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void create_UserList() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello World!");
		//System.out.println("Hello World! Again :)");

		Application MyApplication = new Application();
		MyApplication.create_VehicleList();

		boolean ask_user = true;
		while (ask_user) {
			System.out.println("\nChoose the following options\n");
			System.out.println(
					"1. To cerate vehicle\n2. To modify vehicle\n3. To remove vehicle\n4. View all vehicles\n5. Load cargo in vehicle cargo space\n6. Exit\n");

			System.out.print("\nEnter the number: ");
			int to_do = scan.nextInt();
			scan.nextLine();

			if (to_do == 1) {
				MyApplication.create_vehicle();
			} else if (to_do == 2) {
				MyApplication.modify_vehicle();
			} else if (to_do == 3) {
				MyApplication.remove_vehicle();
			} else if (to_do == 4) {
				MyApplication.view_all_vehicles();
			} else if (to_do == 5) {
				MyApplication.load_cargo_in_vehicle_cargo_space();
			} else if (to_do == 6) {
				System.out.print("Exiting from the application...\n");
				ask_user = false;
				break;
			} else {
				System.out.print("Oops, thats not a valid option\n");
			}
		}
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void show_main_page() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void create_vehicle() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.println("Creating vehicle...\n");
		vehicleList.create_vehicle();
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void add_user() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void remove_user() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void view_all_users() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void find_user() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void modify_user() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void modify_vehicle() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void view_all_vehicles() {
		// begin-user-code
		// TODO Auto-generated method stub
		vehicleList.view_all_vehicles();
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void find_vehicle() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void remove_vehicle() {
		// begin-user-code
		// TODO Auto-generated method stub
		vehicleList.remove_vehicle();
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void load_cargo_in_vehicle_cargo_space() {
		// begin-user-code
		// TODO Auto-generated method stub
		vehicleList.load_cargo_in_vehicle_cargo_space();
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void connect_vehicles() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

}

/*
boolean is_valid_int = false;
while(!is_valid_int) {
	System.out.print("\nEnter the number: ");
	String to_do_str = scan.nextLine();
    try{
        to_do = Integer.parseInt(to_do_str);
        System.out.println(to_do);
        is_valid_int = true;
        break;
    }
    catch (NumberFormatException ex){
    	System.out.print("\nOops, thats not a number!!!");
    }
}

*/
