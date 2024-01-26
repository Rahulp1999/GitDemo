package Section07;



public class L21a_Threadextend extends Thread {
	public static void main(String[]args) {
	
		L21a_Threadextend thread = new L21a_Threadextend();
		
		thread.start();
		
		System.out.println("Outside of a thread");
		
	}
	
	//Overriding method hat belongs to the thraed calss
	
	public void run() {
		System.out.println("Inside of a thread");
	}
}
