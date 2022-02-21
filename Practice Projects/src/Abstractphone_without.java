class Iphone
{
	public void showname() {
	System.out.println("This is Iphone...");
	}
}

class Samsung
{
	public void showname() {
	System.out.println("This is Samsung...");
	}
}

public class Abstractphone_without {
	public static void main(String args[])
	{
		Iphone ii = new Iphone();
		Samsung ss = new Samsung();
		show(ii);
		show(ss);
	
		
	}
	
	public static void show(Iphone ll) {
		ll.showname();
	}
	
	public static void show(Samsung pp) {
		pp.showname();
	}
}
