package Section07;



public class L21b_Threadimplement implements Runnable {
	public static void main(String[]args) {
	
		L21b_Threadimplement thread = new L21b_Threadimplement();
		Thread threadObject = new Thread(thread);
		threadObject.start();
		
		System.out.println("Outside of a thread");
		
	}
	
	//Overriding method hat belongs to the thraed calss
	
	public void run() {
		System.out.println("Inside of a thread");
	}
}
