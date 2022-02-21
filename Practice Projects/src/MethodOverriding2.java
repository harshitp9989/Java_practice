
class Bike{
	void run() {
		System.out.println("running");
	}
}

class Splendor extends Bike{
	void run() {
		System.out.println("running on Splender");
	}
}
public class MethodOverriding2 {
	
	public static void main(String args[])
	{
	Splendor b1 = new Splendor();
	b1.run();
	
	Bike b2 = new Bike();
	b2.run();
	
	Bike b3 = new Splendor();
	b3.run();
	}
	
}
