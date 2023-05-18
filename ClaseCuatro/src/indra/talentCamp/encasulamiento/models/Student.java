package indra.talentCamp.encasulamiento.models;

public class Student extends Person {
//	private String name;
//	private int document;
//	private  String address;
	private boolean prefersFrontEnd;
	
	public Student(String name, int document, String address) {
//		this.name = name;
//		this.document = document;
//		this.address = address;
		super(name, document, address);
		this.prefersFrontEnd = false; //inicializando un atributo con un valor por defecto
	}
	
	public Student(String name, int document, String address, boolean prefersFrontEnd) {
//		this.name = name;
//		this.document = document;
//		this.address = address;
		super(name, document, address);
		this.prefersFrontEnd = false; //inicializando un atributo con un valor por defecto
	}
//	public String getName() { //read only
//		return this.name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}

//	public int getDocument() {
//		return document;
//	}
// el document también es readonly
//	public void setDocument(int document) {
//		this.document = document;
//	}

//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}

	public boolean getPrefersFrontEnd() {
		return prefersFrontEnd;
	}

	public void setPrefersFrontEnd(boolean prefersFrontEnd) {
		this.prefersFrontEnd = prefersFrontEnd;
	}

	@Override
	public String toString() {
		  return String.format("%s (%d) \n [%s] \n %s", 
	                this.getName(),
	                this.getDocument(),
	                this.getAddress(),
	                (this.prefersFrontEnd ? "Entusiasta de FontEnd" : "Fantatico backend"));
	}
	
}
