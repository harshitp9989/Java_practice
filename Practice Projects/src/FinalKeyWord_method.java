
class PersonalDetails
{
	public void phone()
	{
		System.out.println("8639686104");
	}
	
	public final void password() 
	{
		System.out.println("9999");
	}
}

class Virus extends PersonalDetails
{
	
//	public final void password() 
//	{
//		System.out.println("9999");
//	}
// overriding isnt possible, it results in an error. However the Virus class can still access methods of PersonalDetails
}

public class FinalKeyWord_method {
	
	public static void main(String Args[])
	{
	Virus ff = new Virus();
	ff.phone();
	ff.password();
	}
}
