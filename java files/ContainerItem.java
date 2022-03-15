/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rathi
 */
public class ContainerItem extends Cargo {

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public ContainerItem() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	@Override
	public void SpecifyCargoAttributes() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Enter the container item name: ");
		String container_item_name = Application.scan.nextLine();

		System.out.print("Enter the container item size: ");
		String container_item_size = Application.scan.nextLine();

		this.setName(container_item_name);
		this.setSize(container_item_size);

		// end-user-code
	}
	
	@Override
	public void ViewCargoAttribues() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("\nCargo loaded in the vehicle");
		System.out.print("\nContainer item name: " + this.getName());
		System.out.print("\nContainer item size: " + this.getSize());
		System.out.print("\n\n");
		// end-user-code
	}
}