package org.tnsif.singleinheritance;
//base class
public class Citizen {
	
	  //private data members
	private String city;
	private int pincode;
    private long aadharNo;
    private long contactNo;
    
    //default
    public Citizen()
    {
    	super();
    	System.out.println("Default Constructor");
    }
    
     
	public Citizen(int pincode, long aadharNo, long contactNo, String city ) {
		super();
		this.pincode = pincode;
		this.aadharNo = aadharNo;
		this.contactNo = contactNo;
		this.city = city;
		System.out.print("Parameterized constructor");
	}
	


      public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	@Override
	public String toString() {
		return "Citizen [pincode=" + pincode + ", aadharNo=" + aadharNo + ", contactNo=" + contactNo + ", city=" + city
				+ "]";
	}
	
	
}
