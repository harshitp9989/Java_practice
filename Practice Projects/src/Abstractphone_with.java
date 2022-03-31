abstract class GeneralPhone{
	public abstract void showname(); // this line must be present ...Abstract class acts like a template
	int a = 10;
	public void yoyo() {
		System.out.println("This is yoyo...");
		}
	
}

class Iphne extends GeneralPhone
{
	int a = 99;
	public void showname() {
	System.out.println("This is Iphone...");
	a = 12345;
	}
}

class Samsng extends GeneralPhone
{
	int c = 55;
	public void showname() {
	System.out.println("This is Samsung...");
	}
}


public class Abstractphone_with {
	
	public static void show(GeneralPhone ll) 
	{
		ll.showname();
	}
	
	public static void main(String args[])
	{
		Iphne ii = new Iphne();
		System.out.println(ii.a);//  compare with line number 44
		Samsng ss = new Samsng();
		show(ii);
		System.out.println(ii.a);// compare with this line
		ii.yoyo();
		show(ss);	
	}
	
	
}
