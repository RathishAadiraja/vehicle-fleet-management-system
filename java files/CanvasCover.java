
/**
 * 
 */

import java.util.Set;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author rathi
 */
public class CanvasCover extends CargoSpace {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Set<PackageCargo> _package;

	/** 
	* @return the _package
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Set<PackageCargo> get_package() {
		// begin-user-code
		return _package;
		// end-user-code
	}

	/** 
	* @param _package the _package to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void set_package(Set<PackageCargo> _package) {
		// begin-user-code
		this._package = _package;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Object num_of_packages;

	/** 
	* @return the num_of_packages
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public Object getNum_of_packages() {
		// begin-user-code
		return num_of_packages;
		// end-user-code
	}

	/** 
	* @param num_of_packages the num_of_packages to set
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void setNum_of_packages(Object num_of_packages) {
		// begin-user-code
		this.num_of_packages = num_of_packages;
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public CanvasCover() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void SpecifyNumOfPackages() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void CreatePackageSet() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void ModifyPackageSet() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void RemovePackageSet() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void ViewPackageSet() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void LoadPackageSet() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void CreatePackage() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void ModifyPackage() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void RemovePackage() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void ViewPackage() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	@Override
	public void specify_cargoSpace_attributes() {
		// begin-user-code
		// TODO Auto-generated method stub

		System.out.print("Enter the canvas cover name: ");
		String canvas_cover_name = Application.scan.nextLine();

		System.out.print("Enter the canvas cover length: ");
		String canvas_cover_length = Application.scan.nextLine();

		System.out.print("Enter the canvas cover width: ");
		String canvas_cover_width = Application.scan.nextLine();

		System.out.print("Enter the canvas cover height: ");
		String canvas_cover_height = Application.scan.nextLine();

		System.out.print("Enter the canvas cover area: ");
		String canvas_cover_area = Application.scan.nextLine();

		this.setName(canvas_cover_name);
		this.setLength(canvas_cover_length);
		this.setWidth(canvas_cover_width);
		this.setHeight(canvas_cover_height);
		this.setArea(canvas_cover_area);

		// end-user-code
	}

	@Override
	public void view_cargoSpace_attributes() {
		// begin-user-code
		// TODO Auto-generated method stub
		System.out.print("Canvas-cover name: " + this.getName());
		System.out.print("\nCanvas-cover length: " + this.getLength());
		System.out.print("\nCanvas-cover width: " + this.getWidth());
		System.out.print("\nCanvas-cover height: " + this.getHeight());
		System.out.print("\nCanvas-cover area: " + this.getArea());
		System.out.print("\n");
		// end-user-code
	}
}