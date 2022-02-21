abstract class GeneralPhone{
	public abstract void showname(); // this line must be present ...Abstract class acts like a template
	
	public void yoyo() {
		System.out.println("This is yoyo...");
		}
	
}

class Iphne extends GeneralPhone
{
	public void showname() {
	System.out.println("This is Iphone...");
	}
}

class Samsng extends GeneralPhone
{
	public void showname() {
	System.out.println("This is Samsung...");
	}
}


public class Abstractphone_with {
	
	public static void main(String args[])
	{
		Iphne ii = new Iphne();
		Samsng ss = new Samsng();
		show(ii);
		ii.yoyo();
		show(ss);	
	}
	
	public static void show(GeneralPhone ll) {
		ll.showname();
	}
}
