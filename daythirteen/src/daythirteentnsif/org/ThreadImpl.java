package daythirteentnsif.org;

public class ThreadImpl implements Runnable {
	@Override
	public void run() {
		for(int i=1; i<=50; i++) {
			System.out.print(i+"\t");
		}
	}
}
