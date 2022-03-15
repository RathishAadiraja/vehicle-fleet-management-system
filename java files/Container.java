/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rathi
 */
public class Container extends CargoSpace {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private ContainerItem containerItem;

	/** 
	* @return the containerItem
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ContainerItem getContainerItem() {
		// begin-user-code
		return containerItem;
		// end-user-code
	}

	/** 
	* @param containerItem the containerItem to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setContainerItem(ContainerItem containerItem) {
		// begin-user-code
		this.containerItem = containerItem;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Container() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	@Override
	public void specify_cargoSpace_attributes() {
		// begin-user-code
		// TODO Auto-generated method stub

		System.out.print("Enter the container name: ");
		String container_name = Application.scan.nextLine();

		System.out.print("Enter the container length: ");
		String container_length = Application.scan.nextLine();

		System.out.print("Enter the container width: ");
		String container_width = Application.scan.nextLine();

		System.out.print("Enter the container height: ");
		String container_height = Application.scan.nextLine();

		System.out.print("Enter the container area: ");
		String container_area = Application.scan.nextLine();

		this.setName(container_name);
		this.setLength(container_length);
		this.setWidth(container_width);
		this.setHeight(container_height);
		this.setArea(container_area);

		// end-user-code
	}

	@Override
	public void view_cargoSpace_attributes() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Cargo Space of the vehicle");
		System.out.print("\nContainer name: " + this.getName());
		System.out.print("\nContainer length: " + this.getLength());
		System.out.print("\nContainer width: " + this.getWidth());
		System.out.print("\nContainer height: " + this.getHeight());
		System.out.print("\nContainer area: " + this.getArea());
		System.out.print("\n");
		
		if(getContainerItem() == null) {
			System.out.print("\nNo cargo is loaded in the cargo space\n");
		}else {
			containerItem.ViewCargoAttribues();
		}
		
		// end-user-code
	}

	@Override
	public void load_cargo() {
		// begin-user-code
		// TODO Auto-generated method stub
		ContainerItem ContainerItemCargo = new ContainerItem();
		ContainerItemCargo.SpecifyCargoAttributes();
		setContainerItem(ContainerItemCargo);
		//ContainerItemCargo.
		// end-user-code
	}
}