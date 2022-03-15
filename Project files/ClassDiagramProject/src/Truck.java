//import java.util.*;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rathi
 */
public class Truck extends EngineVehicle {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Trailer[] trailer = null;

	/** 
	* @return the trailer
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Trailer[] getTrailer() {
		// begin-user-code
		return trailer;
		// end-user-code
	}

	/** 
	* @param trailer the trailer to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setTrailer(Trailer[] trailer) {
		// begin-user-code
		this.trailer = trailer;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private CargoSpace cargoSpace;

	/** 
	* @return the cargoSpace
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public CargoSpace getCargoSpace() {
		// begin-user-code
		return cargoSpace;
		// end-user-code
	}

	/** 
	* @param cargoSpace the cargoSpace to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setCargoSpace(CargoSpace cargoSpace) {
		// begin-user-code
		this.cargoSpace = cargoSpace;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Truck() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void specify_truck_cargoSpace() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.println("\nSpecify the cargosapce of truck\n");
		System.out.println("Choose from the following options\n");
		System.out.println("1. Canvas cover\n2. Container\n3. Cistern\n");

		boolean cargo_space_specified = false;
		while (!cargo_space_specified) {
			System.out.print("Enter the number: ");
			int cargospace = Application.scan.nextInt();
			Application.scan.nextLine();

			if (cargospace == 1) {
				create_truck_canvasCover();
				cargo_space_specified = true;
				break;
			} else if (cargospace == 2) {
				create_truck_container();
				cargo_space_specified = true;
				break;
			} else if (cargospace == 3) {
				create_truck_cistern();
				cargo_space_specified = true;
				break;
			} else {
				System.out.print("Oops, thats not a valid option\n");
			}
		}
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void modify_truck_cargoSpace() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void create_truck_canvasCover() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.println("Canvas cover creating...\n");

		CanvasCover TruckCanvasCover = new CanvasCover();
		TruckCanvasCover.specify_cargoSpace_attributes();
		setCargoSpace(TruckCanvasCover);

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void create_truck_container() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.println("Container creating...\n");

		Container TruckContainer = new Container();
		TruckContainer.specify_cargoSpace_attributes();
		setCargoSpace(TruckContainer);

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void create_truck_cistern() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.println("Cistern creating...\n");
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void load_truck_cargo() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void check_truck_cargoSpace() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void connect_trailer() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	@Override
	public void specify_vehicle_attributes() {
		// begin-user-code
		// TODO Auto-generated method stub

		System.out.print("Enter the vehicle name: ");
		String vehicle_name = Application.scan.nextLine();

		System.out.print("Enter the vehicle id: ");
		int vehicle_id = Application.scan.nextInt();
		Application.scan.nextLine();

		System.out.print("Enter the number of wheels of the vehicle: ");
		int num_of_wheels = Application.scan.nextInt();
		Application.scan.nextLine();

		System.out.print("Enter the engine name: ");
		String engine_name = Application.scan.nextLine();

		this.setName(vehicle_name);
		this.setVehicle_id(vehicle_id);
		this.setNumber_of_wheels(num_of_wheels);
		this.setEngine(engine_name);
		// end-user-code
	}

	@Override
	public void view_vehicle() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("\nVehicle name: " + this.getName());
		System.out.print("\nVehicle ID: " + this.getVehicle_id());
		System.out.print("\nNumber of wheels: " + this.getNumber_of_wheels());
		System.out.print("\nEngine name: " + this.getEngine());
		System.out.print("\n\n");

		cargoSpace.view_cargoSpace_attributes();
		

		// end-user-code
	}

	@Override
	public void load_vehicle_cargo() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("\nLoading truck cargo...\n");
		cargoSpace.load_cargo();
		// end-user-code
	}
}