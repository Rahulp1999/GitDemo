package Section07;

public class L09_IFstatements {
	public static void main(String[]args) {
		
		ifExample();
		ifExample2();
		ifExample3();
	
	
    }
	
	public static void ifExample() {
		if(10>9) {
			System.out.println("10 is greater than 9");
		}
	}
	
	public static void ifExample2() {
		int hour=13;
		int midDay=12;
		
		if(hour>= midDay) {
			System.out.println("Good Afternoon");
		}
		else {
			System.out.println("Good Morning");
		}
	}
	
	public static void ifExample3() {
		int hour=19;
		int midDay=12;
		int afterNoon =18;
		
		if(hour>=midDay && hour<=afterNoon)
		{
			System.out.println("Good Afternoon");
		}
		else if(hour>=midDay  && hour>afterNoon)
		{
			System.out.println("Good Evening");
		}
		else
			System.out.println("Good Morning");
	}
		
}

