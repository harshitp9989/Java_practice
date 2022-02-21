
class extra {
	static {
		System.out.println("We are inside extra class static block");
	}
}
public class StaticSample2 extends extra {
	
	static {
		System.out.println("We are inside main class static block");
	}
	public static void main(String args[])
	{
		System.out.println("We are inside main method");
		// StaticSample2 kk = new StaticSample2();
	}
}
