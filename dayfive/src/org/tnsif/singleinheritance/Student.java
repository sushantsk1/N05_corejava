package org.tnsif.singleinheritance;

public class Student extends Citizen {
	
	//private data members;
	private int rollno;
     private String collegeName;
     public Student()
     {
    	 super();
    	 System.out.println("Child class-default constructor");
     }
     
	public Student(int pincode, long aadharNo, long contactNo, 
			String city, int rollno, String collegeName) {
		super(pincode, aadharNo, contactNo, city);
		// TODO Auto-generated constructor stub
		this.rollno=rollno;
	    this.collegeName=collegeName;
				
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
     
     
	
	
     
}
