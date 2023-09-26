package daythirteentnsif.org;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In main...."+Thread.currentThread());
		ChildThread t1=new ChildThread();
		t1.run(); //Application become single threaded 
		t1.run();
		t1.run();

	}

}
