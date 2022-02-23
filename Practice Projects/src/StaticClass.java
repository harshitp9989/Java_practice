class AnotherClass {
	static int count=0;
	static void p()
	{
		//int static insideVar =0;
		//We can't declare a static variable inside a method, static means that it's a variable/method of a class, it belongs to the whole class but not to one of its certain objects. This means that static keyword can be used only in a 'class scope' i.e. it doesn't have any sense inside methods.
		count++;
		if(count<5)
		{
			System.out.println("Hello "+ count);
			p();
		}
	}
	
	static void q()
	{
		System.out.println(++count);
	}
}

 public class StaticClass
{
	public static void main(String args[])
	{
		AnotherClass.p();
		AnotherClass.q();
		//System.out.println(count);   gives error
	}
}

