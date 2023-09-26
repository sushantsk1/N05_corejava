package daythirteentnsif.org;

public class RunnableDemo {

	public static void main(String[] args) {
		
		ThreadImpl implObj = new ThreadImpl();
		Thread threadOne = new Thread(implObj);
		threadOne.start();
		
	}

}
