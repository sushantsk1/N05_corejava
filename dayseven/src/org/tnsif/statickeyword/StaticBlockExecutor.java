package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	
      static float salary;
      String companyName;
      
      /*staic block is used to initialize the static variable we
       * can't assign a value for any non-static variable inside
       * the static block*/
      static
      {
    	 // companyname="Accenture";
    	  salary =56787.6f;
      }
      //static method
      static void print()
      {
    	  System.out.println(salary);
      }
	public static void main(String[] args) {
		
		print();

	}

}
