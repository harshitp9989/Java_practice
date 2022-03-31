
class Hello{
	static int kk = 12;
	static void method1() {
		int pi=22;
		int r=10;
		System.out.println(pi + " " + r);
	}
}

public class StaticClass1
{
	static void method1() {
		int pi=122;
		int r=110;
		System.out.println(pi + " " + r);
	}
	
	public static void main(String args[])
	{
		System.out.println(Hello.kk);
		Hello.method1();
		method1();
		StaticClass1.method1(); // line no 23 and 24 return the same

	}
}
